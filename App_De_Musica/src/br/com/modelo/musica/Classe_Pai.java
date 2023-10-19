package br.com.modelo.musica;

import java.util.Scanner;

public class Classe_Pai {

	Scanner scanner = new Scanner(System.in);

	private String titulo, titulo2;
	private double duracao, duracao2;
	private int totalDeReproducoes, totalDeReproducoes2;
	protected int curtidas, curtidas2;
	private String genero, genero2;
	private String artista, artista2;
	private double tempoEscutado, tempoEscutado2;

	public double getTempoEscutado() {
		return tempoEscutado;
	}

	public void setTempoEscutado(double tempoEscutado) {
		this.tempoEscutado = tempoEscutado;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getTotalDeReproducoes() {
		return totalDeReproducoes;
	}

	public void setTotalDeReproducoes(int totalDeReproducoes) {
		this.totalDeReproducoes = totalDeReproducoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getTempoEscutado2() {
		return tempoEscutado2;
	}

	public void setTempoEscutado2(double tempoEscutado2) {
		this.tempoEscutado2 = tempoEscutado2;
	}

	public String getArtista2() {
		return artista2;
	}

	public void setArtista2(String artista2) {
		this.artista2 = artista2;
	}

	public String getTitulo2() {
		return titulo2;
	}

	public void setTitulo2(String titulo2) {
		this.titulo2 = titulo2;
	}

	public double getDuracao2() {
		return duracao2;
	}

	public void setDuracao2(double duracao2) {
		this.duracao2 = duracao2;
	}

	public int getTotalDeReproducoes2() {
		return totalDeReproducoes2;
	}

	public void setTotalDeReproducoes2(int totalDeReproducoes2) {
		this.totalDeReproducoes2 = totalDeReproducoes2;
	}

	public int getCurtidas2() {
		return curtidas2;
	}

	public void setCurtidas2(int curtidas2) {
		this.curtidas2 = curtidas2;
	}

	public String getGenero2() {
		return genero2;
	}

	public void setGenero2(String genero2) {
		this.genero2 = genero2;
	}

	public void infoAudio() {

		System.out.println("Titulo: " + titulo);
		System.out.println("Genero: " + genero);
		System.out.println("Artista: " + artista);
		System.out.println("Duração: " + duracao);
		System.out.println("Total de reproduções: " + totalDeReproducoes);
		System.out.println("Curtidas: " + curtidas);
	}

	public void infoAudio2() {
		System.out.println("Titulo: " + titulo2);
		System.out.println("Genero: " + genero2);
		System.out.println("Artista: " + artista2);
		System.out.println("Duração: " + duracao2);
		System.out.println("Total de reproduções: " + totalDeReproducoes2);
		System.out.println("Curtidas: " + curtidas2);
	}

	public double TempoDeRepTotal() {

		return totalDeReproducoes * duracao;

	}

	public double TempoDeRepTotal2() {

		return totalDeReproducoes2 * duracao2;

	}

	public void Curtir() {
		System.out.println("Gostaria de curtir a música 'Soil'?");
		System.out.println("1. Sim");
		System.out.println("2. Não");

		int escolha2 = scanner.nextInt();

		if (escolha2 == 1) {
			curtidas++;
			System.out.println("Curtidas: " + curtidas);
		}
	}

	public void Curtir2() {
		System.out.println("Gostaria de curtir a música 'Kon Queso'?");
		System.out.println("1. Sim");
		System.out.println("2. Não");

		int escolha3 = scanner.nextInt();

		if (escolha3 == 1) {
			curtidas2++;
			System.out.println("Curtidas: " + curtidas2);
		}
	}
}
