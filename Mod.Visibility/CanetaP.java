public class CanetaP {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
    void status(){
        System.out.println("A caneta é " + this.cor );
        System.out.println("Ela é do modelo " + this.modelo);
        System.out.println("Da ponta " + this.ponta);
        System.out.println("A tinta dela eu diria que está uns " + this.carga + "%");
        System.out.println("Ela está tampada? " + this.tampada);
    }
   protected void rabiscar(){
        if(this.tampada == true){
            System.out.println("Como é que tu vai rabisdcar com a caneta tampada meu nobre??Se pá destampar primeiro ajuda...");
        } else{
            System.out.println("Rasbicando...");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
