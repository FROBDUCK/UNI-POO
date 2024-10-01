package questao11;

public class ContaCorrente {
    String numDaConta;
    String titular;
    double saldo;

    ContaCorrente(String numDaConta, String titular, double saldo){
        this.numDaConta=numDaConta;
        this.titular=titular;
        this.saldo=saldo;
    }

    void depositar(double valor){
        valor += 50;
        this.saldo += valor;
        System.out.println("vc depositou: " + valor + " reais");
    }

    void sacar(double valor){
        if(valor<saldo){
            System.out.println("saldo insuficiente");
        }else{
            this.saldo -= valor;
            System.out.println("vc sacou: " + valor+ " reais");
        }
    }

    void transferir(ContaCorrente destino, double valor){

        if(this.saldo <= valor){
            System.out.println("saldo insuficiente");
        }else{
            this.saldo -=valor;
            destino.depositar(valor);
            System.out.println("vc transferiu: " + valor + "para " + destino.titular);
        }

    }
    void exibirSaldo(){
        System.out.println("seu saldo é: " + this.saldo);
    }
}
