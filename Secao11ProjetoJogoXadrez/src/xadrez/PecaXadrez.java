package xadrez;

import jogo.tabuleiro.Peca;
import jogo.tabuleiro.Tabuleiro;

public class PecaXadrez  extends Peca {
	
	private Color color;
	
	public PecaXadrez(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}
	
	
	public Color getColor() {
		return color;
	}
		

}
