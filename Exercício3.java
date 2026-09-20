import java.util.Locale;
import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = scan.nextDouble();

        double salarioAnual = salarioMensal * 12;
        salarioAnual = Math.round(salarioAnual * 100) / 100.0;

        double imposto;

        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        imposto = Math.round(imposto * 100) / 100.0;
        double salarioLiquidoAnual = salarioAnual - imposto;

        System.out.println("Nome: " + nome);
        System.out.printf("Salário anual: R$ %.2f%n", salarioAnual);
        System.out.printf("Imposto anual: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido anual: R$ %.2f%n",
                salarioLiquidoAnual);
        System.out.printf("Salário líquido mensal: R$ %.2f%n",
                salarioLiquidoAnual / 12);

        scan.close();
    }
}