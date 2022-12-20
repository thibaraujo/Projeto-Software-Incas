package br.edu.unifei.ecot12.incas;

public abstract class PoderMilitar {
	protected double valor;
	protected abstract void atualiza(double p);
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
