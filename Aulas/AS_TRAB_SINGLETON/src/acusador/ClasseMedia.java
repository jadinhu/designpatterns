package acusador;

import responsavel.PT;

public class ClasseMedia extends Acusador {
	
	public ClasseMedia() {
		setNome("Guri da classe m�dia");
		setPremissa("O bolsa fam�lia � para fam�lias com renda per capita inferior a R$ 70, " +
				"faz parte de campanhas contra a fome e de inclus�o social. Ajuda fam�lias 'invis�veis' � sociedade, " +
				"grande parte deles moram em lares improvis�dos pelas mesmas, como casas de palha. " +
				"O Bolsa fam�lia recebeu, inclusive, o pr�mio internacional do ISSA - Pr�mio  Desempenho Extraordin�rio em Seguridade Social." +
				"\nO guri da classe m�dia nunca passou fome, sempre teve onde morar e o que vestir, boa educa��o e inser��o social.");
		setAcusacao("Cara de pau! O bolsa fam�lia � apenas uma compra de votos! O povo n�o precisa, s� recebe porque � vagabundo.");
	}

	@Override
	public void acusar() {
		PT.getInstance().levarCulpa(this, getPremissa(), getAcusacao());
	}

}
