package at9;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("fulano", 28, "gripe");
        Paciente p2 = new Paciente("joão", 29, "covid");
        Paciente p3 = new Paciente("pedro", 40, "gripe");

        System.out.println(p1.nome + " " + p1.idade + " " + p1.diagnostico);
        System.out.println(p2.nome + " " + p2.idade + " " + p2.diagnostico);
        System.out.println(p3.nome + " " + p3.idade + " " + p3.diagnostico);
    }
}
