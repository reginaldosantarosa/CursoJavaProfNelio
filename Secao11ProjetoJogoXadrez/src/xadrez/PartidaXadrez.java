package xadrez;

import jogo.tabuleiro.Peca;
import jogo.tabuleiro.Posicao;
import jogo.tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro= new Tabuleiro(8, 8);
		iniciarSetup();
	}
		
	
	public PecaXadrez[][] getPecas(){

		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		
		for (int i=0; i < tabuleiro.getLinhas(); i++) {
			for(int j=0; j < tabuleiro.getColunas();j++) {
				mat[i][j]=(PecaXadrez) tabuleiro.getPeca(i, j);
			}
		}
		
		return mat;
	}	
	
	public PecaXadrez performaceMovimentoXadrez(PosicaoXadrez origemPosicao, PosicaoXadrez destinoPosicao) {
		Posicao origem = origemPosicao.paraPosicao();
		Posicao destino = destinoPosicao.paraPosicao();
		validacaoOrigemPosicao(origem);
		Peca capturaPeca = fazerMover(origem, destino);
		return (PecaXadrez) capturaPeca;
	}
	
	private Peca fazerMover(Posicao origem, Posicao destino) {
		Peca p = tabuleiro.removerPeca(origem);
		Peca capturadaPeca = tabuleiro.removerPeca(destino);
		tabuleiro.colocarPeca(p, destino);
		return capturadaPeca;
	}
	
	
	private void validacaoOrigemPosicao(Posicao posicao) {
		if (!tabuleiro.existePeca(posicao)) {
			throw new XadrezException("There is no piece on source position");
		}
	}
	
	
	private void colocarNovapeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.colocarPeca(peca, new PosicaoXadrez(coluna, linha).paraPosicao());
	}
	
	public void iniciarSetup() {

		colocarNovapeca('c', 1, new Torre(tabuleiro, Color.BRANCO));
		colocarNovapeca('c', 2, new Torre(tabuleiro, Color.BRANCO));
		colocarNovapeca('d', 2, new Torre(tabuleiro, Color.BRANCO));
		colocarNovapeca('e', 2, new Torre(tabuleiro, Color.BRANCO));
		colocarNovapeca('e', 1, new Torre(tabuleiro, Color.BRANCO));
		colocarNovapeca('d', 1, new Rei(tabuleiro, Color.BRANCO));

		colocarNovapeca('c', 7, new Torre(tabuleiro, Color.PRETO));
		colocarNovapeca('c', 8, new Torre(tabuleiro, Color.PRETO));
		colocarNovapeca('d', 7, new Torre(tabuleiro, Color.PRETO));
		colocarNovapeca('e', 7, new Torre(tabuleiro, Color.PRETO));
		colocarNovapeca('e', 8, new Torre(tabuleiro, Color.PRETO));
		colocarNovapeca('d', 8, new Rei(tabuleiro, Color.PRETO));

		
	}

}
