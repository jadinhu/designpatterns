package launch;

import facade.Mae;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Mae mae = new Mae();
		System.out.println("*A mae cuida da familia toda*");
		mae.cuidarDaFamilia();
		
		System.out.println("\n*A mae cuida especialmente do filho :D*");
		mae.cuidarDoFilho();
	}
}
