package atividade01.uece;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaProfessor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<Professor> professores = new ArrayList<Professor>();
		
		for (int i = 0; i < 3; i++) {
			Professor prof = new Professor();
			
			System.out.println("Informe dados do professor: ");
			System.out.print("Digite o nome: ");
			prof.nome = entrada.nextLine();
			
			System.out.print("Digite a idade: ");
			prof.idade = entrada.nextInt();
			
			System.out.print("Digite o sexo: ");
			entrada.nextLine();
			prof.sexo = entrada.nextLine();
			
			System.out.print("Digite estado cívil: ");
			prof.estadoCivil = entrada.nextLine();		
			
			System.out.print("Digite endereço: ");
			prof.endereco = entrada.nextLine();
			
			System.out.print("Digite salário: ");
			prof.salario = entrada.nextDouble();
			
			System.out.print("Digite data de admissão: ");	
			entrada.nextLine();
			prof.dataAdmissao = entrada.nextLine();	
			
			System.out.print("Digite a quantidade de disciplinas: ");
			prof.qtdDisciplinas = entrada.nextInt();		
			entrada.nextLine();
			
			professores.add(prof);	
		}
		
		for (Professor professor : professores) {
			System.out.println("---------------------------------------------------");
			professor.exibirResultados();
			professor.tirarFerias();
		}
		
		entrada.close();
	}
}
