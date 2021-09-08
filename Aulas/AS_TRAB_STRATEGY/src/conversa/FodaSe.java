package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class FodaSe implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": AAAA Foda-se!");
	}

}
