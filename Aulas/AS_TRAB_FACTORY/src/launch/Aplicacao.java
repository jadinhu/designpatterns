package launch;

import produto.EnumCaneta;
import fabricas.CanetaFactory;
import fabricas.CanetaFactoryBrasil;
import fabricas.CanetaFactoryPortugal;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		CanetaFactory canetaFactoryBrasil = new CanetaFactoryBrasil(); 
		CanetaFactory canetaFactoryPortugal = new CanetaFactoryPortugal();
		
		System.out.println("Descrevendo e comparando canetas fabricadas no Brasil x Portugal:");
		
		canetaFactoryBrasil.fabricarCaneta(EnumCaneta.POPULAR).descreverUtilidade();
		System.out.println();
		canetaFactoryPortugal.fabricarCaneta(EnumCaneta.POPULAR).descreverUtilidade();
		
		System.out.println();
		System.out.println();
		
		canetaFactoryBrasil.fabricarCaneta(EnumCaneta.LED).descreverUtilidade();
		System.out.println();
		canetaFactoryPortugal.fabricarCaneta(EnumCaneta.LED).descreverUtilidade();
		
		System.out.println();
		System.out.println();
		
		canetaFactoryBrasil.fabricarCaneta(EnumCaneta.NOME).descreverUtilidade();
		System.out.println();
		canetaFactoryPortugal.fabricarCaneta(EnumCaneta.NOME).descreverUtilidade();
		
		System.out.println();
		System.out.println("\nuahuahuahauhau xD");
	}

}
