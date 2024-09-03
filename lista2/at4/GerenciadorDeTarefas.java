package lista2.at3;

public class GerenciadorDeTarefas{
    String desc;
    Boolean concluida;
    int prioridade;

    GerenciadorDeTarefas(String desc, Boolean concluida, int prioridade){
        this.desc=desc;
        this.concluida=concluida;
        this.prioridade=prioridade;
    }

    void concluirTarefa(){
        this.concluida=true;
        System.out.println("tarefa concluida!");
    }
    void mudarPrioridade(int novaPrioridade){
        this.prioridade= novaPrioridade;
        System.out.println("a prioridade foi alterada para: " + novaPrioridade);
    }

    void exibirTarefa(){
        System.out.println(desc, concluida, prioridade);
    }

    void resetarTarefa(){
        if (this.concluida = true){
            this.concluida=false;
            System.out.println("tarefa resetada");
        }else{
            System.out.println("não foi possivel resetar a tarefa pois ela não foi concluida");
        }
    }

}