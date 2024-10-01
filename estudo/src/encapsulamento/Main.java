package encapsulamento;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("fiat", "carro 1", 0);

        c1.acelerar(5);
        System.out.println(c1.getVelocidade());

    }
}
