package command;

import receiver.Carteira;

public class CarteiraCheia implements ICommand {
	
	private Carteira carteira;
	
	public CarteiraCheia(Carteira carteira) {
		this.carteira = carteira;
	}

	@Override
	public void execute() {
		carteira.adicionarDinheiro();
	}
	
	@Override
	public void undo() {
		carteira.gastarDinheiro();
	}	
}
