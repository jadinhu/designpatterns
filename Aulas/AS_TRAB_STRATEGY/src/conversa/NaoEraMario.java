package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class NaoEraMario implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": (...) e n�o era o M�rio?");
	}

}
