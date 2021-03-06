package Classes;

import java.util.UUID;

public class Tarefa {

    private String uuid;
    private String nome;
    private String descrição;
    private boolean completa;
    private int ordem;

    private ChecklistItem [] checklist;
    private int[] getChecklist;

    public ChecklistItem[] getLista() {
        return checklist;
    }

    public void setLista(ChecklistItem[] lista) {
        this.checklist = lista;
    }

    public Tarefa () {
        this.setUuid(UUID.randomUUID().toString());


    }
    public void completar() {
        this.setCompleta(true);
        for (ChecklistItem item : this.getChecklist()) {
            if (item != null);
            item.completar();
        }

    }
    public boolean temChecklist () {
        return this.getChecklist() != null;

    }
    public void criarChecklist(int tamanho) {
        this.setChecklist(new ChecklistItem[tamanho]);
    }

    public boolean adicionarChecklistItem(ChecklistItem item) {
        for (int i = 0; i < this.getChecklist().length; i++) {
            if (this.getChecklist()[i] == null) {
                this.getChecklist()[i] = item;
                return true;

            }
        }
        return false;

    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return this.descrição;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public boolean isCompleta() {
        return this.completa;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public ChecklistItem[] getChecklist() {
        return checklist;
    }

    public void setChecklist(ChecklistItem[] checklist) {
        checklist = checklist;
    }

    public int getOrdem() {
        return this.ordem;
    }
}
