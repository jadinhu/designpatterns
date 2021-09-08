package acusador;

import responsavel.PT;

public class ClasseMedia extends Acusador {
	
	public ClasseMedia() {
		setNome("Guri da classe média");
		setPremissa("O bolsa família é para famílias com renda per capita inferior a R$ 70, " +
				"faz parte de campanhas contra a fome e de inclusão social. Ajuda famílias 'invisíveis' à sociedade, " +
				"grande parte deles moram em lares improvisádos pelas mesmas, como casas de palha. " +
				"O Bolsa família recebeu, inclusive, o prêmio internacional do ISSA - Prêmio  Desempenho Extraordinário em Seguridade Social." +
				"\nO guri da classe média nunca passou fome, sempre teve onde morar e o que vestir, boa educação e inserção social.");
		setAcusacao("Cara de pau! O bolsa família é apenas uma compra de votos! O povo não precisa, só recebe porque é vagabundo.");
	}

	@Override
	public void acusar() {
		PT.getInstance().levarCulpa(this, getPremissa(), getAcusacao());
	}

}
