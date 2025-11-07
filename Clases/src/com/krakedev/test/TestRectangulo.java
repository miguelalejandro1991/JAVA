package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		int perimetroR1;
		r1.setBase(10);
		r1.setAltura(5);		
		r2.setBase(8);
		r2.setAltura(3);
		r3.setBase(4);
		r3.setAltura(2);
		
		perimetroR1=r3.calcularPerimetro();
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		System.out.println("Area de r1: " +areaR1);
		System.out.println("Area de r2: " +areaR2);
		System.out.println("Perimetro de r1: " +perimetroR1);
		
		
	}

}
