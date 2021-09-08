package command;

public class VidaBoa implements ICommand {
	
	ICommand[] commands;
	
	public VidaBoa(ICommand[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		int max = commands.length;
		for (int i = 0; i < max; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		int max = commands.length;
		for (int i = 0; i < max; i++) {
			commands[i].undo();
		}
	}

}
