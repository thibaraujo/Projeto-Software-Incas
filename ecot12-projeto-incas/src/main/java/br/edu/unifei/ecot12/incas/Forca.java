package br.edu.unifei.ecot12.incas;

public class Forca extends PoderMilitar {
	@Override
	public void atualiza(double p){
		this.valor = p*5;
	}
}
