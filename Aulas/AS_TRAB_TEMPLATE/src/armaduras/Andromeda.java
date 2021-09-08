package armaduras;

public class Andromeda extends Armadura {
	
	public Andromeda() {
		nome = "Cavaleiro de Andromeda.";
	}

	@Override
	public void vestindoArmadura() {
		System.out.println("Sequencia: coxas, pernas, peito, bra�o e ombro esquerdo, bra�o e ombro direito, elmo, baton da Avon e glitter.");
	}

	@Override
	public void coreografia() {
		System.out.println("Coreografia da diva Andromeda, o cavaleiro pintoso.");
	}

	@Override
	public void abrindoCaixa() {
		System.out.println("A caixa da armadura � aberta e jorram purpurinas!");
	}

}
