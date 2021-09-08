package facade;

import empregado.Administradora;
import empregado.Baba;
import empregado.ConselheiroTutelar;
import empregado.Cozinheira;
import empregado.Domestica;
import empregado.Motorista;

public class Mae {

	private Administradora adm;
	private Baba baba;
	private ConselheiroTutelar conselho;
	private Cozinheira cozinheira;
	private Domestica domestica;
	private Motorista motorista;
	
	public Mae() {
		adm = new Administradora();
		baba = new Baba();
		conselho = new ConselheiroTutelar();
		cozinheira = new Cozinheira();
		domestica = new Domestica();
		motorista = new Motorista();
	}
	
	public void cuidarDaFamilia() {
		adm.pagarContas();
		conselho.resolverConflito();
		cozinheira.cozinhar();
		domestica.engomar();
		domestica.lavarRoupas();
		domestica.lavarPratos();
		domestica.faxina();
	}
	
	public void cuidarDoFilho() {
		adm.mesada();
		baba.darColo();
		cozinheira.cozinhar();
		domestica.engomar();
		domestica.lavarRoupas();
		domestica.lavarPratos();
		domestica.faxina();
		motorista.dirigir();
	}
}
