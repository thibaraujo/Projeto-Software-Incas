package br.edu.unifei.ecot12.incas;

public class Esperanca extends PoderMilitar {
	@Override
	public void atualiza(double p){
		this.valor = p*0.3;
	}
}
