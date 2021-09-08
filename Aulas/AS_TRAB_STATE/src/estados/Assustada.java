package estados;

import baratuxa.BarataDagua;

public class Assustada implements IEstado {

	private BarataDagua barataDoSatanas;

	public Assustada(BarataDagua barataDoSatanas) {
		this.barataDoSatanas = barataDoSatanas;
	}

	@Override
	public void cutucada() {
		System.out.println("O povo continua cututando... Ent�o, a barata pega ar, abre as asas e sai rasante na cabe�a da galera! Ai brother, todo mundo vira mulher e s� se v� a esteria!:" +
				"\n- Ai satan�s, sai pra l���!!!\n- Puta que pariiiu!\n- Cr� em deus pai, sangue de cristo tem poder!!\n- Valeeei-me nosso senhor!\n- Caraaaai! SOCOOORRO!!!" +
				"\n(euaheuaheuaheauheu)");
		barataDoSatanas.setEstado(barataDoSatanas.getVoando());
	}

	@Override
	public void aproximacao() {
		System.out.println("A baratuxa continua assustada com o povo se aproximando... a galera vai chegando e rindo da brincadeira.");
		barataDoSatanas.setEstado(barataDoSatanas.getAssustada());
	}

	@Override
	public void soOlhaERiDaBaratuxa() {
		System.out.println("A baratuxa vai ficando puta da vida, e continua tentando escapar... E o povo s� de zueira com ela.");
		barataDoSatanas.setEstado(barataDoSatanas.getAssustada());
	}
	
	@Override
	public String toString() {
		return "Assustada, tipo \"que porra � essa?\".";
	}

}
