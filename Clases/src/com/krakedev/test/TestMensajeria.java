package com.krakedev.test;

import com.krakedev.Mensajeria;

public class TestMensajeria {

	public static void main(String[] args) {
		Mensajeria m = new Mensajeria("Bienvenido a la mensajeria");
		m.saludar();
		m.saludarAmigos("miguel", "rodriguez");
		

	}

}
