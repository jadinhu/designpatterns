package conversa;

import estaticos.Estaticos;
import amigos.Amigo;

public class AqueleQueTeComeu implements Conversa {

	@Override
	public void conversa(Amigo amigo) {
		Estaticos.janela.setTexto(amigo.getNome() +": Aquele que te comeu atrás do armário!!! hauhauhauhau");
	}

}
