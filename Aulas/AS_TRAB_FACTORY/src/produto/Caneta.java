package produto;

import componentes.IDesign;
import componentes.ILed;
import componentes.INome;

import fabricas.IComponenteCanetaFactory;

public abstract class Caneta {

	private String nome;
	private ILed led;
	private INome nomes;
	private IDesign design;
	private IComponenteCanetaFactory componenteCanetaFactory;

	public Caneta(IComponenteCanetaFactory componenteCanetaFactory) {
		this.componenteCanetaFactory = componenteCanetaFactory;
	}

	public abstract void descreverUtilidade();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ILed getLed() {
		return led;
	}

	public void setLed(ILed led) {
		this.led = led;
	}

	public INome getNomes() {
		return nomes;
	}

	public void setNomes(INome nomes) {
		this.nomes = nomes;
	}

	public IDesign getDesign() {
		return design;
	}

	public void setDesign(IDesign design) {
		this.design = design;
	}

	public IComponenteCanetaFactory getComponenteCanetaFactory() {
		return componenteCanetaFactory;
	}

	public void setComponenteCanetaFactory(IComponenteCanetaFactory componenteCanetaFactory) {
		this.componenteCanetaFactory = componenteCanetaFactory;
	}

}
