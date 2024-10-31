package q2;

public class Carro extends Veiculo {
    public int nDePortas;

    public Carro(String marca, String modelo, int ano, int nDePortas){
        this.nDePortas = nDePortas;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

}
