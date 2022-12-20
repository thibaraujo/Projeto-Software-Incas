//Thiago Batista Araújo - 2021032968
package br.edu.unifei.ecot12.incas;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void testePovo(Povo p1, Povo p2, Povo p3, Povo p4) {
		System.out.println("TESTE POVO\n");
		//engenheiro de antisuyu (p1)
		System.out.println("Teste engenheiro: \n" + p1.getNome() + 
		" possui sexo " + p1.getSexo() + ", ganha " + p1.getRenda() + 
		" e paga " + p1.contribuicao() + " de impostos!");
		p1.getFuncao().atribuicao();
		 
		//pastor de collasuyu (p2)
		System.out.println("\nTeste pastor: \n" + p2.getNome() + 
		" possui sexo " + p2.getSexo() + ", ganha " + p2.getRenda() + 
		" e paga " + p2.contribuicao() + " de impostos!");
		p2.getFuncao().atribuicao();
		
		//agricultor de continsuyu (p3)
		System.out.println("\nTeste agricultor: \n" + p3.getNome() + 
		" possui sexo " + p3.getSexo() + ", ganha " + p3.getRenda() + 
		" e paga " + p3.contribuicao() + " de impostos!");
		p3.getFuncao().atribuicao();
		
		//soldado de chinchansuyu (p4)
		System.out.println("\nTeste soldado: \n" + p4.getNome() + 
		" possui sexo " + p4.getSexo() + ", ganha " + p4.getRenda() + 
		" e paga " + p4.contribuicao() + " de impostos!");
		p4.getFuncao().atribuicao();
		
		//*OBS: nota-se que "p.contribuicao()" demonstra o pleno funcionamento do padrao ponte!
	}
	
	public static void testeSacerdote(Sacerdote s1, Sacerdote s2, Sacerdote s3, Sacerdote s4) {
		System.out.println("\n\nTESTE SACERDOTES\n");
		//sacerdote deus inti (s1)
		System.out.println("O sacerdote " + s1.getNome() + " realizou " + s1.getCultosRealizados() + 
				" Cultos! E realizara intercessao para o Deus " + s1.getDeus().nome);
		s1.getDeus().intercessao();
		
		//sacerdote deusa viracocha
		System.out.println("\nO sacerdote " + s2.getNome() + " realizou " + s2.getCultosRealizados() + 
				" Cultos! E realizara intercessao para o Deus " + s2.getDeus().nome);
		s2.getDeus().intercessao();
		
		//sacerdote deus MamaQuilla
		System.out.println("\nO sacerdote " + s3.getNome() + " realizou " + s3.getCultosRealizados() + 
				" Cultos! E realizara intercessao para o Deus " + s3.getDeus().nome);
		s3.getDeus().intercessao();
		
		//sacerdote deus Pachamama
		System.out.println("\nO sacerdote " + s4.getNome() + " realizou " + s4.getCultosRealizados() + 
				" Cultos! E realizara intercessao para o Deus " + s4.getDeus().nome);
		s4.getDeus().intercessao();
		
		//*OBS: nota-se que sacerdotes nao possuem funcao alem de serem sacerdotes, e nao pagam impostos
	}
	
	public static void testePoderMilitar(Batalha b1, Soldado sold1, Forca forca, Esperanca esperanca, Influencia influencia) {
		List<PoderMilitar> listaFortalezas = new ArrayList<>(); //utilizado no padrao observador
		System.out.println("\n\nTESTE METODO OBSERVADOR E PODER MILITAR\n");
		listaFortalezas.add(forca); //observador1
		listaFortalezas.add(esperanca); //observador2
		listaFortalezas.add(influencia); //observador3
		 
		
		System.out.println("\n" + "Forca: " + forca.valor + " | Esperanca: " + esperanca.valor + " | Influencia: " + influencia.valor);
		System.out.println("\nAdicionando soldados...\n"); 
		for (int i = 0; i<10; i++ ) { //toda vez que um soldado morre ou eh adicionado em sujeito, a forca, esperanca e influencia do exercito muda
			 b1.setFortalezas(listaFortalezas);
			 b1.addSoldado(sold1);
			 System.out.println("\nsoldado adicionado");
			 System.out.println("\n" + "Forca: " + forca.valor + " | Esperanca: " + esperanca.valor + " | Influencia: " + influencia.valor);
		 }
		 
		System.out.println("\n\nRemovendo soldados...\n");
		 for (int i = 0; i<5; i++ ) {
			 b1.setFortalezas(listaFortalezas);
			 b1.soldadoMorto(sold1);
			 System.out.println("\nsoldado morto");
			 System.out.println("\n" + "Forca: " + forca.valor + " | Esperanca: " + esperanca.valor + " | Influencia: " + influencia.valor);
		 }
	}
	
	public static void testeSapa(SapaInca sapa) {
		 System.out.println("\n\nTESTE SAPAINCA - OBJETO UNICO\n");
		 System.out.println("Reverenciem o mais novo Sapa: " + sapa.getNome() + 
				 "! Sapas existentes na historia = " + sapa.getQuant()+ "\n");
	}
	
	public static void main(String[] args) {
		/*CRIANDO REGIÕES*/
		Antisuyu antisuyu = new Antisuyu();
		Collasuyu collasuyu = new Collasuyu();
		Cuntinsuyu continsuyu = new Cuntinsuyu();
		Chinchansuyu chinchansuyu = new Chinchansuyu();
		
		/*CRIANDO PROFISSOES*/
		Pastor pastor = new Pastor();
		pastor.setQuantidadeLhama(50);
		Agricultor agricultor = new Agricultor();
		agricultor.setPlantacao("cafe");
		Engenheiro engenheiro1 = new Engenheiro();
		engenheiro1.setConstrucoesFeitas(30);
		Engenheiro engenheiro2 = new Engenheiro();
		engenheiro2.setConstrucoesFeitas(6);
		Soldado soldado = new Soldado();
		soldado.setBatalhasTravadas(15);
		
		/*CRIANDO DEUSES*/
		Inti inti = new Inti();
		inti.setNome("Inti");
		inti.setSacrificios(51);
		
		Viracocha viracocha = new Viracocha();
		viracocha.setNome("Viracocha");
		viracocha.setSacrificios(100);
		
		MamaQuilla mamaquilla = new MamaQuilla();
		mamaquilla.setNome("Mama Quilla");
		mamaquilla.setSacrificios(1);
		
		Pachamama pachamama = new Pachamama();
		pachamama.setNome("Pachamama");
		pachamama.setSacrificios(80);
		
		
		/*CRIANDO PESSOAS*/
		
		//Sacerdotes
		Sacerdote s1 = new Sacerdote(antisuyu, null);
		s1.setNome("Daciolo");
		s1.setCultosRealizados(10);
		s1.setDeus(inti);
		Sacerdote s2 = new Sacerdote(collasuyu, null);
		s2.setNome("Geralda");
		s2.setCultosRealizados(8);
		s2.setDeus(viracocha);
		Sacerdote s3 = new Sacerdote(continsuyu, null);
		s3.setNome("Roney");
		s3.setCultosRealizados(6);
		s3.setDeus(mamaquilla);
		Sacerdote s4 = new Sacerdote(chinchansuyu, null);
		s4.setNome("Pablo");
		s4.setCultosRealizados(4);
		s4.setDeus(pachamama);
		
		//Povo
		Povo p1 = new Povo(antisuyu, engenheiro1);
		p1.setNome("Enzo");
		p1.setRenda(20);
		p1.setSexo("Masculino");
		p1.setRegiao(antisuyu);
		p1.setFuncao(engenheiro1);
		Povo p2 = new Povo(collasuyu, pastor);
		p2.setNome("Marcola");
		p2.setRenda(340);
		p2.setSexo("Masculino");
		p2.setRegiao(collasuyu);
		p2.setFuncao(pastor);
		Povo p3 = new Povo(continsuyu, agricultor);
		p3.setNome("Domiciano");
		p3.setRenda(200);
		p3.setSexo("Masculino");
		p3.setFuncao(agricultor);
		Povo p4 = new Povo(chinchansuyu, soldado);
		p4.setNome("Rudel");
		p4.setRenda(80);
		p4.setSexo("Masculino");
		p4.setFuncao(soldado);
		
		
		/*CRIANDO CARACTERISTICAS DO EXERCITO*/
		 Forca forca = new Forca();
		 Esperanca esperanca = new Esperanca();
		 Influencia influencia = new Influencia();
		 Batalha b1 = new Batalha(); //sujeito1
		 Soldado sold1 = new Soldado();
		 
		 
		 /*CRIANDO SAPA*/
		 SapaInca sapa = SapaInca.getInstancia();
		 sapa.setNome("eyshua");
		 sapa.novoSapa();
		 sapa.setNome("Alayu");
		 sapa.novoSapa();
		 sapa.setNome("Tupac");
		 sapa.novoSapa();
		
		/*##################################- TESTES -#####################################*/
		//TESTE POVO E FUNCAO (PONTE)
		 testePovo(p1, p2, p3, p4);
		
		//TESTE SACERDOTE E DEUSES
		 testeSacerdote(s1,s2,s3,s4);
		
		//TESTES PODER MILITAR DA CIVILIZACAO (OBSERVADOR)
		 testePoderMilitar(b1, sold1, forca, esperanca, influencia);
		 
		//TESTE SAPA (OBJETO UNICO)
		 testeSapa(sapa);
		
	}
}
