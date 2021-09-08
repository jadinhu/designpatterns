package launch;

import invoker.FilhoFolgado;
import receiver.Carteira;
import receiver.Conta;
import receiver.Prato;
import receiver.Quarto;
import receiver.Roupa;

import command.CarteiraCheia;
import command.CarteiraVazia;
import command.ContaPaga;
import command.ContaRecebida;
import command.ICommand;
import command.PratoCheio;
import command.PratoVazio;
import command.QuartoDesorganizado;
import command.QuartoLimpo;
import command.RoupaLimpa;
import command.RoupaSuja;
import command.VidaBoa;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		// 5 receivers
		Carteira carteira = new Carteira();
		Conta conta = new Conta();
		Prato prato = new Prato();
		Quarto quarto = new Quarto();
		Roupa roupa = new Roupa();
		
		// 10 commands
		ICommand carteiraCheia = new CarteiraCheia(carteira);
		ICommand carteiraVazia = new CarteiraVazia(carteira);
		ICommand contaPaga = new ContaPaga(conta);
		ICommand contaRecebida = new ContaRecebida(conta);
		ICommand pratoVazio = new PratoVazio(prato);
		ICommand pratoCheio = new PratoCheio(prato);
		ICommand quartoLimpo = new QuartoLimpo(quarto);
		ICommand quartoDesorganizado = new QuartoDesorganizado(quarto);
		ICommand roupaLimpa = new RoupaLimpa(roupa);
		ICommand roupaSuja = new RoupaSuja(roupa);
		// Macro/Meta command
		ICommand[] cdmsMae = {carteiraCheia, contaPaga, pratoCheio, quartoLimpo, roupaLimpa};
		ICommand[] cdmsFilho = {carteiraVazia, contaRecebida, pratoVazio, quartoDesorganizado, roupaSuja};
		ICommand vidaBoa = new VidaBoa(cdmsMae);
		ICommand vidaDificil = new VidaBoa(cdmsFilho);
		
		// invoker
		FilhoFolgado filho = new FilhoFolgado();
		filho.setCommand(0, carteiraCheia, carteiraVazia);
		filho.setCommand(1, contaPaga, contaRecebida);
		filho.setCommand(2, pratoCheio, pratoVazio);
		// teste
		System.out.println("(((Testando o N� sem comando)))");
		filho.commandFilho(3);
		filho.commandMae(3);
		filho.commandFilho(4);
		filho.commandMae(4);
		System.out.println();
		// continua��o do invoker
		filho.setCommand(3, quartoLimpo, quartoDesorganizado);
		filho.setCommand(4, roupaLimpa, roupaSuja);
		filho.setCommand(5, vidaBoa, vidaDificil);
		
		// app
		System.out.println("Eu morava sozinho, mas percebi que aconteciam coisas estranhas. Na verdade, algumas coisas N�O aconteciam." +
				" Mas morando com minha m�e, elas acontecem e s�o boas, sabe? Tipo assim...");
		
		System.out.println("Quando eu gasto minha grana toda...");
		filho.commandFilho(0);
		System.out.println("Ai eu desejo que ela encha novamente, e quando acordo no outro dia, a carteira obviamente j� est� cheia de novo.");
		filho.commandMae(0);
		System.out.println("E logo depois eu gasto de novo!");
		filho.undoCommand();
		System.out.println();
		
		System.out.println("Quando as contas chegam...");
		filho.commandFilho(1);
		System.out.println("Mas como eu desejo que elas j� estivessem pagas, elas repentinamente s�o pagas pouco depois.");
		filho.commandMae(1);
		System.out.println("E sempre chegam contas!");
		filho.undoCommand();
		System.out.println();
		
		System.out.println("Quando eu como, os pratos ficam vazios...");
		filho.commandFilho(2);
		System.out.println("Mas sempre que eu desejo comer, elas ficam cheios!");
		filho.commandMae(2);
		System.out.println("Dai, l�gico, como de novo!");
		filho.undoCommand();
		System.out.println();
		
		System.out.println("Eu gosto do quarto organizado, embora n�o fa�a nada pra isso...");
		filho.commandFilho(3);
		System.out.println("Mas como m�gia ele sempre est� organizado.");
		filho.commandMae(3);
		System.out.println("Ent�o nunca me preocupo em arrum�-lo.");
		filho.undoCommand();
		System.out.println();
		
		System.out.println("Roupas? Sujo bastate!");
		filho.commandFilho(4);
		System.out.println("Mas quem n�o gosta delas sempre limpas? Todo final de semana elas aparecem limpinhas e engomadas j� dentro do guarda roupas! :D");
		filho.commandMae(4);
		System.out.println("J� que sempre est�o limpas, uso uma vez!");
		filho.undoCommand();
		System.out.println();
		
		// matro/meta commands
		System.out.println("... �s vezes o filho n�o tem nada...");
		filho.commandFilho(5);
		System.out.println("Mas com o 'poder da mente' tudo se resolve!");
		filho.commandMae(5);
		System.out.println("Entretanto, nas m�os do filho desse, nada dura!");
		filho.undoCommand();
		
	}

}
