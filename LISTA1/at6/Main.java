package at6;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo(1245, "ford", 1999);
        Veiculo v2 = new Veiculo(9243, "fiat", 1998);
        Veiculo v3 = new Veiculo(13245, "volkswagen", 1999);

        System.out.println(v1.ano + " " + v1.marca + " " +  v1.ano);
        System.out.println(v2.ano + " " + v2.marca + " " +  v2.ano);
        System.out.println(v3.ano + " " + v3.marca + " " +  v3.ano);

    }
}
