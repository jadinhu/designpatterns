package acusador;

import responsavel.PT;

public class Moralista extends Acusador {
	
	public Moralista() {
		setNome("Moralista");
		setPremissa("O moralista joga lixo no chão, sempre tenta subornar o guarda de trânsito e o segurança da balada, " +
				"compra drogas ilícitas, dirige embreagado e só passou na faculdade porque colava na prova.");
		setAcusacao(" ser uma vergonha nacional, pois o PT é corrupto e imoral.");
	}

	@Override
	public void acusar() {
		PT.getInstance().levarCulpa(this, getPremissa(), getAcusacao());
	}

}
