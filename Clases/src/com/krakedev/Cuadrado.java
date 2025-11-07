package com.krakedev;

public class Cuadrado {
	public int lado;
	public int calcularArea() {
		int area;
		area = lado * lado;
		return area;
		
		
	}	
	public int calcularPerimetro() {
		int perimetro;
		perimetro = 4 * lado;
		return perimetro;
	}

}
