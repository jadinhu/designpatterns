package armaduras;

public class Fenix extends Armadura {
	
	public Fenix() {
		nome = "Cavaleiro de Fenix.";
	}

	@Override
	public void vestindoArmadura() {
		System.out.println("Sequencia: pernas, cintura, braço esquerdo, braço direito, peitoral, ombro esquerdo, ombro direito e elmo.");
	}

	@Override
	public void coreografia() {
		System.out.println("Coreografia de Fênix, o cavaleiro motherfucker das galáxias.");
	}

}
