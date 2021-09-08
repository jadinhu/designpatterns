package entity;

import java.util.ArrayList;
import java.util.List;

import interfaces.Subject;
import interfaces.Observer;

public class Mussum implements Subject
{
	private int contador;
	private String[] frases =
	{ 		"Mussum: Os senhores t�m um copo de leite de capivara da barra do Pia�?",
			"Mussum: Humm... Os senhores n�o tem ai leite de mula manca sem cabe�a?",
			"Mussum: Mas que massada! Voc�s n�o t�m nem leite de perereca ai?!", 
			"Mussum: Nem leite de gan�o manso?!",
			"Mussum: Bom, Deus � testemunha que eu queria tomar leite... bota uma cacha�a ai! hehe XD" };
	private List<Observer> observers;

	public Mussum()
	{
		observers = new ArrayList<Observer>();
		contador = -1;
	}

	public void proximaFrase()
	{
		contador++;
		System.out.println(frases[contador]);
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer ob)
	{
		observers.add(ob);
		System.out.println();
	}

	@Override
	public void removeObserver(Observer ob)
	{
		observers.remove(ob);
	}

	@Override
	public void notifyObservers()
	{
		for (Observer ob : observers)
		{
			ob.update(contador);
		}
	}
}
