package funcao;

public class Suport implements ISuport {

	@Override
	public void poke() {
		System.out.println("Usa magia de dano no inimigo mais próximo e recua.");
	}

	@Override
	public void auxiliar() {
		System.out.println("Cura/buff/apanha pelo aliado.");
	}
	
}
