package command;

public class ComandoSemAjuda implements ICommand {

	@Override
	public void execute() {
		System.out.println("*faz nada*");
	}
	
	@Override
	public void undo() {
		System.out.println("*não desfaz nada*");
	}

}
