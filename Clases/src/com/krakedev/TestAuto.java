package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto("HONDA");
		
		
		auto1.setMarca("TOYOTA");
		auto1.setAnio (2022);
		auto1.setPrecio (20000.0);
		
		
		
		System.out.println("auto1.marca:"+auto1.getMarca());
		System.out.println("auto1.anio:"+auto1.getAnio());
		System.out.println("auto1.precio:"+auto1.getPrecio());
				
		

	}

}
