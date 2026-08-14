 package Encapsulamento;

 public class ControleRemoto implements Contolador{
    // Atributos
        private int volume;
        private boolean ligado;
        private boolean tocando;

    // Metodos Especiais
    public  ControleRemoto(){
            this.volume = 50;
            this.ligado = false;
            this.tocando = false;
    }
    private int getVolume(){
            return volume;
    }

    private boolean getLigado(){
            return ligado;
    }

    private boolean getTocando(){
            return tocando;
    }

    private void setVolume(int v) {
           this.volume = v;
    }

    private void setLigado(boolean l){
            this.ligado = l;
    }

    private void setTocando(boolean t){
            this.tocando = t;
    }
    //Metodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);

    }
    @Override
    public void desligar() {
            this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        if(this.getLigado()){
        System.out.println("----- Menu ----");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume() + " ");
            for(int i = 0; i <= this.getVolume(); i += 10){
               System.out.print("|"); 
               
            }
            System.out.println("");
         } else {
                System.out.println("Impossível abrir menu");

         }
        }
    @Override
    public void fecharMenu() {
            System.out.println("Fechando menu.");
    }
    @Override
    public void maisVolume() {
            if(this.getLigado()){
                this.setVolume(this.getVolume() + 1);
            } else {
                        System.out.println("Impossível aumentar volume");
            }
    }
    @Override
    public void menosVolume() {
            if (this.getLigado()){
                this.setVolume(this.getVolume() - 1);
            } else {
                        System.out.println("Impossível diminuir volume");
            }
    }
    @Override
    public void mutar() {
            if(this.getLigado() && this.getVolume() > 0){
                this.setVolume(0);
            }
    }
    @Override
    public void desmutar() {
            if(this.getLigado() && this.getVolume() == 0){
                    this.setVolume(50);
            }

    }
    @Override
    public void play() {
            if(this.getLigado() && !(this.getTocando())){
                this.setTocando(true);
            } else {
                        System.out.println("Não é possível reproduzir");
            }
    }
    @Override
    public void pause() {
            if(this.getLigado() && this.getTocando()){
                this.setTocando(false);
            }
    }
      
}

