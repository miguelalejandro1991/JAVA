package clearmind.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private int  saldo;
	
	public Cuenta(String id) {
		this.id=id;
		this.tipo= "A"; //VALOR POR DEFECTO
		//SALDO QUEDA COMO 0.0 POR DEFECTO
	}
	public Cuenta(String id, String tipo, int saldo) {
		this.id=id;
		this.tipo= tipo;
		this.saldo= saldo;
	}
	
	
	
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	// METODO IMPRIMIR
	public void imprimir() {
		System.out.println("CUENTA");
		System.out.println("Numero de Cuenta; " +id);
		System.out.println("Tipo: " +tipo );
		System.out.println("Saldo: USD " +saldo);
		
	}
	
	//METODO IMPRIMIR CON MI ESTILO
	public void imprimirConMiEstilo() {
		System.out.println("----CUENTA----");
		System.out.println("| Numero de Cuenta: " +id+" |");
		System.out.println("| Tipo: " +tipo +" |");
		System.out.println("| Saldo: USD" +saldo+" |");
		System.out.println("--------------");
		
	} 
	
	

}
