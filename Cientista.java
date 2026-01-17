package br.com.expedicao;

import java.util.Random;

public class Cientista extends Tripulante {
	public Cientista(String nome) {
		super(nome);
	}

	@Override
	public void realizarTarefa() {
		System.out.println(nome + " está analisando amostras de cristais espaciais.");
	}

	public void coletarDados() {
		Random sorteador = new Random();
		int dadosEncontrados = sorteador.nextInt(10) + 1;
		System.out.println("Cientista " + nome + " descobriu " + dadosEncontrados + " novo(s) dado(s) científico(s).");
	}
}