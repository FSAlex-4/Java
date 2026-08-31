package UFemoji;



public class UFemoji {

    public static void main(String[] args) {

        // =========================
        // CRIAÇÃO DAS SKILLS
        // =========================

        Skill capoeira = new Skill(
                "Capoeira",
                1.30f,
                4.0f,
                3.82f,
                1.26f
        );

        Skill capoeiraCarioca = new Skill(
                "Capoeira Carioca",
                1.30f,
                4.0f,
                3.82f,
                2.45f
        );

        Skill kickboxing = new Skill(
                "Kickboxing",
                1.0f,
                2.75f,
                2.75f,
                1.0f
        );

        Skill judo = new Skill(
                "Judô",
                2.30f,
                2.80f,
                4.0f,
                3.0f
        );

        Skill ninjusto = new Skill(
                "Ninjutsu",
                1.0f,
                3.10f,
                5.0f,
                2.10f
        );

        Skill karate = new Skill(
                "Karatê",
                1.80f,
                2.90f,
                5.2f,
                4.0f
        );

        Skill boxeC = new Skill(
                "Boxe Chinês",
                3.1f,
                2.3f,
                3.8f,
                3.2f
        );

        Skill taekwondo = new Skill(
                "Taekwondo",
                2.0f,
                3.5f,
                4.2f,
                2.2f
        );


        // =========================
        // CRIAÇÃO DOS LUTADORES
        // =========================

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador(
                "Caverinha",
                "Brasil",
                21,
                1.75f,
                68.9f,
                25,
                5,
                2,
                10,
                25.0f,
                30.1f,
                40.1f
        );

        l[1] = new Lutador(
                "Edilson",
                "Brasil",
                21,
                1.81f,
                60.0f,
                20,
                4,
                6,
                10,
                22.2f,
                30.5f,
                41.1f
        );

        l[2] = new Lutador(
                "Guará Guarini",
                "Brasil",
                25,
                1.76f,
                75.9f,
                86,
                0,
                8,
                15,
                36.1f,
                37.1f,
                32.5f
        );

        l[3] = new Lutador(
                "Carrapeta",
                "Angola",
                26,
                1.73f,
                75.4f,
                47,
                10,
                5,
                15,
                35.8f,
                36.0f,
                35.6f
        );

        l[4] = new Lutador(
                "Wolf",
                "Escandinava",
                34,
                1.87f,
                93.8f,
                66,
                0,
                0,
                28,
                65.8f,
                84.5f,
                30f
        );

        l[5] = new Lutador(
                "Crow",
                "Noruega",
                32,
                1.99f,
                100f,
                80,
                2,
                1,
                30,
                85.1f,
                23.1f,
                56f
        );


        // =========================
        // ADICIONANDO ESTILOS
        // =========================

        l[0].adicionarEstilos(taekwondo);

        l[1].adicionarEstilos(kickboxing);

        l[2].adicionarEstilos(capoeiraCarioca);

        l[3].adicionarEstilos(karate);

        l[4].adicionarEstilos(capoeira);
        l[4].adicionarEstilos(judo);
        l[4].adicionarEstilos(boxeC);
        l[4].adicionarEstilos(kickboxing);
        l[4].adicionarEstilos(ninjusto);

       // l[4].status();
        //[4].apresentar();
        // =========================
        // TESTANDO O GRÁFICO
        // =========================

        new Statistics(l[3]);   

    }
}