package classes;

public class HotDog extends Sanduiche {

    public HotDog() {
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Pure de batata");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Cheddar");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Ervilha");
        this.tipo = "HotDog";
    }
}
