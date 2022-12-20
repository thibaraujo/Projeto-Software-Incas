package br.edu.unifei.ecot12.incas;

public class Sacerdote extends Pessoa {
	public Sacerdote(Regiao regiao, Funcao funcao) {
		super(regiao, funcao);
	}

	private int cultosRealizados;
	private Deus deus;
	
	public int getCultosRealizados() {
		return cultosRealizados;
	}

	public void setCultosRealizados(int cultosRealizados) {
		this.cultosRealizados = cultosRealizados;
	}

	public Deus getDeus() {
		return deus;
	}

	public void setDeus(Deus deus) {
		this.deus = deus;
	}
}
