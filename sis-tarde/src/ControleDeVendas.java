
public class ControleDeVendas {
	//declaração de atributos da classe
	private int codigoDoProduto;
	private int quantidadeDoProduto;
	private String nomeDoProduto;
	private double precoDoProduto;
	
	//código contrutor principal
	public ControleDeVendas(int codigoDoProduto, int quantidadeDoProduto, String nomeDoProduto, double precoDoProduto) {
		super();
		this.codigoDoProduto = codigoDoProduto;
		this.quantidadeDoProduto = quantidadeDoProduto;
		this.nomeDoProduto = nomeDoProduto;
		
		if (precoDoProduto > 0) {
			this.precoDoProduto = precoDoProduto;
			return;
		}
		System.out.println("Não é possível atribuir valor igual ou inferior a zero! Será atribuído o valor 9999");
		this.precoDoProduto = 9999;
		
	}
	
	//código construtor quantidade e valor
	public ControleDeVendas(int quantidadeDoProduto, double precoDoProduto) {
		this(102030, quantidadeDoProduto, "Java-Orientado a Objeto", precoDoProduto);
	}

	//Getter e Setter
	public int getCodigoDoProduto() {
		return this.codigoDoProduto;
	}

	public void setCodigoDoProduto(int codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public int getQuantidadeDoProduto() {
		return this.quantidadeDoProduto;
	}

	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}

	public String getNomeDoProduto() {
		return this.nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getPrecoDoProduto() {
		return this.precoDoProduto;
	}

	public void setPrecoDoProduto(double precoDoProduto) {
		if (precoDoProduto > 0) {
			this.precoDoProduto = precoDoProduto;
			return;
		}
		System.out.println("Não é possível alterar o preço para valor igual ou inferior a zero reais! Será atribuído o valor 9999.");
		this.precoDoProduto = 9999;
		
	}	
	
}
