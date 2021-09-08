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
			resposta = "Como é que é?!";
			break;
		case 1:
			resposta = "Leite de quê?!";
			break;
		case 2:
			resposta = "Vende isso não.";
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
