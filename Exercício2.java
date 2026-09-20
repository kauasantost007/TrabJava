import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        boolean senhaValida;

        do {
            System.out.print("Digite uma senha: ");
            String senha = scan.nextLine();

            boolean temMaiuscula = false;
            boolean temNumero = false;
            boolean temEspecial = false;

            for (int i = 0; i < senha.length(); i++) {
                char caractere = senha.charAt(i);

                if (Character.isUpperCase(caractere)) {
                    temMaiuscula = true;
                }

                if (Character.isDigit(caractere)) {
                    temNumero = true;
                }

                if (!Character.isLetterOrDigit(caractere)
                        && !Character.isWhitespace(caractere)) {
                    temEspecial = true;
                }
            }

            if (senha.length() < 8) {
                System.out.println("A senha deve ter pelo menos 8 caracteres.");
            }

            if (!temMaiuscula) {
                System.out.println("A senha deve conter uma letra maiúscula.");
            }

            if (!temNumero) {
                System.out.println("A senha deve conter um número.");
            }

            if (!temEspecial) {
                System.out.println("A senha deve conter um caractere especial.");
            }

            senhaValida = senha.length() >= 8
                    && temMaiuscula
                    && temNumero
                    && temEspecial;

        } while (!senhaValida);

        System.out.println(nome + ", sua senha é válida!");

        scan.close();
    }
}