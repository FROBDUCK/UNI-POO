package questao4;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento + "Salario: " + this.salario);

    }
}
