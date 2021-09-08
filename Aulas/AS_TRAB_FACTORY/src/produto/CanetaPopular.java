package produto;

import fabricas.IComponenteCanetaFactory;

public class CanetaPopular extends Caneta {
	
	public CanetaPopular(IComponenteCanetaFactory componenteCanetaFactory) {
		super(componenteCanetaFactory);
		setNome("Caneta Popular");
	}

	@Override
	public void descreverUtilidade() {
		setDesign(getComponenteCanetaFactory().criarDesign());
		System.out.println(getNome());
		getDesign().descreverDesign();
	}

}
