package Atividade1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class testes {

	public static void main(String[] args) {


Scanner scanner = new Scanner (System.in);

//Converter KM/h para ms/h | (Km/h / 3,6).

System.out.println("Insira uma valor em quilômetros: ");

double mh = scanner.nextFloat();
double conversaoKm = (mh / 3.6);

DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
DecimalFormat df = new DecimalFormat("#.#", dfs);
String mhs = df.format(mh) + " m/s";
String kmh = df.format(conversaoKm) + " Km/h";
System.out.printf("%s, convertido fica: %s", mhs, kmh);
	}

}
