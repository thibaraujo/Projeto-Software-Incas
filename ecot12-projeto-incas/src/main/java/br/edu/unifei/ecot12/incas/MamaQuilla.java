package br.edu.unifei.ecot12.incas;

public class MamaQuilla extends Deus {
	@Override 
	public void intercessao() {
		if(sacrificios >= 8) {
			System.out.println("Sacrificios suficientes: Noites Iluminadas");
		}else {
			System.out.println("Sacrificios insuficientes: Noites tenebrosas");
		}
	}
}
