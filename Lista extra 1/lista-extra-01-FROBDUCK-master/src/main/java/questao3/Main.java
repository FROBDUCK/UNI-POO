package questao3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> catalogo = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ":");
            String nome = s.nextLine();

            System.out.println("Digite o preço do produto " + (i + 1) + ":");
            double preco = s.nextDouble();
            s.nextLine();

            System.out.println("Digite a categoria do produto " + (i + 1) + ":");
            String categoria = s.nextLine();

            catalogo.add(new Produto(nome, preco, categoria));
        }

        System.out.println("\nInformações dos produtos:");
        for (Produto produto : catalogo) {
            produto.exibirInformacoes();
        }

        s.close();
    }
}
