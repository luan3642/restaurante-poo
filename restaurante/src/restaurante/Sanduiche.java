package restaurante;


public class Sanduiche extends Prato {
	
	private String pao;
	private String recheio;
	private String molho;
	
	
	
	public Sanduiche(String nome, String dataValidade, double preco, double peso, String pao, String recheio,
			String molho) {
		super(nome, dataValidade, preco, peso);
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}

	
	
	public String getPao() {
		return pao;
	}
	public void setPao(String pao) {
		this.pao = pao;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}



	@Override
	public String toString() {
		return "Sanduiche [pao=" + pao + ", recheio=" + recheio + ", molho=" + molho + "]";
	}
	
	
	
	
	
	

}