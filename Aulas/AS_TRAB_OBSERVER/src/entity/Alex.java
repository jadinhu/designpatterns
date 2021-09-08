package entity;

import interfaces.Observer;

public class Alex implements Observer
{
	private String resposta;

	@Override
	public void update(Object obj)
	{
		Integer i = (Integer) obj;
		switch (i)
		{
		case 0:
			resposta = "Como � que �?!";
			break;
		case 1:
			resposta = "Leite de qu�?!";
			break;
		case 2:
			resposta = "Vende isso n�o.";
			break;
		case 3:
			resposta = "Nunca vi.";
			break;
		case 4:
			resposta = "LOL";
			break;
		}
		System.out.println("Alex: " + resposta);
	}
}
