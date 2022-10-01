package exemplos;

public class metodosComParametroMain {
    public static void main(String[] args) {
//        metodo com retorno
        System.out.println(texto("teste ", " teste"));
        System.out.println(texto1("gabriel ", "firmino"));
        System.out.println(texto2("testando ", "QA"));
        System.out.println(texto3("segue ", "atv"));

        System.out.println("==================================================");
        text("QA", "academy");
        text1("teste ", " test");
        text2("xxx ", "www");
        text3("qqq ", "fff");
        text4("bbb ", "cccc");
    }

    public static String texto(String a, String b) {
        return " teste é " + a + b;

    }

    public static String texto1(String a, String b) {
        return " teste é " + a + b;
    }

    public static String texto2(String a, String b) {
        return " teste é " + a + b;
    }

    public static String texto3(String a, String b) {
        return " teste é " + a + b;
    }

    public static String texto4(String a, String b) {
        return " teste é " + a + b;
    }
//sem retorno

    public static void text(String a, String b) {
        System.out.println(" teste é " + a + b);
    }

    public static void text1(String a, String b) {
        System.out.println(" teste é " + a + b);

    }

    public static void text2(String a, String b) {
        System.out.println(" teste é " + a + b);
    }

    public static void text3(String a, String b) {
        System.out.println(" teste é " + a + b);
    }

    public static void text4(String a, String b) {
        System.out.println(" teste é " + a + b);
    }
}

