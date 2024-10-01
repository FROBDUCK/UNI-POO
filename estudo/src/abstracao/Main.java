package abstracao;

public class Main {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        // Chamando os métodos
        cachorro.som(); // Saída: O cachorro faz: Au Au
        cachorro.dormir(); // Saída: O animal está dormindo

        gato.som(); // Saída: O gato faz: Miau
        gato.dormir(); // Saída: O animal está dormindo
    }
}
