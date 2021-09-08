package model;

public class FilhoDecorator extends Filho {
	
	protected Filho filho;
	
	public FilhoDecorator(Filho filho) {
		this.filho = filho;
	}
	
	@Override
	public String presente() {
		return filho.presente();
	}

}
