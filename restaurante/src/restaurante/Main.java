package restaurante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Lanchonete lanchonete = new Lanchonete();

        System.out.println("MENU");
        System.out.println("Escolha a opção desejada");
        System.out.println("1 - Sanduiche ");
        System.out.println("2 - Pizza");
        System.out.println("3 - Salgadinho ");
        System.out.println("4- SAIR");

        int pedido = scan.nextInt();
        lanchonete.fazerPedido(pedido);
        lanchonete.listar();

    }
}
