package command;

import receiver.Quarto;

public class QuartoLimpo implements ICommand {

	private Quarto quarto;

	public QuartoLimpo(Quarto quarto) {
		this.quarto = quarto;
	}

	@Override
	public void execute() {
		quarto.limpar();
	}

	@Override
	public void undo() {
		quarto.desorganizar();
	}
	
}
