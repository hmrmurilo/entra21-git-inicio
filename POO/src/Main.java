import classes.lanche.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        monstarLanche();


    }
    private static void monstarLanche() {
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - MiniPizza");
        System.out.println("(6) - Pizza");
        System.out.println();
        System.out.print("informe a opção desejada: ");
        int escolha = in.nextInt();
        in.nextLine();
        Lanche lanche = null;

        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;

            case 2:
                lanche = new XBurguer();
                break;

            case 3:
                lanche = new MistoQuente();
                break;

            case 4:
                lanche = new HotDog();
                break;

            case 5:
                lanche = new MiniPizza();
                break;
            case 6:
                lanche = new Pizza();
                break;

            default:
                System.err.println("Escolha uma opção válida!");
        }


        if (lanche instanceof Sanduiche) {
            //Adicionais
            System.out.print("Deseja adicionais? (S/N) ");
            String adicionais = in.nextLine();
            if (adicionais.equalsIgnoreCase("S")) {
                //adicionar os adicionais
                for (int i = 0; i < 10; i++) {
                    //pedir o add
                    System.out.print("Informe o adicional: ");
                    ((Sanduiche) lanche).adiciconarAdicional(in.nextLine());
                    System.out.print("Deseja adicionar mais adicionais? (S/N): ");
                    String parada = in.nextLine();
                    if (parada.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }
            if (lanche instanceof XBurguer) {
                System.out.print("Informe se o lanche será aberto (S = Sim / N = Não): ");
                String aberto = in.nextLine();
                ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));
            }

        } else {
            System.out.println("Escolha o sabor da pizza: ");
            System.out.println("(1) - 4 Queijos");
            System.out.println("(2) - Calabresa");
            System.out.println("(3) - Frango c/ Catupiry");
            System.out.println("(4) - Marguerita");
            System.out.println("(5) - Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor) {
                case 1:
                    miniPizza.adicionarSaborEIngredientes("4 queijos");
                    break;
                case 2:
                    miniPizza.adicionarSaborEIngredientes("calabresa");
                    break;
                case 3:
                    miniPizza.adicionarSaborEIngredientes("frango c/ catupiry");
                    break;
                case 4:
                    miniPizza.adicionarSaborEIngredientes("marguerita");
                    break;
                case 5:
                    miniPizza.adicionarSaborEIngredientes("portuguesa");
                    break;
                default:
                    System.err.println("Escolha um sabor valido");


            }

            if (lanche instanceof Pizza) {
                System.out.println("Informe o tamanho da pizza: ");
                System.out.println("XS - broto");
                System.out.println("SM - pequena");
                System.out.println("MO - média");
                System.out.println("LG - grande");
                System.out.println("XL - familia");
                ((Pizza) lanche). setTamanho(in.nextLine().toUpperCase());
            }

            System.out.print("Informe se Mini Pizza será com borda recheada: (S = Sim / N = Não): ");
            String bordaRecheada = in.nextLine();
            miniPizza.setBordaRecheada(bordaRecheada.equalsIgnoreCase("S"));
            if (miniPizza.isBordaRecheada()) {
                System.out.print("Digite o sabor da borda: ");
                miniPizza.setBordaSabor(in.nextLine());
            }


        }
        System.out.print("Informe o valor do(a) " + lanche.getTipo() + ": R$ ");
        lanche.setValor(in.nextDouble());
        lanche.montarComanda();
    }
}





