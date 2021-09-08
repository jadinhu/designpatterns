package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class QueE implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": O QUE É, KCT!?");
	}

}
