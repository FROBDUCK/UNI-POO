package questao4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ":");
            String nome = s.nextLine();

            System.out.println("Digite o departamento do funcionário " + (i + 1) + ":");
            String departamento = s.nextLine();

            System.out.println("Digite o salário do funcionário " + (i + 1) + ":");
            double salario = s.nextDouble();
            s.nextLine();

            funcionarios.add(new Funcionario(nome, departamento, salario));
        }

        System.out.println("Informações dos funcionários:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInfo();
        }

        s.close();
    }
}
