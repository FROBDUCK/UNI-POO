package questao8;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Evento> eventos = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do evento " + (i + 1) + ":");
            String nomeEvento = s.nextLine();

            System.out.println("Digite a data do evento " + (i + 1) + ":");
            String data = s.nextLine();

            System.out.println("Digite o local do evento " + (i + 1) + ":");
            String local = s.nextLine();

            eventos.add(new Evento(nomeEvento, data, local));
        }

        System.out.println("Informações dos Eventos:");
        for (Evento evento : eventos) {
            evento.exibirInfor();
        }

        s.close();
    }
}
