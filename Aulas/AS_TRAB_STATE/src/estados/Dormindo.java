package estados;

import baratuxa.BarataDagua;

public class Dormindo implements IEstado {

	private BarataDagua barataDoSatanas;

	public Dormindo(BarataDagua barataDoSatanas) {
		this.barataDoSatanas = barataDoSatanas;
	}

	@Override
	public void cutucada() {
		System.out.println("O povo cutuca ela... A baratuxa acorda, mas fica quietinha observando o que está havendo... E o povo dá risada.");
		barataDoSatanas.setEstado(barataDoSatanas.getQuietinha());
	}

	@Override
	public void aproximacao() {
		System.out.println("A baratuxa continua dormindo de boa. \"Zzzz\" ... Enquanto o povo chega perto.");
		barataDoSatanas.setEstado(barataDoSatanas.getDormindo());
	}

	@Override
	public void soOlhaERiDaBaratuxa() {
		System.out.println("A baratuxa está dormindo de boa. \"Zzzz\" ... O povo olha e diz, vamos bulinar ela! hehehe");
		barataDoSatanas.setEstado(barataDoSatanas.getDormindo());
	}

	@Override
	public String toString() {
		return "Dormindo tranquilis.";
	}

}
