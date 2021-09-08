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
			resposta = "Leite de qu�?!";
			break;
		case 1:
			resposta = "Oxi...";
			break;
		case 2:
			resposta = "Vende isso n�o.";
			break;
		case 3:
			resposta = "Como � que �?!";
			break;
		case 4:
			resposta = "LOL";
			break;
		}
		System.out.println("Carlos: " + resposta);
	}
}
