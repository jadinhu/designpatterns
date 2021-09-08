package produto;

import fabricas.IComponenteCanetaFactory;

public class CanetaComLed extends Caneta {

	public CanetaComLed(IComponenteCanetaFactory componenteCanetaFactory) {
		super(componenteCanetaFactory);
		setNome("Caneta com LED");
	}

	@Override
	public void descreverUtilidade() {
		setDesign(getComponenteCanetaFactory().criarDesign());
		setLed(getComponenteCanetaFactory().criarLed());
		System.out.println(getNome());
		getDesign().descreverDesign();
		getLed().descreverLed();
	}

}
