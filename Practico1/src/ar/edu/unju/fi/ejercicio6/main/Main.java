package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		System.out.println("ingrese los datos de la primera persona");
		System.out.println("Ingrese dni: ");
		persona.setDni(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Ingrese nombre: ");
		persona.setNombre(scanner.nextLine());
		System.out.println("Ingrese fecha de nacimineto: ");
		persona.setFecha_nacimiento(LocalDate.parse(scanner.nextLine()));
		System.out.println("Ingrese provincia: ");
		persona.setProvincia(scanner.nextLine());
		
		System.out.println("ingrese los datos de la segunda persona");
		System.out.println();
		System.out.println("Ingrese dni: ");
		int dni2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("ingrese nombre: ");
		String nombre2 = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento para persona2 (formato: yyyy-MM-dd): ");
	    String fechaNacimientoStr = scanner.nextLine();
	    LocalDate fechaNacimiento2 = LocalDate.parse(fechaNacimientoStr);  // Convertir el string a LocalDate     
		System.out.println("Ingrese provincia: ");
		String provincia2= scanner.nextLine();
		
		System.out.println("ingrese los datos de la tercera persona");
		System.out.println();
		System.out.println("Ingrese dni: ");
		int dni3 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese nombre: ");
		String nombre3 = scanner.nextLine();
		System.out.println("Fecha de nacimiento: ");
		String fechaNacimientoS2 = scanner.nextLine();
		LocalDate fecha2 = LocalDate.parse(fechaNacimientoS2);
		
		Persona persona2 = new Persona(dni2, nombre2,fechaNacimiento2,provincia2);
		Persona persona3 = new Persona(dni3,nombre3,fecha2);
		
		persona.mostrarDatos();
		persona2.mostrarDatos();
		persona3.mostrarDatos();
		
		scanner.close();
	}
}

