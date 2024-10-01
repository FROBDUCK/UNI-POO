package questao9;

public class Paciente {
    private String nome;
    private int idade;
    private String diagnostico;

    public Paciente(String nome, int idade, String diagnostico) {
        this.nome = nome;
        this.idade = idade;
        this.diagnostico = diagnostico;
    }

    public void exibirInfor() {
        System.out.println("Nome: " + this.nome + " Idade: " + this.idade + " Diagnóstico: " + this.diagnostico);
    }
}
