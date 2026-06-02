public class Agenda {
    String modelo;
    String cor;
    int paginas;
    boolean  fechada;
    void status(){
        System.out.println("A agenda é " + this.cor);
        System.out.println("Ela é do modelo " + this.modelo);
        System.out.println("Ela tem " + this.paginas + " páginas");
        System.out.println("Ela está fechada? " + this.fechada);
    }
    void abrir(){
        this.fechada = false;
    }
    void fechar(){
        this.fechada = true;
    }
    void folhear(){
        if(this.fechada){
            System.out.println("Você precisa abrir a agenda para folhear ela, meu nobre...");
        } else {
            System.out.println("Folheando...");
        }
        }
    void anotar(Caneta c1){
        if(c1.podeEscrever()){
            if(this.fechada == false){
                System.out.println("Anotando...");
            } else{
                System.out.println("Você precisa abrir a agenda primeiro...");
            }
            } else{
                System.out.println("Sem tinta e tampada fica meio difícil né...");
            }
        }
        }
    
    

