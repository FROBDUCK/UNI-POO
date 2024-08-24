package LISTA1.at4;
import java.util.Scanner;

public class Main {
    Scanner s = new Scanner(System.in);
    
    Funcionario f1 = new Funcionario(s.nextLine(), s.nextLine(), s.nextDouble());
    Funcionario f2 = new Funcionario(s.nextLine(), s.nextLine(), s.nextDouble());
    Funcionario f3 = new Funcionario(s.nextLine(), s.nextLine(), s.nextDouble());

    System.out.println("nome: "+ f1.nome + " departamento: " + f1.departamento + " salario: " + f1.salario);
    System.out.println("nome: "+ f2.nome + " departamento: " + f2.departamento + " salario: " + f2.salario);
    System.out.println("nome: "+ f3.nome + " departamento: " + f3.departamento + " salario: " + f3.salario);
    
    s.close();
}
