import java.util.ArrayList;

public class FilmeRepositorio{
    private ArrayList<Filme> filmes;

    public FilmeRepositorio(){
        filmes = new ArrayList<>();
    }

    public void inserirFilme(Filme f){
        filmes.add(f);
    }

    public void listarFilmes(){
        for(int i=0; i<filmes.size();i++){
            System.out.println(filmes.get(i));
        }
    }

}