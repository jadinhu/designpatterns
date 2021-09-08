package acusador;

import responsavel.PT;

public class Facebookeano extends Acusador {
	
	public Facebookeano() {
		setNome("Facebookeano");
		setPremissa("A internet sempre foi ruim mesmo antes do PT na presidencia, mas sempre foi " +
				"melhorando com o passar do tempo. Hoje em alguns lugares com a GVT, por exemplo, " +
				"a internet é aceitável, embora ainda precise melhorar em relação a outros países.");
		setAcusacao("não querer que a internet seja boa para nós não reclamarmos deles no facebook!");
	}

	@Override
	public void acusar() {
		PT.getInstance().levarCulpa(this, getPremissa(), getAcusacao());
	}
	
}
