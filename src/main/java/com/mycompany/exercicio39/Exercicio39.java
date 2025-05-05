/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio39;
import javax.swing.JOptionPane;

public class Exercicio39 {

    public static void main(String[] args) {
        int num = 0;
        int num2 = 0;
        try {
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        } catch (java.lang.NumberFormatException e) {
        System.out.println("Erro na aritmética, digite um número diferente de zero para dar certo" + e);
        try {
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
        } catch (java.lang.NumberFormatException e2) {
        System.out.println("Erro na aritmética, digite um número diferente de zero para dar certo" + e2);
        }
        int n = 0;
        try {
        n = num / num2;
        } catch (java.lang.ArithmeticException e3) {
        System.out.println("Erro na aritmética, digite um número diferente de zero para dar certo" + e3);
        } finally {
            JOptionPane.showMessageDialog(null, "A divisão de "+num+ " por "+num2+ " resulta "+n);
        }
    }
    }
}
