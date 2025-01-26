package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pizza[] pizzas = new Pizza[3];
		
		for(int i = 0; i < 3; i++) {
			pizzas[i] = new Pizza();
			System.out.println();
			System.out.println("INgrese los datos de la pizza");
			System.out.println("DIametro: ");
			pizzas[i].setDiametro(scanner.nextInt());
			System.out.println("Tiene ingredientes especiales? (True/false): ");
			pizzas[i].setIng_esp(scanner.nextBoolean());
		
			pizzas[i].calcularPrecio();
			pizzas[i].calcularArea();
			
			//mostrar los resultados
			System.out.println();
			System.out.println("**Pizza "+(i+1)+" **");
			System.out.println();
			System.out.println("Diametro: "+pizzas[i].getDiametro());
			System.out.println("Tiene ingredientes especiales?: "+pizzas[i].isIng_esp());
			System.out.println("Precio: $"+pizzas[i].getPrecio());
			System.out.println("Area de la pizza: "+pizzas[i].getArea());
		}		
		scanner.close();
	}

}
