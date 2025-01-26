package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Producto[] productos = new Producto[3];
		
		for(int i=0; i<3;i++) {
			productos[i] = new Producto();
			
			System.out.println("Ingrese nombre");
			productos[i].setNombre(scanner.nextLine());
			System.out.println("Ingrese codigo: ");
			productos[i].setCodigo(scanner.nextInt());
			System.out.println("Ingrese precio: ");
			productos[i].setPrecio(scanner.nextDouble());
			System.out.println("Porcentaje de descuento: ");
			productos[i].setDescuento(scanner.nextInt());
			scanner.nextLine();
		}
		
		for(int i=0;i<3;i++) {
			System.out.println();
			System.out.println("Producto "+(i+1)+":");
			System.out.println("Nombre: "+productos[i].getNombre());
			System.out.println("Codigo: "+productos[i].getCodigo());
			System.out.println("Precio: "+productos[i].getPrecio());
			System.out.println("Descuento: "+productos[i].getDescuento()+ "%");
			System.out.println("Precio con descuento: "+productos[i].calcularDescuento());
		}
		scanner.close();
	}

}
