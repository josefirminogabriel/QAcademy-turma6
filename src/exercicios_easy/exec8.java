package exercicios_easy;

import javax.swing.*;

public class exec8 {
    public static void main(String[] args) {
        double sal, ir = 0;
        sal = Double.parseDouble(JOptionPane.showInputDialog("qual o salário"));
        if(sal >0 && sal <= 1903.98) {
            System.out.println("isento de imposto de renda");
        }

        else if (sal >= 1903.99 && sal <= 2826.65) {
            ir= (sal * 0.075)-142.80;
        }

        else if (sal >=2826.66 && sal <=3751.05) {
            ir= (sal * 0.15) -354.80;
        }

        else if (sal>=3751.06 && sal<=4664.68) {
            ir= (sal *0.225) -636.13;
        }

        else if (sal >4664.68) {
            ir= (sal * 0.275) -869.36;
        }

        System.out.println("Salario bruto: " +sal);
        System.out.println("salario liquido: " +(sal -ir));
        System.out.println("imposto a pagar: "+ir);
    }
}
