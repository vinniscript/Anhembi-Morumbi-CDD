package Atividade1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Atividades {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    	// 1. Printar número inteiro:
    
    System.out.print("Digite um número inteiro: ");
    int numInt = scanner.nextInt();

    System.out.print("Seu número inteiro escolhido: " + numInt + "\n\n");
    
    
    	// 2. Printar número real;
    
    
    System.out.print("Digite um número real: ");
    double numReal = scanner.nextDouble();

    System.out.print("Seu número real escolhido foi: " + numReal + "\n\n");
    
    
    	// 3. Soma de inputs;
    
    System.out.print("Vamos somar 3 valores de números inteiros, insira o primeiro: ");
    int num1 = scanner.nextInt(); // Primeiro input.
    
    System.out.print("Agora o segundo: ");
    int num2 = scanner.nextInt(); // Segundo input.
    
    System.out.print("O último número: ");
    int num3 = scanner.nextInt(); // Terceiro input.
    
    int soma = num1 + num2 + num3; // A soma dos três.
    System.out.println("A soma dos seus três valores é: " + soma +"\n");
    
    	// 4. UNICODE da letra escolhida.
    
    System.out.print("Digite uma letra: ");
    char letra = scanner.next().charAt(0);

    int codigo = letra;

    System.out.println("O código UNICODE da sua letra escolhida é: " + codigo + "\n");
    
    	// 5. Celsius para Farenheint; // F° = C° * 1,8 + 32
    
    System.out.print("Insira uma temperatura em Celsius: ");
    double celso = scanner.nextDouble();
    double calculo = (celso * 1.8) + 32;
    String farenheint = String.format("%.2f", calculo);
    System.out.printf("%.0f°C -> %.0f°F.", celso, calculo);
    System.out.println("\n");
    
    	// 6. Converter Km/h para Mh/s
    
    System.out.println("Insira uma valor em quilômetros: ");

    double km = scanner.nextFloat();
    double conversaoKm = (km / 3.6);

    DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
    DecimalFormat df = new DecimalFormat("#.#", dfs);
    String mhs = df.format(km) + " Km/h";
    String kmh = df.format(conversaoKm) + " m/s";
    System.out.printf("%s, convertido fica: %s", mhs, kmh + "\n\n");
    
  }
}
