package jogo.tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1 ) {
			throw new TabuleiroException("Erro criando tabuleiro, necessario uma linha e uma coluna ao menos");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	
	public int getColunas() {
		return colunas;
	}

		
	public Peca getPeca(int linha, int coluna) {
		if (! existePosicao(linha, coluna) ) {
			throw new TabuleiroException("Posicao nao exite");
		}
		return pecas[linha][coluna];
		
	}
	
	public Peca getPeca(Posicao posicao) {
		if (! existePosicao(posicao) ) {
			throw new TabuleiroException("Posicao nao exite");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
		
	}
	
	//atribunido uma peca a uma posicao do tabuleiro
	public void colocarPeca(Peca peca, Posicao posicao) {
		if (existePeca(posicao)) {
			throw new TabuleiroException("Ja existe peca nesta posicao: " + posicao);
		}
		
		pecas[posicao.getLinha()][posicao.getColuna()]=peca;
		peca.posicao=posicao;
		
	}
	
	private boolean existePosicao(int linha, int coluna) {
		return linha>=0 && linha < linhas && coluna >=0 && coluna < colunas; 
		
	}
	public boolean existePosicao(Posicao posicao){		
		return existePosicao(posicao.getLinha(),posicao.getColuna());
	}
		
	//thereIsAPiece
	public boolean existePeca(Posicao posicao) {
		if (! existePosicao(posicao) ) {
			throw new TabuleiroException("Posicao nao exite");
		}
		return getPeca(posicao)!= null;
		
	}
	
	
	public Peca removerPeca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new TabuleiroException("Position not on the board");
		}
		
		if (getPeca(posicao) == null) {
			return null;
		}
		Peca aux = getPeca(posicao);
		aux.posicao = null;
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;
	}
	
	
	
}
