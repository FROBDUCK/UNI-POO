package LISTA1.at3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("diga o nome, preco e categoria do produto");
        Produto p1 = new Produto(s.nextLine(), s.nextDouble(), s.nextLine());
        System.out.println("diga o nome, preco e categoria do produto");
        Produto p2 = new Produto(s.nextLine(), s.nextDouble(), s.nextLine());
        System.out.println("diga o nome, preco e categoria do produto");
        Produto p3 = new Produto(s.nextLine(), s.nextDouble(), s.nextLine());
        

        System.out.println(p1.nome + " " + p1.preco + " " + p1.categoria);
        System.out.println(p2.nome + " " + p2.preco + " " + p2.categoria);
        System.out.println(p3.nome + " " + p3.preco + " " + p3.categoria);
        

        s.close();
    }
} 