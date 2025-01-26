package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] arreglo = new int[8];
	
	for(int i=0;i<8;i++) {
		System.out.println("ingrese un numero");
		arreglo[i] = scanner.nextInt();
	}
	for(int i = 0; i<8 ;i++) {
		System.out.println("Posicion "+(i+1)+": "+arreglo[i]);
	}
	scanner.close();
	}

}
