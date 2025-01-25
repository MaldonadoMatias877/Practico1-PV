package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoreEspecial {
	private int n;

	public CalculadoreEspecial() {
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calcularSumatoria() {
		int suma=0;
		for(int k=1;k<=n;k++) {
			int valor = (k*(k+1))*(k*(k+1));
			suma = suma+valor;
		}
		return suma;
	}
	
	public int calcularProductoria() {
		int prod=1;
		for(int k = 1 ; k<=n;k++) {
			prod=prod*(k*(k+4));
		}
		return prod;
	}
}
