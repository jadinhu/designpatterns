package armaduras;

public class Fenix extends Armadura {
	
	public Fenix() {
		nome = "Cavaleiro de Fenix.";
	}

	@Override
	public void vestindoArmadura() {
		System.out.println("Sequencia: pernas, cintura, bra�o esquerdo, bra�o direito, peitoral, ombro esquerdo, ombro direito e elmo.");
	}

	@Override
	public void coreografia() {
		System.out.println("Coreografia de F�nix, o cavaleiro motherfucker das gal�xias.");
	}

}
