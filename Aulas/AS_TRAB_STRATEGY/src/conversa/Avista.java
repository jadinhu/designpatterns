package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class Avista implements Conversa{

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() + " avista um amigo...");
	}

}
