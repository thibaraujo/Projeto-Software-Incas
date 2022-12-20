//Thiago Batista Araújo - 2021032968
package br.edu.unifei.ecot12.incas;

public abstract class Deus {
	protected int sacrificios;
	protected String nome;
	
	public void intercessao() {}
	
	public int getSacrificios() {
		return sacrificios;
	}

	public void setSacrificios(int sacrificios) {
		this.sacrificios = sacrificios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
