package UFemoji;
public class UFemoji {
    public static void main(String[] args){
            Lutador  l[] = new Lutador[6];
            l[0] = new Lutador("Caverinha", "Brasil", 21, 1.75f, 68.9f, 25, 5, 2);
            l[1] = new Lutador("Edilson", "Brasil", 21, 1.81f, 60.0f, 20, 4, 6);
            l[2] = new Lutador("Guará Guarini", "Brasil", 25, 1.76f, 75.9f, 86, 0, 8);
            l[3] = new Lutador("Carrapeta", "Angola", 26, 1.73f, 75.4f, 47, 10, 5);
            l[4] = new Lutador("Wolf", "Escandinava", 34, 1.87f, 93.8f, 66, 0, 0);
            l[5] = new Lutador("Crow", "Noruega", 32, 1.99f, 100f, 80, 2, 1);

            Luta UEC01 = new Luta();
            UEC01.marcarLuta(l[0], l[4]);
           // UEC01.lutar();
           // l[0].status();
           // l[1].status();

    }
}
