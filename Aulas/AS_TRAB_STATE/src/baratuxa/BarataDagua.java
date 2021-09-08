package baratuxa;

import estados.Assustada;
import estados.Dormindo;
import estados.IEstado;
import estados.Quietinha;
import estados.Voando;

public class BarataDagua implements IEstado {
	
	private IEstado dormindo;
	private IEstado assustada;
	private IEstado voando;
	private IEstado quietinha;
	private IEstado estado;
	
	public BarataDagua() {
		dormindo = new Dormindo(this);
		assustada = new Assustada(this);
		voando = new Voando(this);
		quietinha = new Quietinha(this);
		this.estado = dormindo;
	}

	public void setEstado(IEstado estado) {
		this.estado = estado;
	}

	@Override
	public void cutucada() {
		this.estado.cutucada();
	}

	@Override
	public void aproximacao() {
		this.estado.aproximacao();
	}

	@Override
	public void soOlhaERiDaBaratuxa() {
		this.estado.soOlhaERiDaBaratuxa();
	}

	public IEstado getDormindo() {
		return dormindo;
	}

	public IEstado getAssustada() {
		return assustada;
	}

	public IEstado getVoando() {
		return voando;
	}

	public IEstado getQuietinha() {
		return quietinha;
	}

	public IEstado getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "A baratuxa fica " + this.estado.toString();
	}
	
}
