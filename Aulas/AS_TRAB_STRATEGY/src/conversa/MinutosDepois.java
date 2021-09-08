package conversa;

import amigos.Amigo;
import estaticos.Estaticos;

public class MinutosDepois implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto("...");
	}

}
