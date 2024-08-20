import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("diga o nome, autor e ano de publicação do livro");
        Livro livro1 = new Livro(s.nextLine(), s.nextLine(), s.nextInt());
        System.out.println("diga o nome, autor e ano de publicação do livro");
        Livro livro2 = new Livro(s.nextLine(), s.nextLine(), s.nextInt());
        System.out.println("diga o nome, autor e ano de publicação do livro");
        Livro livro3 = new Livro(s.nextLine(), s.nextLine(), s.nextInt());


        System.out.println(livro1.titulo + " " + livro2.titulo + " " + livro3.titulo);
        System.out.println(livro1.autor + " " + livro2.autor + " " + livro3.autor);
        System.out.println(livro1.ano + " " + livro2.ano + " " + livro3.ano);

        s.close();

        
    }
} 