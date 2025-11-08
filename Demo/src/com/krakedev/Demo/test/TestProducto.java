package com.krakedev.Demo.test;

import com.krakedev.Demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// INSTANCIAR UN OBJETO PRODUCTO CON CODIGO Y NOMBRE 
		
		Producto prod =new Producto(101, "laptop");
		
		// MODIFICAR LA DESCRIPCION Y EL PESO
		
		prod.setDescripcion("LAPTOP ULTRA DELGADA DE 14 PULGADAS");
		prod.setPeso(1.25);
		
		
		//MOSTRAR LOS VALORES EN PANTALLA
		System.out.println("Codigo: " +prod.getCodigo());
		System.out.println("Nombre: " +prod.getNombre());
		System.out.println("Descripcion: " +prod.getDescripcion());
		System.out.println("Peso: " +prod.getPeso());
		

	}

}
