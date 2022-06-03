package classes.lanche;

public class MiniPizza extends Lanche {

    private boolean bordaRecheada;
    private String bordaSabor;
    private String sabor;

    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Molho de tomate");
        this.adicionarIngrediente("Mussarela");
        this.setTipo("MiniPizza");
    }

    public void adicionarSaborEIngredientes(String sabor) {
        this.sabor = sabor;
        switch (sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;
            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
            case "FRANGO C/ CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Manjericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Ovo");
                break;

        }
    }


    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    //Se o tipo for boolean, não utiliza get, utiliza is
    public boolean isBordaRecheada() {
        return this.bordaRecheada;
    }

    public void setBordaSabor(String bordaSabor) {
        this.bordaSabor = bordaSabor;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}


