package Classes;

import java.util.UUID;

public class Tarefa {

    private String uuid;
    private String nome;
    private String descrição;
    private boolean completa;
    private int ordem;

    public Tarefa () {
        this.setUuid(UUID.randomUUID().toString());


    }
    public void completar() {
        this.setCompleta(true);


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

    public int getOrdem() {
        return this.ordem;
    }
}
