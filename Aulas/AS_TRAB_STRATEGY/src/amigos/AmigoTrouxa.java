package amigos;

import conversa.Conversa;
import estaticos.Estaticos;

public class AmigoTrouxa extends Amigo {
	
	public AmigoTrouxa() {
		setNome("Hudson");
	}
	
	@Override
	public void setConversa(Conversa conversa) {
		super.setConversa(conversa);
		Estaticos.janela.setImagem(1);
	}

}
