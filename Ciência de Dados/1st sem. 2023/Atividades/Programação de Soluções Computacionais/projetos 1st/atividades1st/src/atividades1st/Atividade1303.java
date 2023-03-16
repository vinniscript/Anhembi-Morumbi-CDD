package atividades1st;

import java.util.Scanner;

public class Atividade1303 {

    public static void main(String[] args) {

        System.out.println("Defina um número: ");

        Scanner kb = new Scanner(System.in);

        int numero = kb.nextInt();

        if (numero == 0) {
            System.out.println("0 é neutro.");
        }

        if (numero % 2 == 0) {
            if (numero > 0) {
                System.out.println("Par e Positivo");
            } else {
                System.out.println("Par e Negativo");
            }
        }
        if (numero % 2 != 0) {
            if (numero > 0) {
                System.out.println("Ímpar e Positivo");
            } else {
                System.out.println("Ímpar e Negativo");
            }

        }
    }
}
