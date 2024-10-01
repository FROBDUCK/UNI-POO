package questao2;

public class Aluno {
    private String nome;
    private int idade;
    private String serie;

    public Aluno(String nome, int idade, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + "Idade: " + this.idade + "Serie: " + this.serie);
    }


}
