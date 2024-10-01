package questao8;

public class Evento {
    private String nomeEvento;
    private String data;
    private String local;

    public Evento(String nomeEvento, String data, String local) {
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.local = local;
    }

    public void exibirInfor() {
        System.out.println("Nome do Evento: " + this.nomeEvento + " Data: " + this.data + " Local: " + this.local);
    }
}