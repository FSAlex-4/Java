package UFemoji;

public class Lutador implements interLuta  {
   //Atributos

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //Metodos Publicos:
      @Override
    public void apresentar() {
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Ladys and gentlemans venho aqui nessa tarde noite manhã seja qual for o horário que esteja vendo esse evento.");
            System.out.println("ELEEEEEEEEE!!!!");
            if("Leve".equals(getCategoria())){
                    System.out.println("Veloz como um foguete vencedor do melhor cosplay do Flash da história, mau conseguimos tirar a foto pra esse evento o velozzzz!!....OOOooo " + this.getNome());
            }  else if("Médio".equals(getCategoria())){
                    System.out.println("Nem muito e nem pouco.Essssbaaaaaaanjando habilidade e técnica. Alguns diria que está na medida certa ooooo HA-BI-LI-DO-SO " + this.getNome());
            } else if("Pesado".equals(getCategoria())){
                    System.out.println("O Magnânimo Alma GIGANTEEEESSSCA!!!!!....Dizem que de longe aparenta ser grande e de perto parece que tá de longe.O perigo das balanças o MONSTRO " + this.getNome());
            }
            if(getNacionalidade().endsWith("a")){
                    System.out.println("Saindo diretamente das entranhas da " + getNacionalidade());
            } else{
                    System.out.println("Saindo diretamente das entranhas do " + getNacionalidade());
            }
            System.out.println("Com apenas " + getIdade() + " anos");
            System.out.println("Medindo nada mais nada menos que " + getAltura() + "m de altura");
            System.out.println("Pensando incríveis " + getPeso() + "Kg");
            System.out.println("Tendo vecido num total de " + getVitorias() + " e perdido apenas " + getDerrotas());
            System.out.println("Carregando apenas  " + getEmpates() + " empates nas costas!!!");
    }
    @Override
    public void status() {
            System.out.println(getNome());
            System.out.println("Peso: " + getCategoria());
            System.out.println(getVitorias() + " vitórias");
            System.out.println(getDerrotas() + " derrotas");
            System.out.print(getEmpates() + " empates");
    }
    @Override
    public void ganharLuta() {
            this.setVitorias(this.getVitorias() + 1);
    }
    @Override
    public void perderLuta() {
            this.setDerrotas(this.getDerrotas() + 1);
    }
    @Override
    public void empatarLuta() {
            this.setEmpates(this.getEmpates() + 1);
    }
    //Metodos Especiais:
    public Lutador(String no, String na,int ida, float al, float pe, int vi,
            int der, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = ida;
        this.altura = al;
        this.setPeso(pe); 
       // this.categoria = categoria;
        this.vitorias = vi;
        this.derrotas = der;
        this.empates = emp;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public  int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
            this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
            if(peso<52.2){
                    this.categoria = "Invalido";
            } else if(this.peso<=70.3){
                    this.categoria = "Leve";
             } else if(this.peso<=83.9){
                    this.categoria = "Médio";
             } else if(this.peso<=120.2){
                    this.categoria = "Pesado";
              } else{
                    this.categoria = ("inválido");
              } 
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
  
}
