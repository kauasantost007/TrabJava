import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu salário mensal: R$ ");
        double salario = scan.nextDouble();

        double imposto;

        if (salario <= 22847.76) {
            imposto = 0;
        } else if (salario <= 33919.80) {
            imposto = salario * 0.075;
        } else if (salario <= 45012.60) {
            imposto = salario * 0.15;
        } else {
            imposto = salario * 0.275;
        }

        double salarioLiquido = salario - imposto;

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Nome: " + nome);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scan.close();
    }
}