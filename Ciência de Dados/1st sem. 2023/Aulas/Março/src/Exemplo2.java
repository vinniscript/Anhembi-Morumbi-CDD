/*
 * Programa que printa um inteiro na tela
 */
package aula0603;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero inteiro: ");
        numero = kb.nextInt();
        System.out.println("O numero digitado foi: " + numero);
    }
}
