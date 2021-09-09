package atividade01.uece;

public class Jogador {

	private String nome;
	private String endereco;
	private double salario;
	private int idade;
	private String posicao;
	private String estadoCivil;
	private String clubeCoracao;	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getClubeCoracao() {
		return clubeCoracao;
	}

	public void setClubeCoracao(String clubeCoracao) {
		this.clubeCoracao = clubeCoracao;
	}

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
