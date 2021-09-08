package launch;

import entity.Alex;
import entity.Carlos;
import entity.Diego;
import entity.Mussum;

public class Launch
{
	public static void main(String[] args)
	{
		Mussum mussum = new Mussum();
		Alex alex = new Alex();
		Carlos carlos = new Carlos();
		Diego diego = new Diego();

		mussum.registerObserver(alex);
		mussum.registerObserver(carlos);
		mussum.registerObserver(diego);
		System.out.println("Iniciando piada:"
				+ "\nMussum chega no bar e pergunta a três barmans que se encontram no local...\n");

		for (int i = 0; i < 5; i++)
		{
			mussum.proximaFrase();
		}
	}
}
