public class App {
    public static void main(String[] args) throws Exception {
        CanetaP c1 = new CanetaP();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 75;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}