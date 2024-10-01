package questao9;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do paciente " + (i + 1) + ":");
            String nome = s.nextLine();

            System.out.println("Digite a idade do paciente " + (i + 1) + ":");
            int idade = s.nextInt();
            s.nextLine();

            System.out.println("Digite o diagnóstico do paciente " + (i + 1) + ":");
            String diagnostico = s.nextLine();

            pacientes.add(new Paciente(nome, idade, diagnostico));
        }

        System.out.println("Informações dos Pacientes:");
        for (Paciente paciente : pacientes) {
            paciente.exibirInfor();
        }

        s.close();
    }
}
