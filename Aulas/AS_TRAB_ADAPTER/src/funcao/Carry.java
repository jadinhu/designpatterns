package funcao;

public class Carry implements ICarry {

	@Override
	public void atacar() {
		System.out.println("Ataca o alvo mais próximo.");
	}

	@Override
	public void posicionar() {
		System.out.println("Se posiciona para evitar ataques.");
	}
	
	

}
