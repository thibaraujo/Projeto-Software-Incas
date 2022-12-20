//Thiago Batista Araújo - 2021032968
package br.edu.unifei.ecot12.incas;

public class Engenheiro implements Funcao {
	private int construcoesFeitas;
	@Override
	public void atribuicao() {
		System.out.println("Nao sei calculo I, mas construi Machu Picchu e mais outras " + (getConstrucoesFeitas()-1) + " construcoes");
	}
	public int getConstrucoesFeitas() {
		return construcoesFeitas;
	}
	public void setConstrucoesFeitas(int construcoesFeitas) {
		this.construcoesFeitas = construcoesFeitas;
	}
}
