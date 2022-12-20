//Thiago Batista Araújo - 2021032968
package br.edu.unifei.ecot12.incas;

public class Agricultor implements Funcao {

	private String plantacao;
	@Override
	public void atribuicao() {
		System.out.println("O agro nao pode parar!Estou plantando " + getPlantacao());
	}
	public String getPlantacao() {
		return plantacao;
	}
	public void setPlantacao(String plantacao) {
		this.plantacao = plantacao;
	}
}
