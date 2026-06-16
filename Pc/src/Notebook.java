import java.util.Scanner;
public class Notebook {
    private String modelo;
    private String cor;

    public Notebook(String m, String c){
            setModelo(m);
            setCor(c);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String M) {
        this.modelo = M;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String C){
        this.cor = C;
    }

    protected public Boolean fechado = true;
    protected Boolean aberto = false;
    protected Boolean ligado = false;
    public Boolean desligado = true;

    public Boolean getAbrir(){
            return this.aberto;
    }

    public void setAbrir(boolean a){
                this.aberto = a;
    }

    public boolean getfechar(){
                return this.fechado;
    }
    public void setfechar(boolean f) {
        this.fechado = f;
    }

    void setlogin(String l){
        if(aberto && ligado = true)
             System.out.print("logan em conta pessoal por favor inserir senha.");
            String 
    } else
        {
        System.out.print("Computador desligado ou fechado favor abri-lo e ligalo para iniciar");
    }

    void status() {
        System.out.println("O Noteebook é do " + getModelo());
        System.out.println("De coloração " + getCor());
        System.out.println("Ele está fechado? " + this.fechado);
        System.out.println("Ele está ligado? " + this.ligado);
    }
}
