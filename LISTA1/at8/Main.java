package at8;

public class Main {
    public static void main(String[] args) {
        Evento e1 = new Evento("evento top", "27/08", "belo jardim");
        Evento e2 = new Evento("campus party", "07/08", "recife");
        Evento e3 = new Evento("ev 5", "29/09", "caruaru");

        System.out.println(e1.nome + " " + e1.data + " " + e1.local);
        System.out.println(e2.nome + " " + e2.data + " " + e2.local);
        System.out.println(e3.nome + " " + e3.data + " " + e3.local);
    }
}
