package lista1;

import java.util.Scanner;

//Fa�a um programa que leia um numero inteiro e o imprima

public class Ex1 {

	public static void main(String[] args) {
		 int numero;
		 
		 Scanner teclado = new Scanner(System.in);
	     numero = teclado.nextInt();
	     System.out.println("O n�mero digitado �: "+ numero);
	     teclado.close();
	}

}
