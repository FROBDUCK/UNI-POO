package at4;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GerenciadorDeTarefas t1 = new GerenciadorDeTarefas("faça tal coisa", false, 0);
        
        t1.exibirTarefa();
        t1.mudarPrioridade(s.nextInt());
        t1.exibirTarefa();
        t1.concluirTarefa();
        t1.exibirTarefa();
        t1.resetarTarefa();
        t1.exibirTarefa();
        
    }
}