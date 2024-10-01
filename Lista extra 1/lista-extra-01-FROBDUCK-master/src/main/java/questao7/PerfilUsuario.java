package questao7;

public class PerfilUsuario {
    private String nomeUsuario;
    private String bio;
    private int numeroSeguidores;

    public PerfilUsuario(String nomeUsuario, String bio, int numeroSeguidores) {
        this.nomeUsuario = nomeUsuario;
        this.bio = bio;
        this.numeroSeguidores = numeroSeguidores;
    }

    public void exibirInfor() {
        System.out.println("Nome de Usuário: " + this.nomeUsuario + " Bio: " + this.bio + " Número de Seguidores: " + this.numeroSeguidores);
    }

}
