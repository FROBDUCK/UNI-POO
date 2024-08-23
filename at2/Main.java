package at2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("diga o nome, idade e serie do aluno");
        Aluno aluno1 = new Aluno(s.nextLine(), s.nextInt(), s.nextInt());
        System.out.println("diga o nome, idade e serie do aluno");
        Aluno aluno2 = new Aluno(s.nextLine(), s.nextInt(), s.nextInt());
        System.out.println("diga o nome, idade e serie do aluno");
        Aluno aluno3 = new Aluno(s.nextLine(), s.nextInt(), s.nextInt());

        System.out.println(aluno1.nome + " " + aluno1.idade + " " + aluno1.serie );
        System.out.println(aluno2.nome + " " + aluno2.idade + " " + aluno2.serie );
        System.out.println(aluno3.nome + " " + aluno3.idade + " " + aluno3.serie );

        s.close();

    }
} 
    
