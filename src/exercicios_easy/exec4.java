package exercicios_easy;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class exec4 {
    public static void main(String[] args) {
       int num1, result;
       num1= Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
    result= num1*2;
        System.out.println("O dobro é: " + result);
    }
}


//    Faça um algoritmo para ler um número inteiro,
//    armazenar em uma variável, calcular o dobro, e exibir.
//
//        Inicio Algoritmo
//    Declarar variável do tipo numérico : num1, result;
//        num1 =  Ler(6);
//        result= num1*2;
//        Exibir: “O dobro é: ” + result;
//        Fim Algoritmo
