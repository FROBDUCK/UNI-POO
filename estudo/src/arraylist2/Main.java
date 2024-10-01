package arraylist2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        biblioteca.add(new Livro("titulo", "autor"));
        biblioteca.add(new Livro("tilo", "aur"));

        for (Livro livro : biblioteca) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }

    }
}
