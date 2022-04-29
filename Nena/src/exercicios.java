import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {
        exe05();
    }

    public static void exe01() {
        int var1 = 10;
        int var2 = 20;
        int var3 = 0;

        var3 = var1;
        var1 = var2;
        var2 = var3;
        System.out.println(var1);
        System.out.println(var2);

    }


    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.println("digite um valor");
        int valor = in.nextInt();
        System.out.println(--valor);
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.println("informe a base: ");
        double base = in.nextDouble();
        System.out.println("informe a altura: ");
        double altura = in.nextDouble();
        double area = base * altura;
        double per = base * 2 + altura * 2;
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f", per);
    }


    public static void exe04() {

        int DiasNoAno = 365;
        int DiasNoMes = 30;
        int dias;
        int meses;
        int anos;

        Scanner leitor = new Scanner(System.in);

        System.out.println("informe sua idade em anos, meses e dias a seguir");
        System.out.print("Anos: ");
        anos = leitor.nextInt();

        System.out.print("Meses: ");
        meses = leitor.nextInt();

        System.out.print("Dias: ");
        dias = leitor.nextInt();

        dias += anos * DiasNoAno + meses * DiasNoMes;

        System.out.println("você já viveu " + dias + " dias aproximadamente");
    }

    public static void exe05() {
        //variaveis
        double totaleleitores;
        double brancosenulos;
        double votosvalidos;
        double porcentagembrancosenulos;
        double porcentagemvotosvalidos;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o numero total de eleitores: ");
        totaleleitores = scan.nextInt();
        System.out.print("Digite o total de votos brancos e nulos: ");
        brancosenulos = scan.nextInt();

        //Processamento
        votosvalidos = totaleleitores - brancosenulos;
        porcentagembrancosenulos = ((brancosenulos * 100) / totaleleitores);
        porcentagemvotosvalidos = ((votosvalidos * 100) / totaleleitores);

        //Saida
        System.out.println("O total de votos válidos é de: " + votosvalidos);
        System.out.println("O percentual de votos válidos é: " + porcentagemvotosvalidos + "%");
        System.out.print("O percentual de votos brancos e nulos é: " + porcentagembrancosenulos + "%");
    }

}




