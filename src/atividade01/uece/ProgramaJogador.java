package atividade01.uece;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaJogador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<Jogador> Jogadores = new ArrayList<Jogador>();
		
		for (int i = 0; i < 10; i++) {
			Jogador jog = new Jogador();
			
			System.out.println("Informe dados do Jogador: ");
			System.out.print("Digite o nome: ");
			jog.nome = entrada.nextLine();
			
			System.out.print("Digite a idade: ");
			jog.idade = entrada.nextInt();
			
			System.out.print("Digite estado c�vil: ");
			entrada.nextLine();
			jog.estadoCivil = entrada.nextLine();		
			
			System.out.print("Digite endere�o: ");
			jog.endereco = entrada.nextLine();
			
			System.out.print("Digite sal�rio: ");
			jog.salario = entrada.nextDouble();
			
			System.out.print("Digite o clube do cora��o: ");	
			entrada.nextLine();
			jog.clubeCoracao = entrada.nextLine();	
			
			System.out.print("Digite o posicionamento: ");	
			jog.posicao = entrada.nextLine();	
			
			Jogadores.add(jog);	
		}
		
		for (Jogador Jogador : Jogadores) {
			System.out.println("---------------------------------------------------");
			Jogador.contundir();
			Jogador.cabecear();
			Jogador.correr();
			Jogador.chutarBola();
		}
		
		entrada.close();
	}
}
