package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadrado =new Cuadrado();
		cuadrado.lado=5;
		int areaCuadrado = cuadrado.calcularArea();
		System.out.println("El area del cuadrado es: " + areaCuadrado);
		

	}

}
