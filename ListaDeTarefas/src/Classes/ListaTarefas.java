package Classes;

public class ListaTarefas {

    private int tamanhoLista;
    private String nomeLista;

    private Tarefa[] tarefas;



    public ListaTarefas(int tamanhoLista) {
       this.setTamanhoLista(tamanhoLista);
        this.setTarefas(new Tarefa[tamanhoLista]);

    }

    public boolean adiconarTarefa(Tarefa tarefa) {
        if (tarefa.getOrdem() < 0 ||
                tarefa.getOrdem() >= this.getTamanhoLista()) {
            return false;
        }
        for (int i = 0; i < this.getTamanhoLista(); i++) {
            if (this.tarefas[i] == null) {
                this.tarefas[i] = tarefa;
                return true;
            } else if (this.tarefas[i].getOrdem() == tarefa.getOrdem()) {
                break;

            }
        }
        return false;

    }

    public Tarefa buscarTarefa(int posição) {
        for (Tarefa t : this.getTarefas()) {
            if (t != null && t.getOrdem() == posição) {
                return t;

            }
        }
        return null;

    }

    public boolean alterarOrdemTarefa(int antigaOrdem, int novaOrdem) {
        Tarefa tarefaAntiga = buscarTarefa(antigaOrdem);
        Tarefa novaTarefa = buscarTarefa(novaOrdem);

        if (buscarTarefa((antigaOrdem)) == null || buscarTarefa(novaOrdem) == null) {
            return false;
        }

        tarefaAntiga.setOrdem(novaOrdem);
        novaTarefa.setOrdem(antigaOrdem);
        return true;
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
    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}

