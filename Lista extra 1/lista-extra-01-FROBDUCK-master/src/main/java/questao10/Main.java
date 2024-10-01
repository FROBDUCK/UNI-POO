package questao10;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o número do pedido " + (i + 1) + ":");
            int numeroPedido = s.nextInt();
            s.nextLine();

            System.out.println("Digite a descrição dos itens do pedido " + (i + 1) + ":");
            String descricaoItens = s.nextLine();

            System.out.println("Digite o valor total do pedido " + (i + 1) + ":");
            double valorTotal = s.nextDouble();
            s.nextLine();

            pedidos.add(new Pedido(numeroPedido, descricaoItens, valorTotal));
        }

        System.out.println("Informações dos Pedidos:");
        for (Pedido pedido : pedidos) {
            pedido.exibirInfor();
        }

        s.close();
    }
}
