package componentes;

public class LedParaPortugueses implements ILed {

	@Override
	public void descreverLed() {
		System.out.println("O LED fica constantemente acesso, para evitar que o dono perca a caneta.");
	}

}
