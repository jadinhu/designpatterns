package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class Irmao implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": O irm�o do M�rio?");
	}

}
