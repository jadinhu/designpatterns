package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class Calma implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": Calma cara... voc� viu o Jos�?");
	}

}
