public class Filme {
    private String nome;
    private String genero;
    private int ano;
    private boolean ganhouOscar;

    public Filme(){}

    public Filme(String nome, String genero, int ano, boolean  ganhouOscar){
        this.nome=nome;
        this.genero=genero;
        this.ano=ano;
        this.ganhouOscar=ganhouOscar;
    }

    public void exibirFilme(){
        System.out.println(nome + " " + genero + " " + ano + " " + ganhouOscar);
    }
}
