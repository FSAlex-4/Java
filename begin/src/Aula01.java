public class Aula01 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.6f;
        c1.tinta = 70;
        c1.tampada = false;
        c1.status();
        Agenda a1 = new Agenda();
        a1.modelo = "Arameado";
        a1.cor = "Preta";
        a1.paginas =  150;
        a1.fechada = true;
        a1.status();
        a1.folhear();
        a1.anotar(c1);
        a1.abrir();
        a1.status();
        a1.folhear();
        a1.anotar(c1);
    }   
}
