package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadradoA =new Cuadrado();
		Cuadrado cuadradoP =new Cuadrado();
		cuadradoA.setLado(5);
		cuadradoP.setLado(3);
		int areaCuadrado = cuadradoA.calcularArea();
		System.out.println("El area del cuadrado es: " + areaCuadrado);
		
		int perimetroCuadrado = cuadradoP.calcularPerimetro();
		System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);
		

	}

}
