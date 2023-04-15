package atvVetor;

import java.util.Scanner;

public class vetorIdades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Defina a quantidade de idades: ");

        int tamanhoV = scanner.nextInt();

        int[] idades = new int[tamanhoV];

        int idade;

        int i = 0;

        boolean loop = true;
        System.out.println("Digite as idades: ");

        while (loop) {

            idade = scanner.nextInt();
            idades[i] = idade;

            if (i < idades.length - 1) {
                i++;
            } else {
                loop = false;
            }

        }

//        for (i; )
    }
}

//            // Calculando a mediana
//            double mediana;
//            if (tamanhoV % 2 == 0) {
//                mediana = (idades[tamanhoV / 2 - 1] + idades[tamanhoV / 2]) / 2.0;
//            } else {
//                mediana = idades[tamanhoV / 2];
//            }
//
//            // Exibindo a média e a mediana
//            double soma = 0;
//            for (int i = 0; i < tamanhoV; i++) {
//                soma += idades[i];
//            }
//            double media = soma / tamanhoV;
//
//            System.out.println("A média do idades é " + media);
//            System.out.println("A mediana do idades é " + mediana);
//        }
//    }
//}
