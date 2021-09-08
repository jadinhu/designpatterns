package entity;

import interfaces.Observer;

public class Diego implements Observer
{
	private String resposta;

	@Override
	public void update(Object obj)
	{
		Integer i = (Integer) obj;
		switch (i)
		{
		case 0:
			resposta = "Tem não.";
			break;
		case 1:
			resposta = "Rapaz, tem isso não.";
			break;
		case 2:
			resposta = "Nunca vi.";
			break;
		case 3:
			resposta = "Leite de quê?!";
			break;
		case 4:
			resposta = "LOL";
			break;
		}
		System.out.println("Diego: " + resposta);
	}
}
