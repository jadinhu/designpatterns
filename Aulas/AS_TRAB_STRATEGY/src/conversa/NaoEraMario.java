package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class NaoEraMario implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": (...) e não era o Mário?");
	}

}
