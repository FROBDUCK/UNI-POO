package arraylist;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um ArrayList de String
        ArrayList<String> frutas = new ArrayList<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Acessando elementos
        System.out.println("Fruta no índice 1: " + frutas.get(1));  // Saída: Banana

        // Modificando elementos
        frutas.set(1, "Morango");
        System.out.println("Fruta no índice 1 após modificação: " + frutas.get(1));  // Saída: Morango

        // Removendo elementos
        frutas.remove("Laranja");

        // Iterando pelo ArrayList
        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Verificando o tamanho
        System.out.println("Tamanho da lista: " + frutas.size());  // Saída: 2

        // Verificando se contém um elemento
        System.out.println("Contém Maçã? " + frutas.contains("Maçã"));  // Saída: true
    }
}
