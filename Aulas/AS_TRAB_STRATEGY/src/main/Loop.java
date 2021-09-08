package main;

import amigos.Amigo;
import amigos.AmigoFuleiro;
import amigos.AmigoTrouxa;
import estaticos.Estaticos;

public class Loop implements Runnable {

	private Amigo fuleiro;
	private Amigo trouxa;
	private Thread thread;

	public Loop() {
		fuleiro = new AmigoFuleiro();
		trouxa = new AmigoTrouxa();
		thread = new Thread(this);
	}

	public void start() {
		thread.start();
	}

	@Override
	public void run() {
		try {
			trouxa.setConversa(Estaticos.avista);
			trouxa.acao(trouxa);
			Thread.sleep(3000);

			fuleiro.setConversa(Estaticos.chegando);
			fuleiro.acao(fuleiro);
			Thread.sleep(2500);

			fuleiro.setConversa(Estaticos.viuMario);
			fuleiro.acao(fuleiro);
			Thread.sleep(2500);

			trouxa.setConversa(Estaticos.queMario);
			trouxa.acao(trouxa);
			Thread.sleep(2300);

			fuleiro.setConversa(Estaticos.aqueleQueTecomeu);
			fuleiro.acao(fuleiro);
			Thread.sleep(3500);

			Estaticos.janela.setImagem(3);
			Thread.sleep(3000);

			trouxa.setConversa(Estaticos.avista);
			trouxa.acao(trouxa);
			Thread.sleep(3000);

			trouxa.setConversa(Estaticos.jaSei);
			trouxa.acao(trouxa);
			Thread.sleep(4000);

			trouxa.setConversa(Estaticos.jaSei2);
			trouxa.acao(trouxa);
			Thread.sleep(3000);

			fuleiro.setConversa(Estaticos.chegando);
			fuleiro.acao(fuleiro);
			Thread.sleep(2500);

			trouxa.setConversa(Estaticos.viuDunga);
			trouxa.acao(trouxa);
			Thread.sleep(2500);

			fuleiro.setConversa(Estaticos.irmao);
			fuleiro.acao(fuleiro);
			Thread.sleep(2500);

			trouxa.setConversa(Estaticos.queMario);
			trouxa.acao(trouxa);
			Thread.sleep(2000);

			fuleiro.setConversa(Estaticos.aqueleQueTecomeu);
			fuleiro.acao(fuleiro);
			Thread.sleep(3000);

			Estaticos.janela.setImagem(3);
			Thread.sleep(3000);

			fuleiro.setConversa(Estaticos.hey);
			fuleiro.acao(fuleiro);
			Thread.sleep(2000);

			trouxa.setConversa(Estaticos.queE);
			trouxa.acao(trouxa);
			Thread.sleep(2000);

			fuleiro.setConversa(Estaticos.calma);
			fuleiro.acao(fuleiro);
			Thread.sleep(2000);

			trouxa.setConversa(Estaticos.queJose);
			trouxa.acao(trouxa);
			Thread.sleep(2000);

			fuleiro.setConversa(Estaticos.aqueleQueTecomeu);
			fuleiro.acao(fuleiro);
			Thread.sleep(2500);

			trouxa.setConversa(Estaticos.naoEraMario);
			trouxa.acao(trouxa);
			Thread.sleep(2000);

			fuleiro.setConversa(Estaticos.nossa);
			fuleiro.acao(fuleiro);
			Thread.sleep(4000);

			Estaticos.janela.setTexto("XD");
			Estaticos.janela.setImagem(4);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
