package questao5;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Reserva> reservas = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do hóspede " + (i + 1) + ":");
            String nomeHospede = s.nextLine();

            System.out.println("Digite o tipo de quarto do hóspede " + (i + 1) + " (simples, duplo, suíte):");
            String tipoQuarto = s.nextLine();

            System.out.println("Digite o número de noites do hóspede " + (i + 1) + ":");
            int numeroNoites = s.nextInt();
            s.nextLine();

            reservas.add(new Reserva(nomeHospede, tipoQuarto, numeroNoites));
        }

        System.out.println("Informações das Reservas:");
        for (Reserva reserva : reservas) {
            reserva.exibirInfo();
        }

        s.close();
    }

}
