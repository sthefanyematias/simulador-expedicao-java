package br.com.expedicao;

public abstract class Tripulante {
	protected String nome;
	protected int saude;

	public Tripulante(String nome) {
		this.nome = nome;
		this.saude = 100;
	}

	public abstract void realizarTarefa();

	public void receberDano(int pontos) {
		this.saude -= pontos;
		if (this.saude < 0) {
			this.saude = 0;
		}
	}

	public String getNome() {
		return nome;
	}

	public int getSaude() {
		return saude;
	}
}