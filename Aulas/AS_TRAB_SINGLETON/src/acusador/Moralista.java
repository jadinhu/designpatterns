package acusador;

import responsavel.PT;

public class Moralista extends Acusador {
	
	public Moralista() {
		setNome("Moralista");
		setPremissa("O moralista joga lixo no ch�o, sempre tenta subornar o guarda de tr�nsito e o seguran�a da balada, " +
				"compra drogas il�citas, dirige embreagado e s� passou na faculdade porque colava na prova.");
		setAcusacao(" ser uma vergonha nacional, pois o PT � corrupto e imoral.");
	}

	@Override
	public void acusar() {
		PT.getInstance().levarCulpa(this, getPremissa(), getAcusacao());
	}

}
