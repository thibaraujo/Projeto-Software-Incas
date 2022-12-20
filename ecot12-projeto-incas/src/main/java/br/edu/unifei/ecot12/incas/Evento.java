package br.edu.unifei.ecot12.incas;
import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
	private List<PoderMilitar> fortalezas = new ArrayList<>();
	
	protected void notificaEvento(int p) {
		for (PoderMilitar i: fortalezas) {
			i.atualiza(p);
		}
	}
	public List<PoderMilitar> getFortalezas() {
		return fortalezas;
	}
	public void setFortalezas(List<PoderMilitar> fortalezas) {
		this.fortalezas = fortalezas;
	}
	
}
