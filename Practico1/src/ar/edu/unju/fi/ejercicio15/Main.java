package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		
		do {
			System.out.println("Ingrese un valor");
			valor = scanner.nextInt();
		}while(valor < 5 || valor >10);
		//arreglo de tipo String
		String[] arreglo = new String[valor];
		
		scanner.nextLine();
		for(int i = 0;i<arreglo.length;i++) {
			System.out.println("Ingrese un nombre");
			arreglo[i] = scanner.nextLine();
		}
		
		for(int i =0; i<arreglo.length;i++) {
			System.out.println("["+(i+1)+"]: "+arreglo[i]);
		}
		
		
		scanner.close();
	}

}
