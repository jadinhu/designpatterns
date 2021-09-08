package fabricas;

import produto.Caneta;
import produto.EnumCaneta;

public abstract class CanetaFactory {

	public abstract Caneta fabricarCaneta(EnumCaneta c);
	
}
