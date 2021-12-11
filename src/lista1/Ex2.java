package lista1;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia um numero real e o imprima

public class Ex2 {

	public static void main(String[] args) {
		 double numero;
		 final var localeAmericano = new Locale("en", "US");
			Locale.setDefault(localeAmericano);
		 
		 Scanner teclado = new Scanner(System.in);
	     numero = teclado.nextDouble();
	     System.out.println("O número digitado é: "+ numero);
	     teclado.close();
	}

}