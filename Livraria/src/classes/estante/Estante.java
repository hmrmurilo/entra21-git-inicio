package classes.estante;

import classes.Item;
import classes.avaliacao.Avaliacao;

import java.util.Locale;

public class Estante {
    private int capMaxima;
    private Item[] itens;

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);

        //TODO
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        int contador = 0;
        for (Item i : this.getItens()) {
            if (i != null) {
                contador++;
            }

        }
        return 0;
    }


    public Item buscarItem(String titulo) {
        for (Item i : getItens()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return i;
            }
        }
        return null;
    }

    public boolean adicionarItem(Item item) {
        for (int i = 0; i < this.getItens().length; i++) {
            if (this.getItens()[i] == null) {
                this.getItens()[i] = item;
                return true;

            }
        }
        return false;
    }

    public Item removerItem(int posicao) {
        Item i = this.getItens()[posicao];
        this.getItens()[posicao] = null;
        return i;
    }


    //Getters & Setters

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
