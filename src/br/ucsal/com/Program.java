package br.ucsal.com;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		   Scanner scanner = new Scanner(System.in);

	        System.out.println("Informe o tempo máximo de cada jogador (em segundos):");
	        int tempoMaximo = scanner.nextInt();

	        Partida partida = new Partida(tempoMaximo);

	        partida.iniciar();

	        partida.terminar();

	        System.out.println("Fim da partida!");
	        System.out.println("Número de jogadas: " + partida.getNumeroJogadas());
	        System.out.println("Tempo restante do jogador 1: " + partida.getTempoJogador1() + "s");
	        System.out.println("Tempo restante do jogador 2: " + partida.getTempoJogador2() + "s");
	    }

}
