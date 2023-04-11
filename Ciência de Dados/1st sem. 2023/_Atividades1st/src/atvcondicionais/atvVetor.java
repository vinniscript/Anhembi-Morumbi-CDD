package atvcondicionais;// Criar números aleatórios e o armazenar dentro de um vetor[50]

import java.util.Random; // Importando objeto que nos permite obter números randômicos.

public class atvVetor {

    public static void main(String[] args) {

        // Instanciando o objeto Random e o armazenando na váriavel "gerador", essa váriavel agora pode ser chamada para se referenciar aos métodos do random.
        Random gerador = new Random();

        int[] vetor = new int[50];  // <--
        int contador = 0;

        while (contador <= vetor.length - 1) {

            vetor[contador] += gerador.nextInt();

            System.out.printf("%d -> %d\n", contador + 1, vetor[contador]);

            contador++;

        }
    }
    
    
    // FOR --

//        System.out.printf("Estou no vetor: \n\n");
//
//        for (int i = 0; i <= vetor.length- 1; i++) { // <- Para um output mais claro, define um "-1"na frente do length do vetor caso você não queria que ele comece pelo index '0', junto disso...
//            
//// Vai gerar uma sequência de 50 números aleatórios (por causa do vetor.length, que declarei para ser de 50).                                               //
//            vetor[i] += gerador.nextInt();
//                                                                                                                                                //
//            System.out.printf("%d -> %d \n", i + 1, vetor[i]);                                                    
//                                                                                                                                    // é super importante colocar "i + 1", se não ele para no index 49, mesmo com <= declarado.
//
//        }
//        System.out.println("\n Sai do vetor \n");
//
//        for (int i = 1; i < vetor.length; i++) {
//            System.out.printf("%d -> %d \n", i, vetor[i]);
//        }
}

