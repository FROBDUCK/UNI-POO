package atCarro;

public class Main {

    public static void main(String[] args){

        Carro c1 = new Carro("fiat", "sla", 2000, false, 0);

        c1.ligar();
        c1.desligar();
        c1.acelerar();
        c1.freiar();
    }
}