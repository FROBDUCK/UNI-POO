package at7;

public class Main {
    public static void main(String[] args) {
        PerfilUsuario p1 = new PerfilUsuario("GUSTAVO", "asdhasd", 120394);
        PerfilUsuario p2 = new PerfilUsuario("maria", "ashdajsd", 2837417);
        PerfilUsuario p3 = new PerfilUsuario("marlon", "gfgsgjsd", 25631417);

        System.out.println(p1.nome + " " + p1.bio + " " + p1.seguidores);
        System.out.println(p2.nome + " " + p2.bio + " " + p2.seguidores);
        System.out.println(p3.nome + " " + p3.bio + " " + p3.seguidores);
    }
}
