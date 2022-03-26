package restaurante;

public class Pizza extends Prato{
	private String massa;
	private String recheio;
	private String borda;
	



	public Pizza(String nome, String dataValidade, double preco, double peso, String massa, String recheio,
			String borda) {
		super(nome, dataValidade, preco, peso);
		this.massa = massa;
		this.recheio = recheio;
		this.borda = borda;
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


	public String getBorda() {
		return borda;
	}


	public void setBorda(String borda) {
		this.borda = borda;
	}


	@Override
	public String toString() {
		return "Pizza [massa=" + massa + ", recheio=" + recheio + ", borda=" + borda + "]";
	}
	
	
	
	
	
	
}
