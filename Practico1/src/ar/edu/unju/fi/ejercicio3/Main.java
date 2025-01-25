package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor,aux;
		System.out.println("Ingrese un valor: ");
		valor = scanner.nextInt();
		aux=valor;
		if(valor>0) {
			if(valor%2==0) {
				valor=valor*2;
				System.out.println("valor: "+aux+" ----->  "+valor);
			}
			else {
				valor=valor*3;
				System.out.println("valor: "+aux+" ----->  "+valor);
			}
		}
		else
			System.out.println("El valor es 0");

		scanner.close();
	}

}
