package aplicacao;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.PosicaoXadrez;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PartidaXadrez partidaXadrez = new PartidaXadrez();

		// PecaXadrez[][] pecas = partidaXadrez.getPecas();
		while (true) {
			UI.clearScreen();
			UI.imprimirTabuleiro(partidaXadrez.getPecas());

			System.out.println();
			
			System.out.print("Origem: ");
			PosicaoXadrez origem = UI.lerPosicaoXadrez(sc);
			
			System.out.println();
			
			System.out.print("Destino: ");
			PosicaoXadrez destino = UI.lerPosicaoXadrez(sc);

			PecaXadrez capturaPeca = partidaXadrez.performaceMovimentoXadrez(origem, destino);
		}

	}

}
