import java.util.Scanner;

class Aluno {

    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    void verificarAprovacao() {
        double media = calcularMedia();

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}

public class Exercício7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("=== GERENCIADOR DE ALUNOS ===");

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.print("Digite a matrícula: ");
        aluno.matricula = scan.nextLine();

        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = scan.nextDouble();

        System.out.print("Digite a terceira nota: ");
        aluno.nota3 = scan.nextDouble();

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.printf("Média: %.2f%n", aluno.calcularMedia());

        aluno.verificarAprovacao();

        scan.close();
    }
}