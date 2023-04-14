package atvVetor;

import java.util.Random;

public class matrix2x2 {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10) + 1;

        int[][] matriz = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            num += matriz[i][j];
//                matriz[i][j]=1;
                System.out.print(matriz[i][j]);
            }

        }

    }
}
