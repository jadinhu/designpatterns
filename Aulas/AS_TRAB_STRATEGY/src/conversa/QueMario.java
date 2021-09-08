package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class QueMario implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": que Mário???");
	}

}
