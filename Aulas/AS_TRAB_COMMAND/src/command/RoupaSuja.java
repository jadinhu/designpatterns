package command;

import receiver.Roupa;

public class RoupaSuja  implements ICommand {

	private Roupa roupa;
	
	public RoupaSuja(Roupa roupa) {
		this.roupa = roupa;
	}
	
	@Override
	public void execute() {
		roupa.usar();
	}
	
	@Override
	public void undo() {
		roupa.limpar();
	}
}
