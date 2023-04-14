package atvvetor;

import java.util.Random;

public class AtvVetor {

    public static void main(String[] args) {
        int matriz[][] = new int [2][2];
       
        Random random = new Random();

        for (int i = 0 ; i < matriz.length ; i++ ) {
            for (int j = 0 ; j < matriz.length ; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            System.out.print(matriz[i][j] + " ");
            }
        System.out.println();
        } 
        
        
    }
}
