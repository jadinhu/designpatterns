package fabricas;

import componentes.IDesign;
import componentes.ILed;
import componentes.INome;

public interface IComponenteCanetaFactory {
	
	public ILed criarLed();
	public INome criarNome();
	public IDesign criarDesign();

}
