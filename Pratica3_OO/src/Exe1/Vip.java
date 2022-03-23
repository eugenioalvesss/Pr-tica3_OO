package Exe1;

public class Vip extends Ingresso {
	
	public Vip(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	private double valorAdicional;

	public Vip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimeVip () {
		
		double valorVip = valorAdicional + getValor();
		
		System.out.println("===Ingresso VIP===");
		System.out.println("Valor ingresso com adiconal: " + valorVip);
		
	}
	
	
}
