package adapter;

import funcao.ICarry;
import funcao.ISuport;

public class JogadorSemNocao implements ICarry {
	
	private ISuport suport;
	
	public JogadorSemNocao(ISuport suport) {
		this.suport = suport;
	}

	@Override
	public void atacar() {
		suport.poke();
		System.out.println(" Quando n�o tem mana ou a magia est� carregando, s� olha o time morrendo.");
	}

	@Override
	public void posicionar() {
		suport.auxiliar();
		System.out.println(" E morre por falta de posicionamento. '-'");
	}
	
}
