package command;

import receiver.Prato;

public class PratoCheio implements ICommand {

	private Prato prato;

	public PratoCheio(Prato prato) {
		this.prato = prato;
	}

	@Override
	public void execute() {
		prato.encherDeComida();
	}
	
	@Override
	public void undo() {
		prato.esvaziar();
	}

}
