package fabricas;

import produto.Caneta;
import produto.CanetaComLed;
import produto.CanetaComNome;
import produto.CanetaPopular;
import produto.EnumCaneta;

public class CanetaFactoryBrasil extends CanetaFactory {

	IComponenteCanetaFactory componenteCanetaFactory = new ComponenteCanetaFactoryBrasil();
	
	@Override
	public Caneta fabricarCaneta(EnumCaneta c) {
		System.out.println("Demonstrando a caneta brasileira!");
		Caneta caneta = null;
		
		switch (c) {
		case LED: 
			caneta = new CanetaComLed(componenteCanetaFactory); 
			break;
		case NOME:
			caneta = new CanetaComNome(componenteCanetaFactory);	
			break;
		case POPULAR:
			caneta = new CanetaPopular(componenteCanetaFactory);
			break;
		}
		return caneta;
	}

}
