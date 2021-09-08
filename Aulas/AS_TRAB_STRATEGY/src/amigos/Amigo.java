package amigos;

import conversa.Conversa;
import estaticos.Estaticos;

public class Amigo {
	
	private String nome;
	private Conversa conversa;
	
	public void acao(Amigo amigo) {
		conversa.conversa(amigo);
		Estaticos.janela.repaint();
	}
	
	//gets and sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setConversa(Conversa conversa) {
		this.conversa = conversa;
	}
	
}
