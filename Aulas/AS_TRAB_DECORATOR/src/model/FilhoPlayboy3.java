package model;

public class FilhoPlayboy3 extends FilhoDecorator {

	public FilhoPlayboy3(Filho filho) {
		super(filho);
	}

	@Override
	public String presente() {
		return filho.presente() + " até 1 milhão de reais";
	}

}
