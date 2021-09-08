package responsavel;

import acusador.Acusador;

public abstract class Responsavel {

	private String nome;

	public abstract void levarCulpa(Acusador acusador, String premissa, String acusacao);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
