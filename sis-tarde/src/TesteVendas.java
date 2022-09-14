
public class TesteVendas {

	public static void main(String[] args) {
		//criando objetos
		System.out.println("CRIANDO OBJETOS:");
		ControleDeVendas venda1 = new ControleDeVendas(111111,12,"Produto001",120.00);
		System.out.print(" Código: "+venda1.getCodigoDoProduto());
		System.out.print(" Quantidade: "+venda1.getQuantidadeDoProduto());
		System.out.print(" Nome: "+venda1.getNomeDoProduto());
		System.out.print(" Preço: R$"+venda1.getPrecoDoProduto());
		
		System.out.println();
		System.out.println();
		
		//Testando Setters:
		System.out.println("ALTERANDO ATRIBUTOS TESTE SETTER:");
		venda1.setCodigoDoProduto(121212);
		venda1.setQuantidadeDoProduto(15);
		venda1.setNomeDoProduto("Produto111");
		venda1.setPrecoDoProduto(130.36);
		
		System.out.print(" Código: "+venda1.getCodigoDoProduto());
		System.out.print(" Quantidade: "+venda1.getQuantidadeDoProduto());
		System.out.print(" Nome: "+venda1.getNomeDoProduto());
		System.out.print(" Preço: R$"+venda1.getPrecoDoProduto());
		
		System.out.println();
		
		venda1.setPrecoDoProduto(-1000);
		System.out.println("Preço se negativo: R$"+venda1.getPrecoDoProduto());
		
		venda1.setPrecoDoProduto(0);
		System.out.println("Preço se zero: R$"+venda1.getPrecoDoProduto());
		
		System.out.println();
		System.out.println();
		
		//criando objetos apenas com valor e quantidade
		System.out.println("CRIANDO OBJETOS APENAS COM VALOR E QUANTIDADE: codigo fixo 102030 E nome JAVA:");
		ControleDeVendas venda2 = new ControleDeVendas(20,170.00);
		System.out.print(" Código: "+venda2.getCodigoDoProduto());
		System.out.print(" Quantidade: "+venda2.getQuantidadeDoProduto());
		System.out.print(" Nome: "+venda2.getNomeDoProduto());
		System.out.print(" Preço: R$"+venda2.getPrecoDoProduto());
		
		System.out.println();
		System.out.println();
		
		//testando valores negativos:
		System.out.println("TESTANDO CRIAR OBJETOS COM VALORES NEGATIVOS E ZERO");
		ControleDeVendas venda3 = new ControleDeVendas (333333,50,"Produto003",-555.36);
		System.out.print(" Código: "+venda3.getCodigoDoProduto());
		System.out.print(" Quantidade: "+venda3.getQuantidadeDoProduto());
		System.out.print(" Nome: "+venda3.getNomeDoProduto());
		System.out.print(" Preço: R$"+venda3.getPrecoDoProduto());
		
		System.out.println();
		System.out.println();
		
		ControleDeVendas venda4 = new ControleDeVendas (50,-555.36);
		System.out.print(" Código: "+venda4.getCodigoDoProduto());
		System.out.print(" Quantidade: "+venda4.getQuantidadeDoProduto());
		System.out.print(" Nome: "+venda4.getNomeDoProduto());
		System.out.print(" Preço: R$"+venda4.getPrecoDoProduto());
		
		System.out.println();
		System.out.println();
		
		ControleDeVendas venda5 = new ControleDeVendas (95,0.00);
		System.out.print(" Código: "+venda5.getCodigoDoProduto());
		System.out.print(" Quantidade: "+venda5.getQuantidadeDoProduto());
		System.out.print(" Nome: "+venda5.getNomeDoProduto());
		System.out.print(" Preço: R$"+venda5.getPrecoDoProduto());
		
	}

}
