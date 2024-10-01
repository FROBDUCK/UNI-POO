package interfacee;

public class Main {
    public static void main(String[] args) {
        // Criando objetos das classes que implementam a interface
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        // Chamando os métodos
        carro.acelerar(); // Saída: O carro está acelerando.
        carro.frear(); // Saída: O carro está freando.

        moto.acelerar(); // Saída: A moto está acelerando.
        moto.frear(); // Saída: A moto está freando.
    }
}
