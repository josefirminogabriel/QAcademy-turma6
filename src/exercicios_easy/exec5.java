package exercicios_easy;

import javax.swing.*;

public class exec5 {
    public static void main(String[] args) {
        int num1, num2, num3, result, soma, subtração, multiplicação, media;
        num1= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        num3= Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        soma= num1 + num2 + num3;
        subtração= num1 - num2 - num3;
        multiplicação= num1 * num2 * num3;
        media= soma / 3;
        System.out.println("O resultado é: " + soma);
        System.out.println("O resultado é: " + subtração);
        System.out.println("O resultado é: " + multiplicação);
        System.out.println("O resultado é: " + media);
    }
}

//15 25 35
