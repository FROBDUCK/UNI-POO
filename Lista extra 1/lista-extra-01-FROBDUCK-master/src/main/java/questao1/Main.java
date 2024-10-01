package questao1;

import questao2.Aluno;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do livro " + (i + 1) + ":");
            String nome = s.nextLine();

            System.out.println("Digite o nome do autor " + (i + 1) + ":");
            String autor = s.nextLine();
            s.nextLine();

            System.out.println("Digite o ano de publicação " + (i + 1) + ":");
            int ano = s.nextInt();

            biblioteca.add(new Livro(nome, autor, ano));
        }

        for (Livro livro : biblioteca) {
            livro.exibirInfo();
        }
        s.close();
    }
}
