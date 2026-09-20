import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("=== SIMULADOR DE EMPRÉSTIMO ===");

        System.out.print("Digite o nome do cliente: ");
        String nome = scan.nextLine();

        System.out.print("Digite o valor do empréstimo: ");
        double emprestimo = scan.nextDouble();

        System.out.print("Digite a quantidade de parcelas, de 6 a 48: ");
        int parcelas = scan.nextInt();

        if (parcelas >= 6 && parcelas <= 48) {

            double juros = emprestimo * 0.03 * parcelas;
            double valorTotal = emprestimo + juros;
            double valorParcela = valorTotal / parcelas;

            System.out.println("\n=== RESULTADO ===");
            System.out.println("Cliente: " + nome);
            System.out.printf("Valor total pago: R$ %.2f%n", valorTotal);
            System.out.printf("Valor da parcela mensal: R$ %.2f%n", valorParcela);

        } else {
            System.out.println("Quantidade de parcelas inválida.");
        }

        scan.close();
    }
}