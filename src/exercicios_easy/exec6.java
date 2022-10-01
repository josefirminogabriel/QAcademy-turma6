package exercicios_easy;


public class exec6 {
    public String calcularMedia(int nota1, int nota2) {
        int media = 0;

        media= (nota1+nota2)/2;
            {
            if (media > 5) {
                return "Aprovado";

            }

            if (media < 5) {
                return "Reprovado ";
            }
            if (media == 5) {
                return "exame ";

            }
            return null;


        }
    }
}
