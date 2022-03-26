package restaurante;

import java.util.ArrayList;

public class Pedido {
	private Cliente cliente;
	private float taxaServico;
	private ArrayList<Prato> itens_consumidos = new ArrayList<>();
	
	
	public Pedido(Cliente cliente, float taxaServico, ArrayList<Prato> itens_consumidos) {
		super();
		this.cliente = cliente;
		this.taxaServico = taxaServico;
		this.itens_consumidos = itens_consumidos;
	}


	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", taxaServico=" + taxaServico + ", itens_consumidos=" + itens_consumidos
				+ "]";
	}
	
	
	
	
}