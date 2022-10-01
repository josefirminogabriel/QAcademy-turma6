package exercicios_easy;

import javax.swing.*;

public class exec11 {
    public static void main(String[] args) {
        double investimento, taxa =0.05, valorJuros= 0, valorTotal= 0, i=1;
        investimento=Integer.parseInt(JOptionPane.showInputDialog("o valor investido é: "));
        while (i<=10){
            valorJuros = ((investimento+valorJuros)*taxa)+valorJuros;
            i=i+1;
        }
        System.out.println("valor de juros é: "+valorJuros);
        System.out.println("o valor do investimento é: " +investimento);
        System.out.println("valor total: " +investimento+valorJuros);
    }
}
