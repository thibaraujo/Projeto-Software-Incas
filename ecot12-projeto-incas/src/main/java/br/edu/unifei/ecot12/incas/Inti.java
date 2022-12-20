package br.edu.unifei.ecot12.incas;

public class Inti extends Deus {
	@Override 
	public void intercessao() {
		if(sacrificios >= 10) {
			System.out.println("Sacrificios suficientes: dias ensolarados!");
		}else {
			System.out.println("Sacrificios insuficientes: dias chuvosos!");
		}
	}
}
