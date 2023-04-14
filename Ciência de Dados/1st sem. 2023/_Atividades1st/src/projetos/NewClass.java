
package projetos;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Quantidade de idades: ");
        int tamanho = kb.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println(vetor.length);
        System.out.print("Insira as idades: ");

        for (int i = 0; i < vetor.length -1; i++) {
            if (i <= vetor.length) {
                vetor[i] += kb.nextInt();
                i++;
            } else {
                System.out.printf("we dont talk anymore");
                break;
            }
        }
    }
}
