
package aula1603;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        
        // Peso ideal.
        /*
        *
        * Homens = pesoIdeal = (72,7 * altura) - 58;
        * Mulheres = pesoIdeal = (62,1 * altura) - 44,7
        *
        */
        
        Scanner kb = new Scanner(System.in).useDelimiter("(?i)");
        
        System.out.println("Qual seu genêro? (H/M): ");
        
        String sexo = kb.next();
        char pessoa = sexo.charAt(0);
       
        System.out.println("Qual sua altura?");
        double altura = kb.nextDouble();
        
        if (pessoa == 'h'){
        double pesoIdealH = ((72.7 * altura) - 58 );
            System.out.println("Brother, seu peso ideal é: " + pesoIdealH);
        } else if (pessoa == 'm') {
            double pesoIdealM = ((62.1 * altura) - 44.7 );
            System.out.println("Moça, teu peso ideal é: " + pesoIdealM);
        } else {
            System.out.println("sus");
        }
    }
}
