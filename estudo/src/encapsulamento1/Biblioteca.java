package encapsulamento1;

public class Biblioteca {
    public void add_livro(Livro livro){
        System.out.println(livro.getTitulo() + " " + livro.getAutor());
    }
}
