package Entidade;


public abstract class Forma {

	private double base;
	private double altura;
	private double largura;
	
	public Forma(double base, double altura, double largura) {
		this.base = base;
		this.altura = altura;
		this.largura = largura;
	}
	
	public double calcularAreaT() {
		return (base * altura);
	}
	
	public double calcularAreaR() {
		return (largura * altura);
	}
	
	
	
	
	

}
