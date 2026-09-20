import java.util.Random;
import java.util.Scanner;

public class Exercício11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] sorteados = new int[6];
        int[] numerosUsuario = new int[6];
        int acertos = 0;

        for (int i = 0; i < 6; i++) {
            sorteados[i] = random.nextInt(60) + 1;
        }

        System.out.println("=== SIMULAÇÃO DE LOTERIA ===");

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numerosUsuario[i] = scan.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numerosUsuario[i] == sorteados[j]) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("\n=== NÚMEROS SORTEADOS ===");

        for (int i = 0; i < 6; i++) {
            System.out.print(sorteados[i] + " ");
        }

        System.out.println("\n\nVocê teve " + acertos + " acerto(s).");

        scan.close();
    }
}