import java.util.Scanner;

public class maisexercicios {
    public static void main(String[] args) {
        //variaveis
        String frase;
        int contador = 0;
        Scanner EU = new Scanner(System.in);

        //Entrada
        System.out.println("digite uma frase: ");
        frase = EU.nextLine();

        //Processamento
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador = contador + 1;
            }
        }
        //Saida
        System.out.println("A quantidade de espaços na frase digitada é: " + contador);
    }
}
