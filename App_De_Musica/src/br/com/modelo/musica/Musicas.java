package br.com.modelo.musica;
import java.util.Scanner;

public class Musicas extends Classe_Pai {
	
	public static void Reproduzir() {
		
		Scanner scanner = new Scanner(System.in);
		Musicas musicas = new Musicas();
		
		System.out.println("Escolha a musica a ser reproduzida:");
	     System.out.println("1. 'Soil'");
	     System.out.println("2. 'Kon Queso'");
	     
	    int escolha = scanner.nextInt();
	    
	    if (escolha == 1) {
	    	
	    	musicas.setTitulo("Soil");
			musicas.setGenero("Rock");
			musicas.setArtista("System of a Down");
			musicas.setDuracao(3.25);
			musicas.setTotalDeReproducoes(25);
			System.out.println("Você está ouvindo 'Soil'.");
	    	musicas.infoAudio();
	    	System.out.println("Tempo total escutado: " + musicas.TempoDeRepTotal() + " minutos");
	    	System.out.println("/------------------------------------------/");
	    	musicas.Curtir();
	    	
	    } else {
	    	
	    	musicas.setTitulo2("Kon Queso");
			musicas.setGenero2("Rap");
			musicas.setArtista2("MF DOOM");
			musicas.setDuracao2(3.35);
			musicas.setTotalDeReproducoes2(35);
			System.out.println("Você está ouvindo 'Kon Queso'.");
	    	musicas.infoAudio2();
	    	System.out.println("Tempo total escutado: " + musicas.TempoDeRepTotal2() + " minutos");
	    	System.out.println("/------------------------------------------/");
	    	musicas.Curtir2();
	    }
	    
	}
}
