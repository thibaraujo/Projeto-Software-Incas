//Thiago Batista Araújo - 2021032968
package br.edu.unifei.ecot12.incas;

import java.util.ArrayList;
import java.util.List;

public class Batalha extends Evento {
	private int saldoSoldados;
	private List<Soldado> soldados = new ArrayList<>();
	
	public void addSoldado(Soldado s) {
		soldados.add(s);
		setSaldoSoldados();
	}
	
	public void soldadoMorto(Soldado s) {
		soldados.remove(s);
		setSaldoSoldados();
	}
	
	public int getSaldoSoldados() {
		return saldoSoldados;
	}
	
	public void setSaldoSoldados() {
		//System.out.println("Aqui " + getSoldados().size());
		notificaEvento(getSoldados().size());
		this.saldoSoldados = getSoldados().size();
	}
	
	public List<Soldado> getSoldados() {
		return soldados;
	}
	
	public void setSoldados(List<Soldado> soldados) {
		this.soldados = soldados;
	}
}
