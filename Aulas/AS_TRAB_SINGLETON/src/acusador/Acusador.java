package acusador;

public abstract class Acusador {

	private String nome;
	private String premissa;
	private String acusacao;

	public String getPremissa() {
		return premissa;
	}

	public void setPremissa(String premissa) {
		this.premissa = premissa;
	}

	public String getAcusacao() {
		return acusacao;
	}

	public void setAcusacao(String acusacao) {
		this.acusacao = acusacao;
	}

	public abstract void acusar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
