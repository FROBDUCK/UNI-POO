package at10;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(4182, "pízza de queijo", 30.00);
        Pedido p2 = new Pedido(327, "cachorro quente", 8.00);
        Pedido p3 = new Pedido(6728, "hamburguer", 10.00);

        System.out.println(p1.num + " " + p1.desc + " " + p1.valor);
        System.out.println(p2.num + " " + p2.desc + " " + p2.valor);
        System.out.println(p3.num + " " + p3.desc + " " + p3.valor);
    }
}
