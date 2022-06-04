package Classes;

public class ListaTarefas {

    private int tamanhoLista;
    private String nomeLista;

    public ListaTarefas(int tamanhoLista) {

    }
    public boolean adiconarTarefa(Tarefa tarefa) {
        return false;
    }

    public Tarefa buscarTarefa(int posição) {
        return null;

    }

    public boolean alterarOrdemTarefa(Tarefa tarefa, int novaPosi) {
        return false;
    }

    public int ListaTarefas(int tamanhoLista) {

    }
// GETTER E SETTER

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }
}

