package amigos;

import conversa.Conversa;
import estaticos.Estaticos;


public class AmigoFuleiro extends Amigo {
	
	public AmigoFuleiro() {
		setNome("Fillype");
	}
	
	@Override
	public void setConversa(Conversa conversa) {
		super.setConversa(conversa);
		Estaticos.janela.setImagem(2);
	}
	
}
