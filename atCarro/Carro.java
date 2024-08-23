package atCarro;
public class Carro {
    String modelo;
    String montadora;
    int ano;
    int velocidade;
    boolean estaLigado;

    Carro(
        String modelo, String montadora, int ano, boolean estaLigado, int velocidade){
            this.modelo=modelo;
            this.montadora=montadora;
            this.ano=ano;
            this.velocidade=velocidade;
            this.estaLigado=estaLigado;
        }
        

        void ligar(){
            this.estaLigado=true;
            System.out.println("ligou o carro");
        }

        void desligar(){
            this.estaLigado=false;
            System.out.println("desligou o carro");
        }
        
        void acelerar(){
            this.velocidade +=20;
            System.out.println("acelerando, velocidade atual" + this.velocidade);
        }

        void freiar(){
            if(this.velocidade<30){
                this.velocidade=0;
            }else{
            this.velocidade -= 30;
            }
            System.out.println("freiando, velocidade atual:" + this.velocidade);
        }
    }