package UFemoji;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("A luta não pode acontecer");
        }

    }

    // Cáculo de FORÇA DE COMBATE
    public float calculoPoder(Lutador lutador) {
        float experiencia = (lutador.getVitorias() * 2.0f)
                + (lutador.getEmpates() * 0.5f) +
                (lutador.getDerrotas() * 0.5f);

        float diferencaAltura = Math.abs(this.desafiado.getAltura() - this.desafiante.getAltura());
        float vantagemAltura = 0;

        if (diferencaAltura >= 0.10f && diferencaAltura < 0.20f) {

            vantagemAltura = 1;

        } else if (diferencaAltura >= 0.20f && diferencaAltura < 0.30f) {

            vantagemAltura = 2;

        } else if (diferencaAltura >= 0.30f) {

            vantagemAltura = 3;
        }
        float diferencaPeso = Math.abs(this.desafiado.getPeso() - this.desafiante.getPeso());
        float vantagemPeso = 0;

        if (lutador == desafiado) {

            if (desafiado.getPeso() > desafiante.getPeso()) {
                vantagemPeso = 1;
            }

        } else if (lutador == desafiante) {

            if (desafiante.getPeso() > desafiado.getPeso()) {
                vantagemPeso = 1;
            }
        }

   float forca = lutador.getforca();
float velocidade = lutador.getVelocidade();
float tecnica = lutador.getTecnica();

// Vamos calcular a letalidade dos estilos depois
float letalidade = 0;


// Bônus por categoria
if (lutador.getCategoria().equals("Pesado")) {

    forca *= 1.10f;
    velocidade *= 0.95f;

} else if (lutador.getCategoria().equals("Leve")) {

    forca *= 0.95f;
    velocidade *= 1.10f;
}


// Percorre todos os estilos do lutador
for (Skill estilo : lutador.getEstilos()) {

    // Pesado + Judô
    if (lutador.getCategoria().equals("Pesado")
            && estilo.getNome().equals("Judô")) {

        forca *= 1.10f;
        tecnica *= 1.05f;
    }


    // Médio + Capoeira
    if (lutador.getCategoria().equals("Médio")
            && (estilo.getNome().equals("Capoeira")
            || estilo.getNome().equals("Capoeira Carioca"))) {

        velocidade *= 1.20f;
        tecnica *= 1.05f;
    }


    // Altura + Taekwondo
    if (lutador.getAltura() >= 1.80f
            && estilo.getNome().equals("Taekwondo")) {

        velocidade *= 1.10f;
        tecnica *= 1.15f;
    }


    // Médio + Karatê ou Boxe Chinês
    if (lutador.getCategoria().equals("Médio")
            && (estilo.getNome().equals("Karatê")
            || estilo.getNome().equals("Boxe Chinês"))) {

        forca *= 1.22f;
        tecnica *= 1.60f;
        velocidade *= 1.10f;
    }


    // Leve + Kickboxing ou Ninjutsu
    if (lutador.getCategoria().equals("Leve")
            && (estilo.getNome().equals("Kickboxing")
            || estilo.getNome().equals("Ninjutsu"))) {

        velocidade *= 1.051f;
        tecnica *= 1.05f;
    }


    // Soma a letalidade de cada estilo
    letalidade += estilo.getLetalidade();
}


// Poder final
float poder = (forca * 0.35f)
        + (velocidade * 0.25f)
        + (tecnica * 0.30f)
        + (letalidade * 0.10f);


poder += experiencia;
poder += vantagemPeso;
poder += vantagemAltura;

return poder;
    }

    public void lutar() {
        if (!this.aprovada) {
            System.out.println("A luta não pode acontecer");
            return;
        }
        System.out.println("#### DESAFIADO ####");
        this.desafiado.apresentar();

        System.out.println("##### DESAFIANTE ####");
        this.desafiante.apresentar();

        float poderDesafiado = calculoPoder(this.desafiado);
        float poderDesafiante = calculoPoder(this.desafiante);

        System.out.println("Poder do desafiado: " + poderDesafiado);
        System.out.println("Poder do desafiante: " + poderDesafiante);
        if (poderDesafiado > poderDesafiante) {

            System.out.println("O vencedor é "
                    + this.desafiado.getNome());

            this.desafiado.ganharLuta();
            this.desafiante.perderLuta();

        } else if (poderDesafiante > poderDesafiado) {

            System.out.println("O vencedor é "
                    + this.desafiante.getNome());

            this.desafiante.ganharLuta();
            this.desafiado.perderLuta();

        } else {

            System.out.println("A luta terminou empatada!");

            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
        }

        // Random aleatorio= new Random();
        // int vencedor = aleatorio.nextInt(3); // 0 1 2
        // switch(vencedor){
        // case 0: //Empate
        // System.out.println("Empatou");
        // this.desafiado.empatarLuta();
        // this.desafiante.empatarLuta();
        // break;
        // case 1: //Desafiado vence
        // System.out.println("Impressionante agentou o cahmado e fez seu nome Ladys and
        // gentlemans nosso campeão da noite foi " + this.desafiado);
        // this.desafiado.ganharLuta();
        // this.desafiante.perderLuta();
        // break;
        // case 2: //Desafiante vence
        // System.out.println("Ele iniciou e terminou o decidiu enfretar o GRANDE
        // campẽao é ELEEEEEE " + this.desafiante);
        // this.desafiado.perderLuta();
        // this.desafiante.ganharLuta();
        // break;
    }

    // Métodos Especias
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

}
