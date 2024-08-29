package at1;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("diga o numero da conta, nome do titular, e saldo");
        ContaCorrente c1 = new ContaCorrente(s.nextLine(), s.nextLine(), s.nextDouble());

        c1.exibirSaldo();
        c1.depositar(s.nextDouble());
        c1.sacar(s.nextDouble());

        s.close();

    }
}
