package lista1;

import java.util.Scanner;

//Faça um programa que leia um numero inteiro e o imprima

public class Ex1 {

	public static void main(String[] args) {
		 int numero;
		 
		 Scanner teclado = new Scanner(System.in);
	     numero = teclado.nextInt();
	     System.out.println("O número digitado é: "+ numero);
	     teclado.close();
	}

}
