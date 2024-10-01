package questao12;

public class SessaoCinema{

String horario;
String filme;
int capacidadeTotal;
int ingressosVendidos;

SessaoCinema(String filme, String horario, int  capacidadeTotal, int ingressosVendidos){
    this.filme=filme;
    this.horario=horario;
    this.capacidadeTotal=capacidadeTotal;
    this.ingressosVendidos=ingressosVendidos;
}

void venderIngresso(){
    if(this.capacidadeTotal >= this.ingressosVendidos){
        this.capacidadeTotal -= this.ingressosVendidos;
    }else{
        System.out.println("nenhum ingresso disponivel");
    }
}

void cancelarIngresso(){
    if(this.ingressosVendidos >= 1){
        this.capacidadeTotal -= 1;
        System.out.println("ingresso cancelado");
    }else{
        System.out.println("vc n possui ingresso para cancelar");
    }
}

void exibirSessao(){
    System.out.println("filme: " + this.filme + " lugares disponiveis: " + "horario: "+ this.horario + "capacidade total" + this.capacidadeTotal);
}
void alterarHorario(String novoHorario){
    this.horario = novoHorario;
    System.out.println("horario alterado para: " + horario);

}
}
