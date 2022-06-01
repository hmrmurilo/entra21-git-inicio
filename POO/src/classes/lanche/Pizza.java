package classes.lanche;

public class Pizza extends MiniPizza {

    private String tamanho;

    public Pizza() {
        this.setTipo("Pizza");
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        System.out.println("Tamanho: " + this.getTamanho());

    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return this.tamanho;
    }
}

