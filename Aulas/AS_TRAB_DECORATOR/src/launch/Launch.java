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
		
		System.out.println("Quatro amigos antigos, que hoje já são pais de família, se encontram em um bar para papear.");
		System.out.println("Conversa vai conversa vem... bebidas vão bebidas vem...");
		System.out.println("Um deles vão ao banheiro... logo em seguida os outros três começam a falar sobre os filhos.");
		System.out.println("E ai... como estão os filhos de vocês? Um deles pergunta.");
		System.out.println("Sem delongas, o primeiro responde: \"Ah, o meu está tão rico que "+filho1.presente()+" a um amigo\"");
		System.out.println("O segundo não perde tempo e também responde: \"Ótimo. O meu está tão rico que "+filho2.presente()+" a um amigo!\"");
		System.out.println("O terceiro, que começou a pergunta, esnobamente responde: \"O meu está tão rico que dia desses "+filho3.presente()+" a um amigo!\"");
		System.out.println("...logo depois o 4 pai volta do banheiro e questiona: \"Do que estavam falando?\" E o respondem: \"Falavamos do quão bem de vida nossos filhos estão. E o seu filho, como está?\"");
		System.out.println("Com um ar mais misterioso o pai responde aos amigos: \"Rapazes... o meu filho não faz muito da vida não, mas andou comendo uns viadinhos ricos por ai, e chegou a "+malandro.presente()+ "\"");
		System.out.println("*Silêncio*");
	}

}
