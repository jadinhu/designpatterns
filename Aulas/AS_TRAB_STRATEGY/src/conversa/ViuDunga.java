package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class ViuDunga implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": Oi, você viu o Dunga?");
	}

}
