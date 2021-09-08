package responsavel;

import launch.ContadorDeInstancias;
import acusador.Acusador;

public class PT extends Responsavel {

	private static PT instance;

	private PT() {
		System.out.println("(obs: Contador de Instancias de Pt diz: o total de instancias é "+ContadorDeInstancias.adicionarInstancia()+")");
	}

	public static PT getInstance() {
		if (instance == null) {
			synchronized (PT.class) {
				if (instance == null) {
					instance = new PT();
				}
			}
		}
		return instance;
	}

	@Override
	public void levarCulpa(Acusador acusador, String premissa, String acusacao) {
		System.out.println();
		System.out.println("Apesar de: " + premissa);
		System.out.println("Segundo "+ acusador.getNome() +", O PT é culpado de: " + acusacao);
	}

}
