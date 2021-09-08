package entity;

import interfaces.Observer;

public class Carlos implements Observer
{
	private String resposta;

	@Override
	public void update(Object obj)
	{
		Integer i = (Integer) obj;
		switch (i)
		{
		case 0:
			resposta = "Leite de quê?!";
			break;
		case 1:
			resposta = "Oxi...";
			break;
		case 2:
			resposta = "Vende isso não.";
			break;
		case 3:
			resposta = "Como é que é?!";
			break;
		case 4:
			resposta = "LOL";
			break;
		}
		System.out.println("Carlos: " + resposta);
	}
}
