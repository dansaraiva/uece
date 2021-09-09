package atividade01.uece;

public class Jogador {

	public String nome;
	public String endereco;
	public double salario;
	public int idade;
	public String posicao;
	public String estadoCivil;
	public String clubeCoracao;
	
	
	public void contundir() {
		System.out.println(nome + " está contundido!");
	}
	
	public void chutarBola() {
		System.out.println(nome + " chutou a bola!");
	}
	
	public void cabecear() {
		System.out.println(nome + " cabeceou a bola!");
	}
	
	public void correr() {
		System.out.println(nome + " correu atrás da bola!");
	}
}
