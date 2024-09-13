package at2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        SessaoCinema s1 = new SessaoCinema("up", "20:00", 20, 0);

        s1.venderIngresso();
        s1.exibirSessao();
        s1.cancelarIngresso();
        s1.exibirSessao();
        System.out.println("alterar horario para");
        s1.alterarHorario(s.nextLine());

        s.close();
    }
    
}
