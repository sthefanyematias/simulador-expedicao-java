package br.com.expedicao;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MissaoEspacial {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Tripulante> tripulacao = new ArrayList<>();
		Random dado = new Random();

		System.out.println("--- SISTEMA DE CONTROLE DE MISSÃO ---");

		int total = 0;
		while (total <= 0) {
			System.out.print("Quantos tripulantes deseja enviar? ");
			if (teclado.hasNextInt()) {
				total = teclado.nextInt();
				if (total <= 0) {
					System.out.println("Erro: A missão precisa de ao menos 1 pessoa.");
				}
			} else {
				System.out.println("Erro: Digite um número inteiro válido.");
				teclado.next();
			}
		}
		teclado.nextLine();

		for (int i = 0; i < total; i++) {
			System.out.println("\n--- Registro do Tripulante #" + (i + 1) + " ---");
			System.out.print("Nome: ");
			String nome = teclado.nextLine();

			int escolha = 0;
			while (escolha != 1 && escolha != 2) {
				System.out.print("Especialidade (1-Engenheiro, 2-Cientista): ");
				if (teclado.hasNextInt()) {
					escolha = teclado.nextInt();
					if (escolha != 1 && escolha != 2) {
						System.out.println("Opção inválida. Escolha 1 ou 2.");
					}
				} else {
					System.out.println("Erro: Digite apenas os números 1 ou 2.");
					teclado.next();
				}
			}
			teclado.nextLine();

			if (escolha == 1) {
				tripulacao.add(new Engenheiro(nome));
			} else {
				tripulacao.add(new Cientista(nome));
			}
		}

		boolean continuarMissao = true;
		int dia = 1;

		while (continuarMissao) {
			System.out.println("\n ---RELATÓRIO DE ATIVIDADE--- ");
			System.out.println("DIA: " + dia);

			for (Tripulante membro : tripulacao) {
				membro.realizarTarefa();

				if (membro instanceof Engenheiro) {
					((Engenheiro) membro).consertoDeEmergencia();
				} else if (membro instanceof Cientista) {
					((Cientista) membro).coletarDados();
				}

				int danoNoTurno = dado.nextInt(21);
				membro.receberDano(danoNoTurno);

				System.out.println("\nTripulante: " + membro.getNome());
				System.out.println("Saúde: " + membro.getSaude() + "%");

				String statusVida;
				if (membro.getSaude() > 20) {
					statusVida = "Operacional";
				} else if (membro.getSaude() > 0) {
					statusVida = "Crítico";
				} else {
					statusVida = "Incapacitado";
				}
				System.out.println("Status: " + statusVida);

				// Alertas adicionais
				if (membro.getSaude() <= 20 && membro.getSaude() > 0) {
					System.out.println("Alerta: Saúde Crítica.");
				} else if (membro.getSaude() == 0) {
					System.out.println("Alerta: Unidade fora de combate.");
				}
				System.out.println("------------------------------------");
			}

			String resposta = "";
			while (true) {
				System.out.print("\nDeseja prosseguir para o próximo dia? (s/n): ");
				resposta = teclado.next().toLowerCase();
				if (resposta.equals("s") || resposta.equals("n")) {
					break;
				}
				System.out.println("Erro: Comando inválido. Digite 's' ou 'n'.");
			}

			if (resposta.equals("n")) {
				continuarMissao = false;
			} else {
				dia++;
			}
		}

		System.out.println("\nMissão finalizada. Encerrando comunicação.");
		teclado.close();
	}
}