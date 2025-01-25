package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Ingrese un numero (1-9): ");
			numero = scanner.nextInt();
		}while(numero>9 || numero<1);
		for(int i =0;i<=10;i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
		
		scanner.close();
	}

}
