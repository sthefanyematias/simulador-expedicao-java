package br.com.expedicao;

import java.util.ArrayList;
import java.util.Random;

public class MissaoEspacial {
	public static void main(String[] args) {
		ArrayList<Tripulante> tripulacao = new ArrayList<>();
		Random dado = new Random();

		tripulacao.add(new Engenheiro("João"));
		tripulacao.add(new Cientista("Sthefany"));
		tripulacao.add(new Engenheiro("Miguel"));

		System.out.println("--- RELATÓRIO DE MISSÃO ---");

		for (Tripulante membro : tripulacao) {
			System.out.println("-------------------------");
			membro.realizarTarefa();

			if (membro instanceof Engenheiro) {
				Engenheiro eng = (Engenheiro) membro;
				eng.consertoDeEmergencia();
			} else if (membro instanceof Cientista) {
				((Cientista) membro).coletarDados();
			}

			int danoDoDia = dado.nextInt(30);
			membro.receberDano(danoDoDia);

			System.out.println("Situação de " + membro.getNome() + ": Saúde em " + membro.getSaude() + "%");
		}

		System.out.println("-------------------------");
		System.out.println("Fim do turno.");
	}
}