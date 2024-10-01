package questao6;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a placa do veículo " + (i + 1) + ":");
            String placa = s.nextLine();

            System.out.println("Digite a marca do veículo " + (i + 1) + ":");
            String marca = s.nextLine();

            System.out.println("Digite o ano do veículo " + (i + 1) + ":");
            int ano = s.nextInt();
            s.nextLine();

            veiculos.add(new Veiculo(placa, marca, ano));
        }

        System.out.println("Informações dos Veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInfor();
        }

        s.close();
    }
}
