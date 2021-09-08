package invoker;

import command.ComandoSemAjuda;
import command.ICommand;

public class FilhoFolgado {
	
	// O filho deseja muitas coisas fáceis
	
	private ICommand[] commandsMae;
	private ICommand[] commandsFilho;
	private ICommand undoCommand;
	
	public FilhoFolgado() {
		commandsMae = new ICommand[6];
		commandsFilho = new ICommand[6];
		ComandoSemAjuda comandoSemAjuda = new ComandoSemAjuda();
		
		for (int i = 0; i < 6; i++) {
			commandsMae[i] = comandoSemAjuda;
			commandsFilho[i] = comandoSemAjuda;
		}
		undoCommand = comandoSemAjuda;
	}

	public void setCommand(int slot, ICommand commandMae, ICommand commandFilho) {
		commandsMae[slot] = commandMae;
		commandsFilho[slot] = commandFilho;
	}
	
	public void commandMae(int slot) {
		commandsMae[slot].execute();
		undoCommand = commandsMae[slot];
	}
	
	public void commandFilho(int slot) {
		commandsFilho[slot].execute();
		undoCommand = commandsFilho[slot];
	}
	
	public void undoCommand() {
		undoCommand.undo();
	}

}
