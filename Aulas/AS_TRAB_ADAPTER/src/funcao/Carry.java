package funcao;

public class Carry implements ICarry {

	@Override
	public void atacar() {
		System.out.println("Ataca o alvo mais pr�ximo.");
	}

	@Override
	public void posicionar() {
		System.out.println("Se posiciona para evitar ataques.");
	}
	
	

}
