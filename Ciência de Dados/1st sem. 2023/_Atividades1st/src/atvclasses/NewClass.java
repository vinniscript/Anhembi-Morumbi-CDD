package atvclasses;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean ligado = true;
        double[] entradas = new double[2];
        
        while (ligado) {
            try {
                for (int i = 0; i < entradas.length; i++) {
                    System.out.println("Digite um número: ");
                    entradas[i] = kb.nextDouble();
                }

                System.out.println(" OPERAÇÕES: \n"
                        + "+ PARA SOMAR\n"
                        + "- PARA SUBTRAIR\n"
                        + "* PARA MULTIPLICAR\n"
                        + "/ PARA SUBTRAIR");

                String operacao = kb.next();

                switch (operacao.charAt(0)) {
                    case '+':
                        System.out.println("Resultado: " + soma(entradas[0], entradas[1]));
                        break;
                    case '-':
                        System.out.println("Resultado: " + subtracao(entradas[0], entradas[1]));
                        break;
                    case '*':
                        System.out.println("Resultado: " + multiplicacao(entradas[0], entradas[1]));
                        break;
                    case '/':
                        double div = divisao(entradas[0], entradas[1]);
                        if (div == Double.MIN_VALUE) {
                            System.out.println("Não dividirás por 0");
                        } else {
                            System.out.println("Resultado: " + div);
                        }
                        break;
                    case 's':
                        System.out.println("Obrigado.");
                        ligado = false;
                    default:
                        System.out.println("Comando incorreto.");

                }
            } catch (Exception e) {
                System.out.println("Você deve digitar um número.");
            }
        }
    }

    public static double soma(double num, double num2) {
        return num + num2;
    }

    public static double subtracao(double num, double num2) {
        return num - num2;
    }

    public static double multiplicacao(double num, double num2) {
        return num * num2;
    }

    public static double divisao(double num, double num2) {

        if (verificacao(num)) {
            num = Double.MIN_VALUE;
        }
        return num / num2;

    }

    public static boolean verificacao(double num) {
        return num == 0;
    }
}

