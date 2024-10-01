package questao6;

public class Veiculo {
    private String placa;
    private String marca;
    private int ano;

    public Veiculo(String placa, String marca, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirInfor() {
        System.out.println("Placa: " + this.placa + "Marca: " + this.marca + "Ano: " + this.ano);
    }
}
