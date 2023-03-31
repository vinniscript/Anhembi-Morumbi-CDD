package atvcondicionais;

import java.util.Scanner;

public class atvMediaWhile {

    public static void main(String[] args) {
        int notas, media, acumulador = 0, contagem = 0;
        Scanner kb = new Scanner(System.in);

        do {

            System.out.print("Insira suas notas ou insira -1 estiver satisfeito: ");

            notas = kb.nextInt();
            acumulador += notas;
            contagem++;

            if (notas == -1) {
                media = acumulador / contagem;
                System.out.println(media);
                break;
            }

        } while (contagem <= 10);
        media = acumulador / contagem;
        System.out.println(media);
    }

}
