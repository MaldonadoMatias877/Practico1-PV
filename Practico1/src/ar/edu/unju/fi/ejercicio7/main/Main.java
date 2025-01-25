package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese legajo: ");
		int legajo= scanner.nextInt();	
		System.out.println("Ingrese sueldo: ");
		double salario = scanner.nextDouble();
		System.out.println();
		scanner.nextLine();
		System.out.println("Ingrese nombre: ");
		String nombre2 = scanner.nextLine();
		System.out.println("Ingrese legajo: ");
		int legajo2= scanner.nextInt();	
		System.out.println("Ingrese sueldo: ");
		double salario2 = scanner.nextDouble();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		
		Empleado empleado2 = new Empleado(nombre2, legajo2, salario2);
		System.out.println();
		System.out.println("Empleado N° 1");
		empleado.mostrarDatos();
		empleado.darAumento();
		System.out.println();
		System.out.println("Salario del empleado con el aumento");
		empleado.mostrarDatos();
		System.out.println();
		
		System.out.println("Empleado N° 2");
		empleado2.mostrarDatos();
		empleado2.darAumento();
		System.out.println();
		System.out.println("Salario del empleado con el aumento");
		empleado2.mostrarDatos();
		scanner.close();
	}

}
