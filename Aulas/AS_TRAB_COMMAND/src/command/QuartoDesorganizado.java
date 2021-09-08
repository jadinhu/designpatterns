package command;

import receiver.Quarto;

public class QuartoDesorganizado implements ICommand {

	private Quarto quarto;

	public QuartoDesorganizado(Quarto quarto) {
		this.quarto = quarto;
	}

	@Override
	public void execute() {
		quarto.desorganizar();
	}

	@Override
	public void undo() {
		quarto.limpar();
	}

}
