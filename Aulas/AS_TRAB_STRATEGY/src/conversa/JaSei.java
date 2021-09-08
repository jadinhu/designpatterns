package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class JaSei implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": *pensa* já sei, vou perguntar se ele conhece Dunga...");
	}

}
