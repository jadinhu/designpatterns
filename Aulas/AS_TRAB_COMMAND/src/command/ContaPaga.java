package command;

import receiver.Conta;

public class ContaPaga  implements ICommand {

	private Conta conta;
	
	public ContaPaga(Conta conta) {
		this.conta = conta;
	}
	
	@Override
	public void execute() {
		conta.pagar();
	}
	
	@Override
	public void undo() {
		conta.receber();
	}


}
