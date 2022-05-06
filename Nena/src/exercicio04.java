import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //Variaveis
        Scanner scan = new Scanner(System.in);
        int valor;
        int i;

        //Entrada
        do {
            System.out.println("Digite qual tabuada deseja saber");
            valor = scan.nextInt();
            if (valor != 0) {

                //Processamento
                for (i = 0; i <= 10; i++) {
                    System.out.println(i * valor);
                }
            }
        } while (valor != 0);
    }
}


