package br.com.expedicao;

public class Engenheiro extends Tripulante {
	public Engenheiro(String nome) {
		super(nome);
	}

	@Override
	public void realizarTarefa() {
		System.out.println(nome + " está consertando os painéis solares.");
	}

	public void consertoDeEmergencia() {
		System.out.println(nome + " realizou um reparo crítico no casco.");
	}
}