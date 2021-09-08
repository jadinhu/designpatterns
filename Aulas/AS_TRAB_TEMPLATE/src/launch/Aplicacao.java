package launch;

import armaduras.Andromeda;
import armaduras.Armadura;
import armaduras.Fenix;
import armaduras.Pegasus;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Armadura ikki = new Fenix();
		Armadura seiya = new Pegasus();
		Armadura shun = new Andromeda();
		
		System.out.println("Vejamos como procede a transformação dos cavaleiros quando vestem suas armaduras!/n");
		ikki.transformacao();
		System.out.println();
		seiya.transformacao();
		System.out.println();
		shun.transformacao();
	}
	
}
