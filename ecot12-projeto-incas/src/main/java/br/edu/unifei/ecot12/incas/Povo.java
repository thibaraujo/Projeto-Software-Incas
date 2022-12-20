package br.edu.unifei.ecot12.incas;

public class Povo extends Pessoa{
	//protected Funcao funcao;
	public Povo(Regiao regiao, Funcao funcao) {
		super(regiao, funcao);
	}

	public float contribuicao() {
		 return regiao.impostos(renda);
	}

}
