package classes;

public class MiniPizza extends Lanche {

    public boolean bordaRecheada;
    public String bordaSabor;

    public MiniPizza() {
        this.adicionarIngrediente("Mussarela");
        this.adicionarIngrediente("Calabresa");

        this.tipo = "MiniPizza";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordaRecheada) {
            System.out.println("-- Com borda recheada --" + this.bordaSabor);
        }
    }
}

