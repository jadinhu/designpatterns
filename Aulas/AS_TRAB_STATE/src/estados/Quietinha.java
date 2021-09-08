package estados;

import baratuxa.BarataDagua;

public class Quietinha implements IEstado {

	private BarataDagua barataDoSatanas;

	public Quietinha(BarataDagua barataDoSatanas) {
		this.barataDoSatanas = barataDoSatanas;
	}

	@Override
	public void cutucada() {
		System.out.println("O povo cututa ela... A barata fica assustada, correndo de um lado para o outro! ... A galera dá altas risadas da bixinha.");
		barataDoSatanas.setEstado(barataDoSatanas.getAssustada());
	}

	@Override
	public void aproximacao() {
		System.out.println("O povo vai se aglomerando perto dela... A baratuxa fica atenta, mas não se move.");
		barataDoSatanas.setEstado(barataDoSatanas.getQuietinha());
	}

	@Override
	public void soOlhaERiDaBaratuxa() {
		System.out.println("A baratuxa fica só ouvindo as risadas sem entender nada... O povo é meio retardado, não param de rir. '-'");
		barataDoSatanas.setEstado(barataDoSatanas.getQuietinha());
	}
	
	@Override
	public String toString() {
		return "Quietinha de pernas cruzadas.";
	}

}
