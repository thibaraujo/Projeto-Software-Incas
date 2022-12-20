package br.edu.unifei.ecot12.incas;

public class Influencia extends PoderMilitar {
	@Override
	public void atualiza(double p){
		this.valor =  p*0.7;
	}
}
