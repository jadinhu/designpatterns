package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class QueJose implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": José... que José???");
	}

}
