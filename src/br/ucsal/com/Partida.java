package br.ucsal.com;

import java.util.Scanner;

public class Partida {
	private Relogio relogioJogador1;
    private Relogio relogioJogador2;
    private int numeroJogadas;

    public Partida(int tempoMaximo) {
        this.relogioJogador1 = new Relogio(tempoMaximo);
        this.relogioJogador2 = new Relogio(tempoMaximo);
        this.numeroJogadas = 0;
    }

    public void iniciar() {
    	 Scanner scanner = new Scanner(System.in);

    	    System.out.println("Pressione Enter para iniciar a partida...");
    	    scanner.nextLine();

    	    this.relogioJogador1.iniciar();

    	    while (this.relogioJogador1.getTempoRestante() > 0 && this.relogioJogador2.getTempoRestante() > 0) {
    	        System.out.println("Vez do jogador 2");
    	        System.out.println("Tempo restante do jogador 1: " + this.relogioJogador1.getTempoRestante() + "s");
    	        System.out.println("Tempo restante do jogador 2: " + this.relogioJogador2.getTempoRestante() + "s");

    	        System.out.println("Pressione Enter para continuar...");
    	        scanner.nextLine();

    	        this.relogioJogador1.pausar();
    	        this.relogioJogador2.iniciar();

    	        System.out.println("Vez do jogador 1");
    	        System.out.println("Tempo restante do jogador 1: " + this.relogioJogador1.getTempoRestante() + "s");
    	        System.out.println("Tempo restante do jogador 2: " + this.relogioJogador2.getTempoRestante() + "s");

    	        System.out.println("Pressione Enter para continuar...");
    	        scanner.nextLine();

    	        this.relogioJogador2.pausar();
    	        this.relogioJogador1.iniciar();

    	        this.incrementarNumeroJogadas();
    	    }

    	    System.out.println("Fim da partida!");

    	    if (this.relogioJogador1.getTempoRestante() == 0) {
    	        System.out.println("Jogador 2 venceu!");
    	    } else {
    	        System.out.println("Jogador 1 venceu!");
    	    }

    	    this.relogioJogador1.pausar();
    	    this.relogioJogador2.pausar();

    }

    public int getTempoJogador1() {
        return this.relogioJogador1.getTempoRestante();
    }

    public int getTempoJogador2() {
        return this.relogioJogador2.getTempoRestante();
    }

    public boolean isTerminada() {
        return (this.relogioJogador1.getTempoRestante() == 0 || this.relogioJogador2.getTempoRestante() == 0);
    }

    public void terminar() {
        this.relogioJogador1.pausar();
        this.relogioJogador2.pausar();
    }

    public void incrementarNumeroJogadas() {
        this.numeroJogadas++;
    }

    public int getNumeroJogadas() {
        return this.numeroJogadas;
    }
}

