package br.edu.unifei.ecot12.incas;

public class Soldado implements Funcao{
	private int batalhasTravadas;
	
	@Override
	public void atribuicao() {
		System.out.println("Lutando pela gloria eterna Inca! Ja realizei " + getBatalhasTravadas() + " batalhas");
	}
	
	public int getBatalhasTravadas() {
		return batalhasTravadas;
	}

	public void setBatalhasTravadas(int batalhasTravadas) {
		this.batalhasTravadas = batalhasTravadas;
	}
	
	
}
