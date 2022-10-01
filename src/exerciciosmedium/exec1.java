package exerciciosmedium;

import javax.swing.*;

public class exec1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("O Número: " + i + " é par");
            } else {
                System.out.println(" numero: " + i + " é impar");

            }
            i++;
        }
    }
}


//Declarar variavel inteira: i = 0;
        //Enquanto(i <= 100)

       // SE(i % 2 == 0)
       // Exibir: “O Número: ”+ i + “ é par”;
       // Fim SE
       // SE Não
       // Exibir: “O Número: ”+ i + “ é ímpar”;
       // Fim SE
       // i++;
       // Fim Enquanto
       // Fim algoritmo
