package conversa;

import amigos.Amigo;
import estaticos.Estaticos;

public class JaSei2 implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": Ai eu digo \"aquele que comeu sua bunda!\" hehehe");
	}

}

