import Classes.Tarefa;

import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tarefa t = new Tarefa();
        System.out.println(t.getUuid());
        System.out.print("Informe o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.println("Informe a descrição da tarefa: ");
        t.setDescrição(in.nextLine());

        System.out.println(t.getUuid());
        System.out.println("A tarefa é: " + t.getNome());
        System.out.println(t.getDescrição());

    }
}