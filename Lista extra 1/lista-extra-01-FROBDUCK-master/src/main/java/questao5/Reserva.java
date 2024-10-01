package questao5;

public class Reserva {
    private String nomeHospede;
    private String tipoQuarto;
    private int numeroNoites;

    public Reserva(String nomeHospede, String tipoQuarto, int numeroNoites) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroNoites = numeroNoites;
    }

    public void exibirInfo() {
System.out.println("Nome do Hóspede: " + this.nomeHospede + "Tipo de Quarto: " + this.tipoQuarto + "Número de Noites: " + this.numeroNoites  );
    }

}
