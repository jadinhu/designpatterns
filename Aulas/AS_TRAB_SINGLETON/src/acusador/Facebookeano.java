package acusador;

import responsavel.PT;

public class Facebookeano extends Acusador {
	
	public Facebookeano() {
		setNome("Facebookeano");
		setPremissa("A internet sempre foi ruim mesmo antes do PT na presidencia, mas sempre foi " +
				"melhorando com o passar do tempo. Hoje em alguns lugares com a GVT, por exemplo, " +
				"a internet � aceit�vel, embora ainda precise melhorar em rela��o a outros pa�ses.");
		setAcusacao("n�o querer que a internet seja boa para n�s n�o reclamarmos deles no facebook!");
	}

	@Override
	public void acusar() {
		PT.getInstance().levarCulpa(this, getPremissa(), getAcusacao());
	}
	
}
