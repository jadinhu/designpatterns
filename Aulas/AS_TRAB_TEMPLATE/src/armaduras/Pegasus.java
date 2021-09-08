package armaduras;

public class Pegasus extends Armadura {
	
	public Pegasus() {
		nome = "Cavaleiro de Pegasus.";
	}

	@Override
	public void vestindoArmadura() {
		System.out.println("Sequencia: pernas, cintura, braço esquerdo, braço direito, peitoral, ombro esquerdo, ombro direito e elmo.");
	}

	@Override
	public void coreografia() {
		System.out.println("Coreografia de Pegasus, o cavaleiro imorrível.");
	}

}
