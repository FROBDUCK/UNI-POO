package questao15;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ControleDeEstoque e1 = new ControleDeEstoque("aaaaa",15, 50);

        e1.atualizarPreco(10);
        e1.removerEstoque(0);
        e1.aumentarEstoque(0);
        e1.exibirProduto();



        }
    }
