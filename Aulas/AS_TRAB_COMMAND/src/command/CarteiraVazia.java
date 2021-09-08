package command;

import receiver.Carteira;

public class CarteiraVazia implements ICommand {
	
	private Carteira carteira;
	
	public CarteiraVazia(Carteira carteira) {
		this.carteira = carteira;
	}

	@Override
	public void execute() {
		carteira.gastarDinheiro();
	}
	
	@Override
	public void undo() {
		carteira.adicionarDinheiro();
	}

}
