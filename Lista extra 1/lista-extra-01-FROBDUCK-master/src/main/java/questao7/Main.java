package questao7;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PerfilUsuario> perfis = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome de usuário do perfil " + (i + 1) + ":");
            String nomeUsuario = s.nextLine();

            System.out.println("Digite a bio do perfil " + (i + 1) + ":");
            String bio = s.nextLine();

            System.out.println("Digite o número de seguidores do perfil " + (i + 1) + ":");
            int numeroSeguidores = s.nextInt();
            s.nextLine();

            perfis.add(new PerfilUsuario(nomeUsuario, bio, numeroSeguidores));
        }

        System.out.println("Informações dos Perfis de Usuário:");
        for (PerfilUsuario perfil : perfis) {
            perfil.exibirInfor();
        }

        s.close();
    }
}