import java.util.ArrayList;

public class Jogo {

    private ArrayList<Carta> handplayer = new ArrayList<>();

    private ArrayList<Carta> handCPU = new ArrayList<>();

    private Baralho deck;

    private int playerWins;

    public void firstRound() {

    }
    public void handPlayerOption() {

    }

    public void playerWin() {

    }
    private void oneMore() {

    }

    private void stop() {

    }

    private void doubleCard() {

    }

    public ArrayList<Carta> getHandplayer() {
        return handplayer;
    }

    public void setHandplayer(ArrayList<Carta> handplayer) {
        this.handplayer = handplayer;
    }

    public ArrayList<Carta> getHandCPU() {
        return handCPU;
    }

    public void setHandCPU(ArrayList<Carta> handCPU) {
        this.handCPU = handCPU;
    }

    public Baralho getDeck() {
        return deck;
    }

    public void setDeck(Baralho deck) {
        this.deck = deck;
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }
}

