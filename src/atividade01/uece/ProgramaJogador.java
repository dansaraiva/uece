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
			jog.setNome(entrada.nextLine());
			
			System.out.print("Digite a idade: ");
			jog.setIdade(entrada.nextInt());
			
			System.out.print("Digite estado cívil: ");
			entrada.nextLine();
			jog.setEstadoCivil(entrada.nextLine());		
			
			System.out.print("Digite endereço: ");
			jog.setEndereco(entrada.nextLine());
			
			System.out.print("Digite salário: ");
			jog.setSalario(entrada.nextDouble());
			
			System.out.print("Digite o clube do coração: ");	
			entrada.nextLine();
			jog.setClubeCoracao(entrada.nextLine());	
			
			System.out.print("Digite o posicionamento: ");	
			jog.setPosicao(entrada.nextLine());	
			
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
