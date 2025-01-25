package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoreEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculadoreEspecial calculadora = new CalculadoreEspecial();
		
		int valor = 0;
		System.out.println("Ingrese un valor positivo");
		valor=scanner.nextInt();
		calculadora.setN(valor);
		
		int resultadoSumatoria = calculadora.calcularSumatoria();
        System.out.println("La sumatoria es: " + resultadoSumatoria);
        
        int resultadoProductoria = calculadora.calcularProductoria();
        System.out.println("La productoria es: " + resultadoProductoria);
		scanner.close();
	}

}
