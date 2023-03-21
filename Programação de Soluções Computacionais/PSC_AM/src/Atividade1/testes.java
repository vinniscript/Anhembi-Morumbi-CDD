package Atividade1;

import java.util.Scanner;

// Antecessor do número escolhido

public class testes {

	public static void main(String[] args) {


Scanner scanner = new Scanner (System.in);


System.out.print("Digite o raio da circunferência: ");
double raio = scanner.nextDouble();

double area = Math.PI * raio * raio;
area = Math.round(area * 100.0) / 100.0;

System.out.println("A área da circunferência é: " + area);

	}

}
