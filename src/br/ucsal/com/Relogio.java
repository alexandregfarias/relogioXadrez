package br.ucsal.com;

public class Relogio {

	private int tempoMaximo;
	private int tempoRestante;
	private boolean pausado;

	public Relogio(int tempoMaximo) {
		this.tempoMaximo = tempoMaximo;
		this.tempoRestante = tempoMaximo;
		this.pausado = true;
	}

	public int getTempoMaximo() {
		return tempoMaximo;
	}

	public int getTempoRestante() {
		return tempoRestante;
	}

	public void iniciar() {
		this.pausado = false;
		Thread thread = new Thread(() -> {
			while (tempoRestante > 0 && !pausado) {
				try {
					Thread.sleep(1000); // Espera 1 segundo
					tempoRestante--;
				} catch (InterruptedException e) {
					
				}
			}
		});
		thread.start();
	}

	public void pausar() {
		this.pausado = true;
	}

	public void reiniciar() {
		this.tempoRestante = this.tempoMaximo;
		this.pausado = true;
	}

}
