package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class Chegando implements Conversa{

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() + " est� se aproximando...");
	}

}
