package questao15;

public class ControleDeEstoque {
String nome;
int quantidade;
double precoUnitario;

ControleDeEstoque(String nome, int quantidade, double precoUnitario){
    this.nome=nome;
    this.quantidade=quantidade;
    this.precoUnitario=precoUnitario;
}

void aumentarEstoque(int quantidade){
    this.quantidade =+ 1;
    System.out.println("vc aumentou o estoque");
}

void removerEstoque(int quantidade){
    if(quantidade >=1){
        this.quantidade =- quantidade;
    }else{
        System.out.println("não foi possivel remover estoque");
    }
}

void atualizarPreco(double novoPreco){
    this.precoUnitario = novoPreco;
    System.out.println("preço foi atualizado");
}

void exibirProduto(){
    System.out.println(nome + " " + quantidade + " " + precoUnitario);
}
}

