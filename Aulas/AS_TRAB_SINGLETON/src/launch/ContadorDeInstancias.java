package launch;

public class ContadorDeInstancias {
	
	private static int contador = 0;
	
	public static int adicionarInstancia() {
		return ++contador;
	}
}
