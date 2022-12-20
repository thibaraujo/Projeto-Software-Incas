package br.edu.unifei.ecot12.incas;


public class SapaInca {
	private int quant;
	private static SapaInca instancia = new SapaInca();
	private String nome;
	
	private SapaInca() {}
	
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	public static SapaInca getInstancia() {
		return instancia;
	}

	public void novoSapa() {
		quant++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
