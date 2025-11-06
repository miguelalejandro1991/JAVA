package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre="PARACETAMOL";
		productoA.descripcion="MEDICAMENTO";
		productoA.precio=5.00;
		productoA.stockAnual=500;
		
		productoB.nombre="ALCOHOL";
		productoB.descripcion="MEDICAMENTO";
		productoB.precio=4.00;
		productoB.stockAnual=1500;
		
		productoC.nombre="VITAMINAS";
		productoC.descripcion="MEDICAMENTO";
		productoC.precio=8.00;
		productoC.stockAnual=2500;
		
		System.out.println("nombre:" +productoA.nombre);
		System.out.println("descripcion:" +productoA.descripcion);
		System.out.println("precio:" +productoA.precio);
		System.out.println("stockAnual:" +productoA.stockAnual);
		
		System.out.println("----------------");
		
		System.out.println("nombre:" +productoB.nombre);
		System.out.println("descripcion:" +productoB.descripcion);
		System.out.println("precio:" +productoB.precio);
		System.out.println("stockAnual:" +productoB.stockAnual);		
		
		System.out.println("----------------");
		
		System.out.println("nombre:" +productoC.nombre);
		System.out.println("descripcion:" +productoC.descripcion);
		System.out.println("precio:" +productoC.precio);
		System.out.println("stockAnual:" +productoC.stockAnual);
		
		
		

	}

}
