package model;

public class FilhoPlayboy2 extends FilhoDecorator {

	public FilhoPlayboy2(Filho filho) {
		super(filho);
	}

	@Override
	public String presente() {
		return filho.presente() + " uma Casa";
	}

}
