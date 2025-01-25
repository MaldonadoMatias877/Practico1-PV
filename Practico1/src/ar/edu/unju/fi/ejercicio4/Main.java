package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor,fact=1;
		System.out.println("Ingrese un valor: ");
		valor = scanner.nextInt();
		
		while(valor>0) {
			fact=fact*valor;
			valor--;
		}
		System.out.println("Factorial de "+valor+" es: "+fact);
		scanner.close();
	}

}
