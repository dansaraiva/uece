package atividade01.uece;

public class Professor {

	public String nome;
	public String endereco;
	public double salario;
	public int idade;
	public String sexo;
	public String estadoCivil;
	public String dataAdmissao;
	public int qtdDisciplinas;
	
	public void tirarFerias() {
		System.out.println(nome + ", entrou em f�rias!");
	}
	
	public void exibirResultados() {
		System.out.println("-- Dados do professor --");
		System.out.println("Nome: "+ nome);
		System.out.println("Endere�o: "+ endereco);
		System.out.println("Sal�rio: "+ salario);
		System.out.println("Idade: "+ idade);
		System.out.println("Sexo: "+ sexo);
		System.out.println("Estado c�vil: "+ estadoCivil);
		System.out.println("Data de admiss�o: "+ dataAdmissao);
		System.out.println("Quantidade de disciplinas: "+ qtdDisciplinas);
	}
}
