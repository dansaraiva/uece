package atividade01.uece;

public class Professor {

	private String nome;
	private String endereco;
	private double salario;
	private int idade;
	private String sexo;
	private String estadoCivil;
	private String dataAdmissao;
	private int qtdDisciplinas;
	
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getQtdDisciplinas() {
		return qtdDisciplinas;
	}

	public void setQtdDisciplinas(int qtdDisciplinas) {
		this.qtdDisciplinas = qtdDisciplinas;
	}

	public void tirarFerias() {
		System.out.println(nome + ", entrou em férias!");
	}
	
	public void exibirResultados() {
		System.out.println("-- Dados do professor --");
		System.out.println("Nome: "+ nome);
		System.out.println("Endereço: "+ endereco);
		System.out.println("Salário: "+ salario);
		System.out.println("Idade: "+ idade);
		System.out.println("Sexo: "+ sexo);
		System.out.println("Estado cívil: "+ estadoCivil);
		System.out.println("Data de admissão: "+ dataAdmissao);
		System.out.println("Quantidade de disciplinas: "+ qtdDisciplinas);
	}
}
