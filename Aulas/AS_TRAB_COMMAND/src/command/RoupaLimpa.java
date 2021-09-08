package command;

import receiver.Roupa;

public class RoupaLimpa implements ICommand {

	private Roupa roupa;
	
	public RoupaLimpa(Roupa roupa) {
		this.roupa = roupa;
	}
	
	@Override
	public void execute() {
		roupa.limpar();
	}

	@Override
	public void undo() {
		roupa.usar();
	}
	
}
