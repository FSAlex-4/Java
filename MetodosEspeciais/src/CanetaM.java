public class CanetaM {
     private String modelo;
    public  CanetaM(String M, String C, Float P) {
          setModelo(M);
          setCor(C);
          setPonta(P);
          destampar();
          rabiscar();
          this.carga = (98);
   }
   String getModelo(){
        return this.modelo;
   }
   void setModelo(String m){
        this.modelo = m;
   }
   private String cor;
   String getCor(){
        return this.cor;
   }
   void setCor(String c){
        this.cor = c;
   }
   private Float ponta;
   Float getPonta(){
        return this.ponta;
   }
   void setPonta(Float p){
        this.ponta = p;
   }
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
