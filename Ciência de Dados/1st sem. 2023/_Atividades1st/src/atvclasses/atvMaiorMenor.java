package atvclasses;

import java.util.Random;

// uma classe que recebe o maior número de um array inserido pelo usuário, outra que receba o menor numero do array inserido pelo usuário. Ambas precisam ser void.
public class atvMaiorMenor {
    public static void maior(int[] nums) {
        int maior = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > maior) {
                maior = nums[i];
            }

        }
        System.out.println("Maior número do vetor: " + maior);
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int[] numeroR = new int[5];

        for (int i = 0; i < numeroR.length; i++){
            numeroR[i] = rand.nextInt(100);
            System.out.println(numeroR[i]);
        }

        maior(numeroR);
    }
}
