package exercicios_easy;

import javax.swing.*;

public class exec9 {
    public static void main(String[] args) {
        int numeroDigitado,  i = 1;
        numeroDigitado= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero aqui:"));
        while (i<=10) {
            System.out.println("Número" + numeroDigitado + "x" + i + " = " + numeroDigitado * i);
            i++;
        }
    }

}
