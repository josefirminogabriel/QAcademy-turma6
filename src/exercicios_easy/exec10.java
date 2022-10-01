package exercicios_easy;

import javax.swing.*;

public class exec10 {
    public static void main(String[] args) {
        double  valorInvestimento, taxaJuros = 0.05, valorJuros, valorTotal;
valorInvestimento=  Integer.parseInt(JOptionPane.showInputDialog("o valor investido é: "));
taxaJuros=0.05 * 10;
valorJuros=valorInvestimento * taxaJuros;
valorTotal=valorJuros+valorInvestimento;
        System.out.println("você investiu: " +valorInvestimento);
        System.out.println("Rendeu: " +valorJuros + " de juros");
        System.out.println("O valor total é: " +valorTotal);
    }
}
