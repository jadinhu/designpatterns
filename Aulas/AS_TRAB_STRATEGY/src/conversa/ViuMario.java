package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class ViuMario implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": Oi, voc� viu o M�rio?");
	}

}
