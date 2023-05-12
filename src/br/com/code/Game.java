package br.com.code;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private Player p1;
	private Player p2;
	private int win;
	public String result;

	private Scanner scan = new Scanner(System.in);
	private Player playerAtual;
	private Player playerInativo;

	private void escolhePlayer() {
		Random r = new Random();
		int n = r.nextInt(100);

		if (n % 2 == 0) {
			playerAtual = p1;
			playerInativo = p2;
		} else {
			playerAtual = p2;
			playerInativo = p1;
		}
	}

	public void start(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		escolhePlayer();
		while (p1.getFighter().getLife() > 0 && p2.getFighter().getLife() > 0) {
			System.out.println("Vez do jogador: " + playerAtual.getNome());
			System.out.println("1: Ataque || 2: Especial ");
			int escolha = scan.nextInt();System.out.println();
			switch (escolha) {
			case 1:
				playerAtual.getFighter().ataca(playerInativo.getFighter());
				break;
			case 2:
				playerAtual.getFighter().especial(playerInativo.getFighter());
				break;
			default:
				System.out.println("opção invalida, perdeu a vez!!");
				break;
			}
			System.out.println(
					"O jogador " + playerInativo.getNome() + " tem " + playerInativo.getFighter().getLife() + " de vida");
			Player playerTemporario = playerAtual;
			playerAtual = playerInativo;
			playerInativo = playerTemporario;
		}
		if (p1.getFighter().getLife() < 0) {
			this.result = "Vencedor: " + p2.getNome() + ", personagem: " + p2.getFighter().getName()
					+ ", vida restante: " + p2.getFighter().getLife() + ". Perdedor: " + p1.getNome() + ", Personagem: "
					+ p1.getFighter().getName();
			System.out.println(result);
		} else {
			this.result = "Vencedor: " + p1.getNome() + ", personagem: " + p1.getFighter().getName()
					+ ", vida restante: " + p1.getFighter().getLife() + ". Perdedor: " + p2.getNome() + ", Personagem: "
					+ p2.getFighter().getName();
			System.out.println(result);
		}

	}
}