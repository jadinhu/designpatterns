package launch;

import adapter.JogadorSemNocao;
import funcao.Carry;
import funcao.ICarry;
import funcao.ISuport;
import funcao.Suport;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		ICarry carry = new Carry();
		ISuport suport = new Suport();
		ICarry eraldo = new JogadorSemNocao(suport);
		
		System.out.println("Suporte do outro time:");
		suport.poke();
		suport.auxiliar();
		System.out.println();
		System.out.println("Suporte do meu time:");
		suport.poke();
		suport.auxiliar();
		System.out.println();
		System.out.println("Carry do outro time");
		carry.atacar();
		carry.posicionar();
		System.out.println();
		System.out.println("Carry do meu time");
		eraldo.atacar();
		eraldo.posicionar();
		
	}

}
