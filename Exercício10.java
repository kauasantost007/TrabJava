import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercício10 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        FileWriter arquivo = new FileWriter("compras.txt");

        System.out.println("=== REGISTRO DE COMPRAS ===");

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nCompra " + i);

            System.out.print("Produto: ");
            String produto = scan.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = scan.nextInt();

            System.out.print("Preço unitário: R$ ");
            double preco = scan.nextDouble();
            scan.nextLine();

            arquivo.write("Produto: " + produto + "\n");
            arquivo.write("Quantidade: " + quantidade + "\n");
            arquivo.write("Preço unitário: R$ " + preco + "\n");
            arquivo.write("\n");
        }

        arquivo.close();

        System.out.println("\n=== COMPRAS REGISTRADAS ===");

        File compras = new File("compras.txt");
        Scanner leitor = new Scanner(compras);

        while (leitor.hasNextLine()) {
            System.out.println(leitor.nextLine());
        }

        leitor.close();
        scan.close();
    }
}