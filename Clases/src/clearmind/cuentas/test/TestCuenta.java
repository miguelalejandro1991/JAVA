package clearmind.cuentas.test;

import clearmind.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//CREO EL OBJETO CUENTA Y LO REFERENCIO CON CUENTA1
		Cuenta cuenta1 = new Cuenta("03476");
		
		//COLOCO UN VALOR DE SALDO EN LA CUENTA1
		cuenta1.setSaldo(675);
		
		//CREO EL OBJETO CUENTA Y LO REFERENCIO CON CUENTA2
		Cuenta cuenta2 =new Cuenta("03476","C", 98);
		
		//CREO EL OBJETO CUENTA Y LO REFERENCIA CON CUENTA3
		Cuenta cuenta3 =new Cuenta("03476");
		
		//modifico el tipo de cuenta
		cuenta3.setTipo("C");
		
		//IMPRIMO CUENTA1, CUENTA2 Y CUENTA3
		System.out.println("------VALORES INICIALES-------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		// MODIFICACIONES 
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		System.out.println("------VALORES MODIFICADOS-------");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		//CUENTA 4 
		Cuenta cuenta4 = new Cuenta ("0987");
		cuenta4.setSaldo(10);
		
		//CUENTA 5
		Cuenta cuenta5 =new Cuenta("0557","C",10);
		
		//CUENTA 6
		Cuenta cuenta6 =new Cuenta("0666");
		
		//IMPRIMO CUENTA4, CUENTA5 Y CUENTA6 CON MI ESTILO
		
		System.out.println("------CUENTAS CON MI ESTILO-------");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
		
		
		
		
		
		

	}

}
