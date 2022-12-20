package br.edu.unifei.ecot12.incas;

public class Viracocha extends Deus {
	@Override 
	public void intercessao() {
		if(sacrificios >= 50) {
			System.out.println("Sacrificios suficientes: Mundo em paz!");
		}else {
			System.out.println("Sacrificios insuficientes: Caos na Terra!");
		}
	}
}
