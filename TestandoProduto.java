package exercicios;

public class TestandoProduto {
	public static void main (String args []) {
		
		ProdutoEletr�nico produto1 = new ProdutoEletr�nico();
		ProdutoEletr�nico produto2 = new ProdutoEletr�nico();
		
		produto1.setNomeProduto("Playstation 5");
		produto1.setMarcaProduto("Sony");
		produto1.setAnoLancamentoProduto(2020);
		produto1.setPrecoProduto(8.499);
		produto1.setPaisCriacaoProduto("Jap�o");
		
		produto2.setNomeProduto("Xbox x");
		produto2.setMarcaProduto("Microsoft");
		produto2.setAnoLancamentoProduto(2020);
		produto2.setPrecoProduto(4.599);
		produto2.setPaisCriacaoProduto("EUA");
		
		System.out.println("Nome do produto: " + produto1.getNomeProduto());
		System.out.println("Marca do produto: " + produto1.getMarcaProduto());
		System.out.println("Ano de lan�amento: " + produto1.getAnoLancamentoProduto());
		System.out.println("Pre�o do Produto: " + produto1.getPrecoProduto());
		System.out.println("Pais de origem: " + produto1.getPaisCriacaoProduto());
		
		System.out.println("\nNome do produto: " + produto2.getNomeProduto());
		System.out.println("Marca do produto: " + produto2.getMarcaProduto());
		System.out.println("Ano de lan�amento: " + produto2.getAnoLancamentoProduto());
		System.out.println("Pre�o do Produto: " + produto2.getPrecoProduto());
		System.out.println("Pais de origem: " + produto2.getPaisCriacaoProduto());
		
		
		
		
		
				
		
	}
	

}
