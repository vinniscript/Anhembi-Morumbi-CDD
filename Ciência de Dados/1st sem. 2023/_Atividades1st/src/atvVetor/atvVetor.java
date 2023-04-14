package atvVetor;

// Criar números aleatórios e o armazenar dentro de um vetor.
import java.util.Scanner;

public class atvVetor {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            kb.nextInt(vetor[i]);
        }
        kb.close();
    }
}
