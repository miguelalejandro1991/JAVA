package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadradoA =new Cuadrado();
		Cuadrado cuadradoP =new Cuadrado();
		cuadradoA.lado=5;
		cuadradoP.lado=3;
		int areaCuadrado = cuadradoA.calcularArea();
		System.out.println("El area del cuadrado es: " + areaCuadrado);
		
		int perimetroCuadrado = cuadradoP.calcularPerimetro();
		System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);
		

	}

}
