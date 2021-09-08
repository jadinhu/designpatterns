package armaduras;

public class Pegasus extends Armadura {
	
	public Pegasus() {
		nome = "Cavaleiro de Pegasus.";
	}

	@Override
	public void vestindoArmadura() {
		System.out.println("Sequencia: pernas, cintura, bra�o esquerdo, bra�o direito, peitoral, ombro esquerdo, ombro direito e elmo.");
	}

	@Override
	public void coreografia() {
		System.out.println("Coreografia de Pegasus, o cavaleiro imorr�vel.");
	}

}
