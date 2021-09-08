package command;

import receiver.Prato;

public class PratoVazio implements ICommand {

	private Prato prato;

	public PratoVazio(Prato prato) {
		this.prato = prato;
	}

	@Override
	public void execute() {
		prato.esvaziar();
	}
	
	@Override
	public void undo() {
		prato.encherDeComida();
	}


}
