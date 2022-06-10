import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner GAME = new Scanner(System.in);

        System.out.println("informe a abreviação da classe Healer:");
        String clazz = GAME.next().toUpperCase();
        if (clazz.length() != 3) {
            System.out.println("Não é abreviação valida de alguma classe.");
        } else {

            switch (clazz) {
                case "PLD", "WAR", "DKN", "GNB":
                    System.out.println("Tank");
                    break;

                case "WHM", "SCH", "AST", "SAG":
                    System.out.println("Heder");
                    break;

                case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                    System.out.println("DPS");
                    break;

                default:
                    System.out.println("não é uma classe valida");
                    break;
            }
        }
    }
}



