package command;

import receiver.Conta;

public class ContaRecebida implements ICommand {

	private Conta conta;
	
	public ContaRecebida(Conta conta) {
		this.conta = conta;
	}
	
	@Override
	public void execute() {
		conta.receber();
	}
	
	@Override
	public void undo() {
		conta.pagar();
	}

}
