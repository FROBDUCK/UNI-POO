package encapsulamento;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    public Carro(String marca, String modelo, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidade += incremento;
        }
    }
    public void frear(int decremento) {
        if (decremento < 0 && this.velocidade >= decremento) {
            this.velocidade -= decremento;
        }
    }
}
