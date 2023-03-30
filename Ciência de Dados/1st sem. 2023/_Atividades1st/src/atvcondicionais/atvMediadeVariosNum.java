package atvcondicionais;

// Crie um programa que receb várias notas e calcule a média entre elas.
import java.util.Scanner;

public class atvMediadeVariosNum {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int notas, i = 1, acumulador, media = acumulador / (i);

        System.out.print("Insira ate 10 notas, ou digite '-1' quando acabar: ");

        for (; i <= 11; i++) {

            notas = kb.nextInt();
            acumulador += notas;
            
            if (notas == -1) {
                System.out.println("Notas documentadas.");
                media = acumulador / (i - 1);
                System.out.printf("\n\n MEDIA TOTAL: %d\n\n", media);
                break;
            }
                if (acumulador <= 10){
                    
            System.out.printf("%d nota - %d\n", i, notas);

            acumulador += notas;
            

            } else {
                    
                System.out.printf("\n\n MEDIA TOTAL: %d\n\n", media);
                
                }
        }
    }
}
