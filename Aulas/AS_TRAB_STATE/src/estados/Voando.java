package estados;

import baratuxa.BarataDagua;

public class Voando implements IEstado {

	private BarataDagua barataDoSatanas;

	public Voando(BarataDagua barataDoSatanas) {
		this.barataDoSatanas = barataDoSatanas;
	}

	@Override
	public void cutucada() {
		System.out.println("O povo morrendo de medo tenta espant�-la para longe. Agora a baratuxa � quem sai dando risada e vai dormir em outro lugar.");
		barataDoSatanas.setEstado(barataDoSatanas.getDormindo());
	}

	@Override
	public void aproximacao() {
		System.out.println("O povo de t�o desesperado corre sem nem saber pra onde. E a ceifadora de almas voando e gritando \"UUAAARRRGGHHH!!!\" kkk");
		barataDoSatanas.setEstado(barataDoSatanas.getVoando());
	}

	@Override
	public void soOlhaERiDaBaratuxa() {
		System.out.println("Agora ningu�m ri mais n�o, brother. � todo mundo correndo para as colinas enquanto o cavalo do c�o tenta decepar cabe�as! ueahuehueah");
		barataDoSatanas.setEstado(barataDoSatanas.getVoando());
	}
	
	@Override
	public String toString() {
		return "Voando like a Epic Dragon! XD";
	}

}
