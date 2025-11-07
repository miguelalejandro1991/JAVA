package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu=new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		
		resultadoSuma=calcu.sumar(5, 8);
		resultadoResta=calcu.restar(8, 5);
		resultadoMultiplicacion=calcu.multiplicar(8, 8);
		resultadoDivision=calcu.dividir(10, 2);
		resultadoPromedio=calcu.promediar(9, 10, 9);
		calcu.mostrarResultado(); // como no retorna nada se coloca 
		System.out.println("RESULTADO SUMA: " +resultadoSuma);			
		System.out.println("RESULTADO RESTA: " +resultadoResta);
		System.out.println("RESULTADO MULTIPILICACION: " +resultadoMultiplicacion);
		System.out.println("RESULTADO DIVISION: " +resultadoDivision);
		System.out.println("RESULTADO PROMEDIO: " +resultadoPromedio);
		
	}
	

}
