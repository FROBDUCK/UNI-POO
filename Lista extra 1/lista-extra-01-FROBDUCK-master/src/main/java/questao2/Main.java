package questao2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = s.nextLine();

            System.out.println("Digite a idade do aluno " + (i + 1) + ":");
            int idade = s.nextInt();
            s.nextLine();

            System.out.println("Digite a série do aluno " + (i + 1) + ":");
            String serie = s.nextLine();

            alunos.add(new Aluno(nome, idade, serie));
        }

        System.out.println("Informações dos alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }
        s.close();
    }
}