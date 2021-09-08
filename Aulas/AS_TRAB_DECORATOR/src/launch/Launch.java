package launch;

import model.Filho;
import model.FilhoDecorator;
import model.FilhoMala;
import model.FilhoPlayboy1;
import model.FilhoPlayboy2;
import model.FilhoPlayboy3;
import model.FilhoRico;

public class Launch {

	public static void main(String[] args) {

		Filho filhoRico = new FilhoRico();
		Filho filho1 = new FilhoPlayboy1(filhoRico);
		Filho filho2 = new FilhoPlayboy2(filhoRico);
		Filho filho3 = new FilhoPlayboy3(filhoRico);
		
		Filho malandro = new FilhoDecorator(new FilhoPlayboy3(new FilhoPlayboy2(new FilhoPlayboy1(new FilhoMala()))));
		
		System.out.println("Quatro amigos antigos, que hoje j� s�o pais de fam�lia, se encontram em um bar para papear.");
		System.out.println("Conversa vai conversa vem... bebidas v�o bebidas vem...");
		System.out.println("Um deles v�o ao banheiro... logo em seguida os outros tr�s come�am a falar sobre os filhos.");
		System.out.println("E ai... como est�o os filhos de voc�s? Um deles pergunta.");
		System.out.println("Sem delongas, o primeiro responde: \"Ah, o meu est� t�o rico que "+filho1.presente()+" a um amigo\"");
		System.out.println("O segundo n�o perde tempo e tamb�m responde: \"�timo. O meu est� t�o rico que "+filho2.presente()+" a um amigo!\"");
		System.out.println("O terceiro, que come�ou a pergunta, esnobamente responde: \"O meu est� t�o rico que dia desses "+filho3.presente()+" a um amigo!\"");
		System.out.println("...logo depois o 4 pai volta do banheiro e questiona: \"Do que estavam falando?\" E o respondem: \"Falavamos do qu�o bem de vida nossos filhos est�o. E o seu filho, como est�?\"");
		System.out.println("Com um ar mais misterioso o pai responde aos amigos: \"Rapazes... o meu filho n�o faz muito da vida n�o, mas andou comendo uns viadinhos ricos por ai, e chegou a "+malandro.presente()+ "\"");
		System.out.println("*Sil�ncio*");
	}

}
