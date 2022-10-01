package exercicios_easy;

import javax.swing.*;

public class exec7 {
    public static void main(String[] args) {
        double sal, inss;
        sal = Double.parseDouble(JOptionPane.showInputDialog("qual o salário"));
        if (sal <= 1045.00) {
            inss = sal * 0.075;
            System.out.println("o inss é: " + inss);
            System.out.println( "o salario liquido é: " + (sal - inss));

        }

        else if (sal >= 1045.01 && sal <= 2089.00) {
            inss = sal * 0.09;
            System.out.println("o inss é: " + inss);
            System.out.println( "o salario liquido é: " + (sal - inss));

        }

        else if (sal >= 2089.01 && sal <= 3134.00) {
            inss = sal * 0.12;
            System.out.println("o inss é: " + inss);
            System.out.println( "o salario liquido é: " + (sal - inss));

        }

        else if (sal >=3134.01) {
            inss = sal * 0.14;
            System.out.println("o inss é: " +inss);
            System.out.println( "o salario liquido é: " + (sal - inss));
        }
    }
}