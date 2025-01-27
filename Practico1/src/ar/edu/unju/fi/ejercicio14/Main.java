package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		//Pedimos al usuario un valor entre el 3 y el 10
		do {
			System.out.println("INgrese un valor entre 3-10");
			valor = scanner.nextInt();	
		}while(valor <3 || valor >10);
		//Creamos el arreglo de enteros con las posiciones que el valor previamente cargado indica
		int[] arreglo = new int[valor];
		//Pedimos los valores para cada posicion
		for(int i =0;i<arreglo.length;i++) {
			System.out.println("Ingrese un valor entero: ");
			arreglo[i] = scanner.nextInt();
		}
		//Mostramos los valores cargados
		System.out.println("Valores");
		for(int i =0;i<arreglo.length;i++) {
			System.out.println("Valor en la posicion "+(i+1)+": "+arreglo[i]);
		}
		
		scanner.close();
	}

}
