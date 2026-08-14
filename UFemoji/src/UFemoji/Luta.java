package UFemoji;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 !=l2){
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
    public void lutar(){
        if(this.aprovada = true){
                System.out.println("#### DESAFIADO ####");
                this.desafiado.apresentar();
                System.out.println("##### DESAFIANTE ####");
                this.desafiante.apresentar();
                Random aleatorio= new Random();
                int vencedor = aleatorio.nextInt(3); // 0 1 2
                switch(vencedor){
                        case 0:   //Empate
                            System.out.println("Empatou");
                            this.desafiado.empatarLuta();
                            this.desafiante.empatarLuta();
                                break;
                        case 1: //Desafiado vence
                            System.out.println("Impressionante agentou o cahmado e fez seu nome Ladys and gentlemans nosso campeão da noite foi " +  this.desafiado);
                            this.desafiado.ganharLuta();
                            this.desafiante.perderLuta();
                                break;
                        case 2: //Desafiante vence
                            System.out.println("Ele iniciou e terminou o decidiu enfretar o GRANDE campẽao é ELEEEEEE " + this.desafiante);
                            this.desafiado.perderLuta();
                            this.desafiante.ganharLuta();
                                break;
                }
        } else{
            System.out.println("A luta não pode acontecer");
        }

    }
    //Métodos Especias
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
