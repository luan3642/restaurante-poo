package restaurante;


public class Prato {
	private String nome;
	private String dataValidade;
	private double preco;
	private double peso;
	
	
	
	public Prato(String nome, String dataValidade, double preco, double peso) {
		super();
		this.nome = nome;
		this.dataValidade = dataValidade;
		this.preco = preco;
		this.peso = peso;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDataValidade() {
		return dataValidade;
	}



	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
}