package br.edu.unifei.ecot12.incas;

public class Pachamama extends Deus {
	@Override 
	public void intercessao() {
		if(sacrificios >= 5) {
			System.out.println("Sacrificios suficientes: Terras ferteis!");
		}else {
			System.out.println("Sacrificios insuficientes: Terras inferteis!");
		}
	}
}
