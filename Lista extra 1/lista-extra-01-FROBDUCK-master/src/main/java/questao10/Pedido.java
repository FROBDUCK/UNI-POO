package questao10;

public class Pedido {
    private int numeroPedido;
    private String descricaoItens;
    private double valorTotal;

    public Pedido(int numeroPedido, String descricaoItens, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.descricaoItens = descricaoItens;
        this.valorTotal = valorTotal;
    }

    public void exibirInfor() {
        System.out.println("Número do Pedido: " + this.numeroPedido + " Descrição dos Itens: " + this.descricaoItens + " Valor Total: " + this.valorTotal);
    }
}
