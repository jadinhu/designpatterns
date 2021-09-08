package fabricas;

import componentes.DesignPortugues;
import componentes.IDesign;
import componentes.ILed;
import componentes.INome;
import componentes.LedParaPortugueses;
import componentes.NomeParaPortugueses;

public class ComponenteCanetaFactoryPortugal implements IComponenteCanetaFactory {

	@Override
	public ILed criarLed() {
		return new LedParaPortugueses();
	}

	@Override
	public INome criarNome() {
		return new NomeParaPortugueses();
	}

	@Override
	public IDesign criarDesign() {
		return new DesignPortugues();
	}


}
