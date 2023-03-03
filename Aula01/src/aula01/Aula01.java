/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package aula01;

/**
 *
 * @author profslvo
 */

public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
        
        // operadores matemáticos
        
        System.out.println("Hello World!");
        System.out.println(5 + 7); // Soma
        System.out.println(46 - 88); // Subtração
        System.out.println(80 * 99); // Multiplicação
        System.out.println(55 / 10); // Divisão
        System.out.println(7 % 2); // Resto da divisão
        System.out.println(Math.pow(5, 2)); // Elevado
        System.out.println(Math.pow(25, 0.5)); // Raiz quadrada
        System.out.println(Math.pow(81, (1.0/3.0))); // Raiz cúbica
        System.out.println( 5 + 2 * 3 ); // Prioridade
        System.out.println( (5 + 2) * 3 ); // Burlar prioridade
        System.out.println(Math.round(67.566454654)); // Arredondamento
        
        // Operadores relacional
        
        System.out.println( 7 == 7 ); // Verificação de igualdade
        System.out.println( 7 == 2 ); // Falso
        System.out.println( 7 != 2 ); // Verdadeiro
        System.out.println( 7 > 2 ); // Maior
        System.out.println( 7 < 2 ); // Menor
        
        System.out.println( 7 != 2 && 7 == 6 ); // Função "e" / Apenas 1 é verdadeiro, então, falso.
        System.out.println( 7 != 2 && 7 == 7 ); // Ambos verdadeiros, logo, verdadeiro.
        
        System.out.println( 7 != 2 || 7 == 6 ); // Função "ou" / Se 1 deles é verdadeiro, então veradeiro.
        System.out.println( 7 < 2 || 5 == 2 ); // Ambas falsas, falso. 
        
        
        // Variáveis
        String name;
        
        name = "Carlos";
        System.out.println( name );
        
        String name1;
        
        name1 = "José";
        System.out.println( name1 );
        
        
        int numero = 15; //Varável definida
        System.out.println( numero );
        
        numero = 20;
        System.out.println( numero );
        
        
        short x, y, z;
        x = y =z =3;
        
        System.out.println(x + y + z);
        
        
        char myletter = 'D';
        boolean c = true;
        System.out.println( myletter + " " + c );
    }
    
    
}
