import classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - MiniPizza - Calabresa");
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
                ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
            }

        } else {
            System.out.print("Informe se Mini Pizza será com borda recheada: (S = Sim / N = Não): ");
            String bordaRecheada = in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            miniPizza.bordaRecheada = bordaRecheada.equalsIgnoreCase("S");
            if (bordaRecheada.equalsIgnoreCase("S")) {
                System.out.print("Digite o sabor da borda: ");
                miniPizza.bordaSabor = in.nextLine();
            }


        }
        System.out.print("Informe o valor do(a) " + lanche.tipo + ": R$ ");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}





