package atvVetor;
// Criar um vetor de tamanho indeterminado, fazendo o usuario promptar o tamanho dele, apos isso calcular a media das idades inseridas pelo usuário e sua mediana.

import java.util.Scanner;

public class atvVetor {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean fim = false;
        System.out.print("Insira a quantidade de idades: ");
        int tamVetor = kb.nextInt();
        int[] vetorAge = new int[tamVetor];

        System.out.print("Agora adicione as idades: ");
        int age = kb.nextInt();

        while (fim) {
            for (int i = 0; i < vetor.length - 1; i++) {
               

                vetorAge[i] = age;
               }
                i++;
            }

        }
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);

            }

        kb.close();
    }
}

