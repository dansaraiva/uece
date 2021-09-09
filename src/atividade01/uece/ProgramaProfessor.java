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
			prof.setNome(entrada.nextLine());
			
			System.out.print("Digite a idade: ");
			prof.setIdade(entrada.nextInt());
			
			System.out.print("Digite o sexo: ");
			entrada.nextLine();
			prof.setSexo(entrada.nextLine());
			
			System.out.print("Digite estado c�vil: ");
			prof.setEstadoCivil(entrada.nextLine());		
			
			System.out.print("Digite endere�o: ");
			prof.setEndereco(entrada.nextLine());
			
			System.out.print("Digite sal�rio: ");
			prof.setSalario(entrada.nextDouble());
			
			System.out.print("Digite data de admiss�o: ");	
			entrada.nextLine();
			prof.setDataAdmissao(entrada.nextLine());	
			
			System.out.print("Digite a quantidade de disciplinas: ");
			prof.setQtdDisciplinas(entrada.nextInt());		
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
