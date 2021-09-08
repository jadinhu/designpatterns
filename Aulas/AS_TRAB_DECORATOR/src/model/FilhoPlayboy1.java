package model;

public class FilhoPlayboy1 extends FilhoDecorator {
	
	public FilhoPlayboy1(Filho filho) {
		super(filho);
	}

	@Override
	public String presente() {
		return filho.presente() + " um Carro";
	}

}
