package entity;

import java.util.ArrayList;
import java.util.List;

import interfaces.Subject;
import interfaces.Observer;

public class Mussum implements Subject
{
	private int contador;
	private String[] frases =
	{ 		"Mussum: Os senhores têm um copo de leite de capivara da barra do Piaí?",
			"Mussum: Humm... Os senhores não tem ai leite de mula manca sem cabeça?",
			"Mussum: Mas que massada! Vocês não têm nem leite de perereca ai?!", 
			"Mussum: Nem leite de ganço manso?!",
			"Mussum: Bom, Deus é testemunha que eu queria tomar leite... bota uma cachaça ai! hehe XD" };
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
