package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1. Declaro una variable llamada p de tipo persona 
		Persona p2=new Persona();
		p = new Persona (); // 2. Instanciar un objeto Persona, referenciarlo con p 
		// 3. accedo a los atributos 
		System.out.println("nombre:" +p.nombre);
		System.out.println("edad:" +p.edad);
		System.out.println("estatura:" +p.estatura);
		
		//4. Modificar los atributos
		p.nombre = "Miguel";
	    p.edad = 34;
	    p.estatura = 1.56;
	    System.out.println("---------------");
	    	    
	    //5. acceso a los atributos
	    System.out.println("nombre:" +p.nombre);
		System.out.println("edad:" +p.edad);
		System.out.println("estatura:" +p.estatura);   	    
	    
		
		
		p2.nombre="Josselyn";
		p2.edad=28;
		p2.estatura=1.55;
		
		System.out.println("nombre:" +p2.nombre);
		System.out.println("edad:" +p2.edad);
		System.out.println("estatura:" +p2.estatura);   
		
		System.out.println("-------------");
		
		System.out.println("********");
		System.out.println("p.nombre:" +p.nombre);
		System.out.println("p2.nombre:" +p2.nombre);
		
		
		
		

	}

}
