package com.krakedev;

public class Mensajeria {
	public void saludar() {
		System.out.println("hola mundo");
	}
	
	public Mensajeria(String mensaje) {
		System.out.println(mensaje);
		
	}
	public void saludarAmigos(String nombre, String apellido) {
		System.out.println("Hola  " +nombre+" "+apellido);
	}

}
