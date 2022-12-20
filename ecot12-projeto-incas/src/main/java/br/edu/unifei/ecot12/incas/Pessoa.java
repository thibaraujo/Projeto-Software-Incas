package br.edu.unifei.ecot12.incas;


public abstract class Pessoa {
	private String nome, sexo;
	protected float renda;
	protected Regiao regiao;
	protected Funcao funcao;
	
	public Pessoa(Regiao regiao, Funcao funcao) {
		this.regiao = regiao;
		this.funcao = funcao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getRenda() {
		return renda;
	}
	public void setRenda(float renda) {
		this.renda = renda;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	
	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
	
}
