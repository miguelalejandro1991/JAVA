package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("PARACETAMOL");
		productoA.setDescripcion("MEDICAMENTO");
		productoA.setPrecio(5.00);
		productoA.setStockAnual(500);
		
		productoB.setNombre("ALCOHOL");
		productoB.setDescripcion("MEDICAMENTO");
		productoB.setPrecio(4.00);
		productoB.setStockAnual(1500);
		
		productoC.setNombre("VITAMINAS");
		productoC.setDescripcion("MEDICAMENTO");
		productoC.setPrecio(8.00);
		productoC.setStockAnual(2500);
		
		System.out.println("nombre:" +productoA.getNombre());
		System.out.println("descripcion:" +productoA.getDescripcion());
		System.out.println("precio:" +productoA.getPrecio());
		System.out.println("stockAnual:" +productoA.getStockAnual());
		
		System.out.println("----------------");
		
		System.out.println("nombre:" +productoB.getNombre());
		System.out.println("descripcion:" +productoB.getDescripcion());
		System.out.println("precio:" +productoB.getPrecio());
		System.out.println("stockAnual:" +productoB.getStockAnual());	
		
		System.out.println("----------------");
		
		System.out.println("nombre:" +productoC.getNombre());
		System.out.println("descripcion:" +productoC.getDescripcion());
		System.out.println("precio:" +productoC.getPrecio());
		System.out.println("stockAnual:" +productoC.getStockAnual());
		
		
		

	}

}
