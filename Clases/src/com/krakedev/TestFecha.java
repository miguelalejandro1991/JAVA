package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(2020,12,31);
		fecha1.setAnio(2021);
		fecha1.setMes(01);
		fecha1.setDia(30);
		System.out.println(fecha1.getAnio());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getDia());
		fecha1.mostrarFecha();

	}

}
