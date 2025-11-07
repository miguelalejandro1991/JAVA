package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p=new Persona(); // 1. Declaro una variable llamada p de tipo persona 
		Persona p2=new Persona();
		Persona p3=new Persona("JOSSELYN");
		Persona p4=new Persona("CARLOS",25,1.75);
		 
		// 3. accedo a los atributos 
		System.out.println("nombre:" +p.getNombre());
		System.out.println("edad:" +p.getEdad());
		System.out.println("estatura:" +p.getEstatura());
		
		//4. Modificar los atributos
		p.setNombre("Miguel");
	    p.setEdad(34);
	    p.setEstatura(1.56);
	    System.out.println("---------------");
	    	    
	    //5. acceso a los atributos
	    System.out.println("nombre:" +p.getNombre());
		System.out.println("edad:" +p.getEdad());
		System.out.println("estatura:" +p.getEstatura());   	    
	    
		
		
		p2.setNombre("Josselyn");
		p2.setEdad(28);
		p2.setEstatura(1.55);
		
		System.out.println("nombre:" +p2.getNombre());
		System.out.println("edad:" +p2.getEdad());
		System.out.println("estatura:" +p2.getEstatura());   
		
		System.out.println("-------------");
		
		System.out.println("********");
		System.out.println("p.nombre:" +p.getNombre());
		System.out.println("p2.nombre:" +p2.getNombre());
		
		
		
		

	}

}
