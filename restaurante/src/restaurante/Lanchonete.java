package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete {

    Cliente cliente = new Cliente();
    private ArrayList<Prato> pratosDisponiveis = new ArrayList<Prato>();
    Pedido pedido = new Pedido(cliente, 20, pratosDisponiveis);
    Scanner scan = new Scanner(System.in);
    Prato prato;
    Sanduiche sanduiche;
    Pizza pizza;
    Salgadinho salgadinho;

    public void carregarPratos() {

    }

    /**
     * @param opcao
     */
    public void fazerPedido(int opcao) {

        switch (opcao) {
            case 1:
                boolean pedido = false;

                while (!pedido) {
                    Sanduiche sanduiche = new Sanduiche(scan.next(),scan.next(), scan.nextDouble(), scan.nextDouble(), scan.next(), scan.next(), scan.next());
                    System.out.println("Informe o sabor do sanduiche");
                    this.sanduiche.setNome(scan.next());

                    System.out.println("Informe a validade");
                    this.sanduiche.setDataValidade(scan.next());

                    System.out.println("Informe o valor");
                    this.sanduiche.setPreco(12.5);

                    System.out.println("Informe o peso");
                    this.sanduiche.setPeso(scan.nextInt());
                    
                    System.out.println("informe o pão");
                    this.sanduiche.setPao(scan.next());

                    System.out.println("Infotme o recheio");
                    this.sanduiche.setRecheio(scan.next());

                    System.out.println("Informe o molho");
                    this.sanduiche.setMolho(scan.next());

                    Sanduiche sanduiche = new Sanduiche(this.sanduiche.getNome(), this.sanduiche.getDataValidade(), this.sanduiche.getPreco(), this.sanduiche.getPeso(), this.sanduiche.getPao(), this.sanduiche.getRecheio(), this.sanduiche.getMolho());
                    pratosDisponiveis.add(sanduiche);

                    System.out.println("Deseja continuar fazendo pedido");
                    pedido = scan.nextBoolean();

                    break;

                }

            case 2:

                System.out.println("Deseja continuar fazendo pedido");
                pedido = scan.nextBoolean();

                while (!pedido) {
                    System.out.println("Informe o sabor da pizza");
                    pizza.setNome(scan.next());

                    System.out.println("Informe a validade");
                    pizza.setDataValidade(scan.next());

                    System.out.println("Informe o valor");
                    pizza.setPreco(12.5);

                    System.out.println("informe a massa");
                    pizza.setMassa(scan.next());

                    System.out.println("Infotme o recheio");
                    pizza.setRecheio(scan.next());

                    System.out.println("Informe o molho");
                    pizza.setBorda(scan.next());

                    Pizza pizza = new Pizza(this.pizza.getNome(), this.pizza.getDataValidade(), this.pizza.getPreco(), 12.2, this.pizza.getMassa(), this.pizza.getRecheio(), this.pizza.getBorda());
                    pratosDisponiveis.add(pizza);

                    break;
                }

            case 3:

                System.out.println("Deseja continuar fazendo pedido");
                pedido = scan.nextBoolean();

                while (!pedido) {
                    System.out.println("Informe o sabor da pizza");
                    salgadinho.setNome(scan.next());

                    System.out.println("Informe a validade");
                    salgadinho.setDataValidade(scan.next());

                    System.out.println("Informe o valor");
                    salgadinho.setPreco(12.5);

                    System.out.println("Informe o peso");
                    salgadinho.setDataValidade(scan.next());

                    System.out.println("informe a massa");
                    salgadinho.setMassa(scan.next());

                    System.out.println("Infotme o recheio");
                    salgadinho.setRecheio(scan.next());

                    Salgadinho salgadinho = new Salgadinho(this.salgadinho.getNome(), this.salgadinho.getDataValidade(), this.salgadinho.getPreco(), this.salgadinho.getPeso(), this.salgadinho.getMassa(), this.salgadinho.getRecheio());
                    pratosDisponiveis.add(salgadinho);
                    break;

                }

            case 4:
                System.exit(0);
                break;
            default:
                System.exit(0);
        }

        System.out.println("Informe seu nome");
        String nome = scan.next();
        cliente.setNome(nome);

    }

    public void listar() {
        for (Prato p : pratosDisponiveis) {
            System.out.println(p);

        }
        System.out.println();
        System.out.println(pedido);

    }
}
