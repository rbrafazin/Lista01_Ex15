import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quanto você ganhar por hora: R$");
        double s = sc.nextDouble();
        System.out.print("Digite quantas horas você trabalha por mês: ");
        double h = sc.nextDouble();
        double sb = s * h;
        double ir = 0.11 * sb;
        double inss = 0.08 * sb;
        double sind = 0.05 * sb;
        double sl = sb - (ir + inss + sind);

        System.out.printf("Seu salário bruto é: R$%.2f\n", sb);
        System.out.printf("IR 11%%: R$%.2f\n", ir);
        System.out.printf("INSS 8%%: R$%.2f\n", inss);
        System.out.printf("Sindicato 5%%: R$%.2f\n", sind);
        System.out.printf("Seu salário líquido é: R$%.2f", sl);

        sc.close();

    }

}
