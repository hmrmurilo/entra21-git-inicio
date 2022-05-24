public class exercicios1705 {
}
import java.util.Scanner;

public class exString {
    public exString() {
    }



    public static void main(String[]args){

        exe02();
        exe03();
        exe04();
        exe05();
        exe06();
        exe07();
        exe08();
        exe09();
        exe10();

    }

    public static void exe02(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa:  ");
        String alguma_coisa = in.nextLine();
        System.out.println("Digite alguma coisa(de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (alguma_coisa.equals(algumaOutraCoisa)){
            System.out.println("São iguais");
        } //.equalsIgnoreCase exemplo:              ABCD = abcd --> true
        //.equals exemplo:                     ABCD = abcd ---> false
        else if (alguma_coisa.equalsIgnoreCase(algumaOutraCoisa)) {
            System.out.println("São iguais indenpendente de case");
        }else{
            System.out.println("São diferentes");
        }
    }

    public static void exe03(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa:  ");
        String alguma_coisa = in.nextLine();
        System.out.println("Digite alguma coisa(de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (alguma_coisa.contains(algumaOutraCoisa)) {
            System.out.println(alguma_coisa + "faz parte de " + algumaOutraCoisa);
        }
        //.contains  exemplo :             abcd = cd ---> true na palavra toda


    }
    public static void exe04(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa:  ");
        String alguma_coisa = in.nextLine();
        System.out.println("Digite alguma coisa(de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (alguma_coisa.startsWith(algumaOutraCoisa)){
            System.out.println(alguma_coisa + "é prefixo de" + alguma_coisa);
        } else if (algumaOutraCoisa.startsWith(alguma_coisa)) {
            System.out.println(alguma_coisa + "é prefixo de " + algumaOutraCoisa);
        }else {
            System.out.println("as string não são prefixo uma da outra");
        }
//.contains só se for no começo da palavra = true            exemplo: abcd  = ab ---> true // abcd = cd -----> false
    }
    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa:  ");
        String alguma_coisa = in.nextLine();
        System.out.println("Digite alguma coisa(de novo): ");
        String algumaOutraCoisa = in.nextLine();
        //.endWhth verefica o sufixo da String                  Exemplo:    abdc = dc ----> true // abcd = ab ----> false
        if (alguma_coisa.endsWith(algumaOutraCoisa)){
            System.out.println(algumaOutraCoisa + " é sufixo de " + alguma_coisa);
        } else if (algumaOutraCoisa.endsWith(alguma_coisa)) {
            System.out.println(alguma_coisa + " é sufixo de " + algumaOutraCoisa);
        }else{
            System.out.println("As string não sao sufixo uma da outra!!");
        }

    }
    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa:  ");
        String alguma_coisa = in.nextLine();
        System.out.println("Digite alguma coisa(de novo): ");
        String algumaOutraCoisa = in.nextLine();
        int pos = alguma_coisa.indexOf(algumaOutraCoisa);
        //verifica em qual posição está a letra               Exemplo:    h e  ha  ha he ho = ha ----> pos = 2
        //  .indexOf                                                      0 1  2
        System.out.println("A posição de " + algumaOutraCoisa + " em " + alguma_coisa + " é " + pos );


    }
    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa:  ");
        String alguma_coisa = "lala#lwve#-rwgra22lalang!#<3";
        String algumaOutraCoisa = alguma_coisa.replace("w","o");
        algumaOutraCoisa = algumaOutraCoisa.replace("#", " ");
        algumaOutraCoisa = algumaOutraCoisa.replace("2", "m");
        algumaOutraCoisa = algumaOutraCoisa.replace("lala", "i");
        algumaOutraCoisa = algumaOutraCoisa.replace("-" , "p");
        System.out.println(algumaOutraCoisa);
        //ele subistitui uma caracter letra por outra especifica  descrita no código
    }
    public static void exe08() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de número: ");
        int nums = in.nextInt();
        int[] numeros = new int[nums];
        for (int i = 0; i < nums; i++){
            System.out.println("informe o número");
            numeros[i] = in.nextInt();}
        int soma = 0, somaImpar = 0;
        for(int valor : numeros){
            if (valor % 2 == 0){
                soma += valor;
            }else{
                somaImpar += valor;
            }

        }
        //Código pra atribuir um valor a array
        System.out.println("Soma dos valores pares: "+soma);
        System.out.println("soma dos valores impares: "+somaImpar);

    }
    public static void exe09(){
        //codigo para adicionar e remover string das arrays
        Scanner in = new Scanner(System.in);
        System.out.println("Infome a quantidade de palavras: ");
        int nums = in.nextInt();

        String[] palavras = new String[nums];
        in.nextLine();
        for(int i = 0 ; i < nums; i++){
            System.out.println("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.println("informe um valor > 0: ");
        int numeroCorte = in.nextInt();
        for (int i = 0; i < nums; i++){
            if (palavras[i].length() < numeroCorte){
                palavras[i] = null;
            }

        }
        for (String palavra : palavras){
            if (palavra != null){
                System.out.println(palavra);
            }
        }
    }