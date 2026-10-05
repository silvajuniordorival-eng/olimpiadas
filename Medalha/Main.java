public class Main {
    public static void main(String[] args) {
        // País 1: EUA (1º lugar em ouro)
        String nomePais1 = "EUA";
        int ouroPais1 = 40;
        int prataPais1 = 44;
        int bronzePais1 = 42;
        int anoEdicao1 = 2024;
        String cidadeSede1 = "Paris";
        boolean top10Pais1 = true;
        int totalPais1 = ouroPais1 + prataPais1 + bronzePais1;

        // País 2: China (2º lugar em ouro)
        String nomePais2 = "China";
        int ouroPais2 = 39;
        int prataPais2 = 27;
        int bronzePais2 = 24;
        int anoEdicao2 = 2024;
        String cidadeSede2 = "Paris";
        boolean top10Pais2 = true;
        int totalPais2 = ouroPais2 + prataPais2 + bronzePais2;

        // País 3: Japão (3º lugar em ouro)
        String nomePais3 = "Japão";
        int ouroPais3 = 20;
        int prataPais3 = 12;
        int bronzePais3 = 13;
        int anoEdicao3 = 2024;
        String cidadeSede3 = "Paris";
        boolean top10Pais3 = true;
        int totalPais3 = ouroPais3 + prataPais3 + bronzePais3;

        // País 4: Canadá (4º lugar em ouro)
        String nomePais4 = "Canadá";
        int ouroPais4 = 9;
        int prataPais4 = 7;
        int bronzePais4 = 11;
        int anoEdicao4 = 2024;
        String cidadeSede4 = "Paris";
        boolean top10Pais4 = true;
        int totalPais4 = ouroPais4 + prataPais4 + bronzePais4;

        // País 5: Brasil (5º lugar em ouro)
        String nomePais5 = "Brasil";
        int ouroPais5 = 3;
        int prataPais5 = 7;
        int bronzePais5 = 10;
        int anoEdicao5 = 2024;
        String cidadeSede5 = "Paris";
        boolean top10Pais5 = false;
        int totalPais5 = ouroPais5 + prataPais5 + bronzePais5;

        // País 6: Israel (6º lugar em ouro)
        String nomePais6 = "Israel";
        int ouroPais6 = 1;
        int prataPais6 = 5;
        int bronzePais6 = 1;
        int anoEdicao6 = 2024;
        String cidadeSede6 = "Paris";
        boolean top10Pais6 = false;
        int totalPais6 = ouroPais6 + prataPais6 + bronzePais6;

        // Exibição do Quadro de Medalhas
        System.out.println("Edição dos Jogos Olímpicos: " + cidadeSede1 + " " + anoEdicao1);
        System.out.println("--------------------------------------------------");
        System.out.println("pais,ouro,prata,bronze,total,top 10");
        System.out.println("--------------------------------------------------");
        System.out.println(nomePais1 + "," + ouroPais1 + "," + prataPais1 + "," + bronzePais1 + "," + totalPais1 + "," + top10Pais1);
        System.out.println(nomePais2 + "," + ouroPais2 + "," + prataPais2 + "," + bronzePais2 + "," + totalPais2 + "," + top10Pais2);
        System.out.println(nomePais3 + "," + ouroPais3 + "," + prataPais3 + "," + bronzePais3 + "," + totalPais3 + "," + top10Pais3);
        System.out.println(nomePais4 + "," + ouroPais4 + "," + prataPais4 + "," + bronzePais4 + "," + totalPais4 + "," + top10Pais4);
        System.out.println(nomePais5 + "," + ouroPais5 + "," + prataPais5 + "," + bronzePais5 + "," + totalPais5 + "," + top10Pais5);
        System.out.println(nomePais6 + "," + ouroPais6 + "," + prataPais6 + "," + bronzePais6 + "," + totalPais6 + "," + top10Pais6);
    }
}