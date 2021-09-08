package produto;

import fabricas.IComponenteCanetaFactory;

public class CanetaComNome extends Caneta {
	
	public CanetaComNome(IComponenteCanetaFactory componenteCanetaFactory) {
		super(componenteCanetaFactory);
		setNome("Caneta com Nome");
	}

	@Override
	public void descreverUtilidade() {
		setDesign(getComponenteCanetaFactory().criarDesign());
		setNomes(getComponenteCanetaFactory().criarNome());
		System.out.println(getNome());
		getDesign().descreverDesign();
		getNomes().descreverNome();
	}

}
