package exerciciosmedium;

public class exec3 {
    public static void main(String[] args) {
        double i = 0, soma = 0;
        while (i <= 1000 && soma <= 1500) {
            soma = i + soma;
            System.out.println(soma);
            i++;

        }
    }
}


//3-) Faça um algoritmo para calcular e exibir a soma de todos
// os números de 0 a 1000. E parar se caso a soma atingir 1500(Ou mais).
//        EX: 0 +1, 1+2, 3+4.. 1500 | break ou parar
//
//        Inicio Algoritmo
//
//        Declarar variável do tipo numerico: i=0, soma;
//        Enquanto(i<=1000 && soma <=1500 )
//        soma = i+soma;
//
//        Se(soma>= 1500)
//        break; //parar
//        Fim Se
//        Exibir(soma);
//        i++; //i = i+1;
//        Fim Enquanto;
//
//
//
//        Fim Agoritmo
//
//        Sem o break.
//
//
//        Inicio Algoritmo
//        Declarar variável do tipo numerico: i=0, soma;
//
//        Enquanto(i<=1000 && soma <=1500)
//        soma = i+soma;
//        Exibir(soma);
//        i++; //i = i+1;
//        Fim Enquanto
//        Fim Algoritmo
//
//

//    Declarar variável do tipo numerico: i=0, soma;
//        Enquanto(i<=1000 )
//        soma = i+soma;
//
//        Se(soma>= 1500)
//        break; //parar
//        Fim Se
//        Exibir(soma);
//        i++; //i = i+1;
//        Fim Enquanto;

