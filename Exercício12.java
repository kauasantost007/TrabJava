import java.util.Scanner;

public class Exercício12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] mensagens = new String[10];

        System.out.println("=== SISTEMA DE CHAT ===");

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scan.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scan.nextLine();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {

                System.out.print(usuario1 + ", digite sua mensagem: ");
                String mensagem = scan.nextLine();

                mensagens[i] = usuario1 + ": " + mensagem;

            } else {

                System.out.print(usuario2 + ", digite sua mensagem: ");
                String mensagem = scan.nextLine();

                mensagens[i] = usuario2 + ": " + mensagem;
            }
        }

        System.out.println("\n===== Histórico de Mensagens =====");

        for (int i = 0; i < 10; i++) {
            System.out.println(mensagens[i]);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

        scan.close();
    }
}