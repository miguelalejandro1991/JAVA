package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		int perimetroR1;
		r1.base = 10;
		r1.altura =5;		
		r2.base=8;
		r2.altura=3;
		r3.base=4;
		r3.altura=2;
		
		perimetroR1=r3.calcularPerimetro();
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		System.out.println("Area de r1: " +areaR1);
		System.out.println("Area de r2: " +areaR2);
		System.out.println("Perimetro de r1: " +perimetroR1);
		
		
	}

}
