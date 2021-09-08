package armaduras;

public abstract class Armadura {
	
	protected String nome;
	
	public final void transformacao() {
		mostrarNome();
		abrindoCaixa();
		vestindoArmadura();
		coreografia();
	}
	
	public abstract void vestindoArmadura();
	
	public abstract void coreografia();
	
	public void abrindoCaixa() {
		// gancho
	}
	
	private void mostrarNome() {
		System.out.println(nome);
	}
}
