package br.edu.unifei.ecot12.incas;

public class Pastor implements Funcao {
	private int quantidadeLhama;
	
	@Override
	public void atribuicao() {
		System.out.println("Estou cuidando das minhas " +  getQuantidadeLhama() +  " Lhamas!");
	}

	public int getQuantidadeLhama() {
		return quantidadeLhama;
	}

	public void setQuantidadeLhama(int quantidadeLhama) {
		this.quantidadeLhama = quantidadeLhama;
	}
	
}
