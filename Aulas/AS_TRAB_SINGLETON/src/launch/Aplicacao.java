package launch;

import acusador.Acusador;
import acusador.ClasseMedia;
import acusador.Facebookeano;
import acusador.Moralista;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Acusador facebookeano = new Facebookeano();
		Acusador classeMedia = new ClasseMedia();
		Acusador moralista = new Moralista();
		
		
		System.out.println("O PT não é, obviamente, o ideal do que se deseja de um partido e de seu respectivo governo. Entretanto...\n");
		facebookeano.acusar();
		classeMedia.acusar();
		moralista.acusar();
		
	}

}
