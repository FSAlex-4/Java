
public class Caneta{
    String modelo;
    String cor;
    float ponta;
    int tinta;
    boolean tampada;
    
     boolean podeEscrever(){
        return tinta > 0 && !tampada;
    }
    void status(){
        System.out.println("A caneta é " + this.cor );
        System.out.println("Ela é do modelo " + this.modelo);
        System.out.println("Da ponta " + this.ponta);
        System.out.println("A tinta dela eu diria que está uns " + this.tinta + "%");
        System.out.println("Ela está tampada? " + this.tampada);
    }
   public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Como é que tu vai rabisdcar com a caneta tampada meu nobre??Se pá destampar primeiro ajuda...");
        } else{
            System.out.println("Rasbicando...");
        }
    }
     void tampar(){
        this.tampada = true;
    }
     void destampar(){
        this.tampada = false;
    }
}
