package questao3;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + "Preço: " + this.preco + "\nCategoria: " + this.categoria);
    }
}
