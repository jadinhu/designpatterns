package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class Nossa implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": Nossa, ele também!!! AUEHAUHEAUHEAUHEAU");
	}

}
