package fabricas;

import componentes.DesignBrasileiro;
import componentes.IDesign;
import componentes.ILed;
import componentes.INome;
import componentes.LedParaBrasileiros;
import componentes.NomeParaBrasileiro;

public class ComponenteCanetaFactoryBrasil implements IComponenteCanetaFactory {

	@Override
	public ILed criarLed() {
		return new LedParaBrasileiros();
	}

	@Override
	public INome criarNome() {
		return new NomeParaBrasileiro();
	}

	@Override
	public IDesign criarDesign() {
		return new DesignBrasileiro();
	}



}
