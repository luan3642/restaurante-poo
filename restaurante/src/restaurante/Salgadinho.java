package restaurante;


public class Salgadinho extends Prato{
	private String massa;
	private String recheio;
	
	
	
	public Salgadinho(String nome, String dataValidade, double preco, double peso, String massa, String recheio) {
		super(nome, dataValidade, preco, peso);
		this.massa = massa;
		this.recheio = recheio;
	}
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	
}
