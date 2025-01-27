package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] arreglo = new String[5];
	
	//cargar elementos
	for(int i=0;i<arreglo.length;i++) {
		System.out.println((i+1)+" nombre: ");
		arreglo[i] = scanner.nextLine();
	}
	
	//mostrar los elementos cargados
	System.out.println();
	int i=0;
	while(i<arreglo.length) {
		System.out.println("Nombre: "+arreglo[i]);
		i++;
	}
	System.out.println();
	//mostrar el tamaño del array
	System.out.println("tamaño del arreglo: "+arreglo.length);
	
	//Pedir un valor al usuario del indice a eliminar
	byte indice;
	do {
		System.out.println("Ingrese un valor (tipo byte): ");
		indice = scanner.nextByte();	
		scanner.nextLine();
	}while(indice<0 || indice >=arreglo.length);
	
	for(i= indice;i<arreglo.length -1 ;i++) {
		arreglo[i] = arreglo [i+1];
	}
	
	arreglo[arreglo.length-1]= "-";
	
	//Arreglo luego de la eliminacion
	for(i=0;i<arreglo.length;i++) {
		System.out.println("Nombre: "+arreglo[i]);
	}
	
	scanner.close();
	}
	
}
