class Funcionario {

    String nome;
    double salarioBase;

    double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {

    double calcularSalario() {
        return salarioBase * 1.20;
    }
}

class Estagiario extends Funcionario {

    double calcularSalario() {
        return salarioBase * 0.90;
    }
}

public class Exercício8 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        gerente.nome = "Carlos";
        gerente.salarioBase = 5000;

        Estagiario estagiario = new Estagiario();

        estagiario.nome = "Lucas";
        estagiario.salarioBase = 2000;

        System.out.println("=== SISTEMA DE FUNCIONÁRIOS ===");

        System.out.println("Gerente: " + gerente.nome);
        System.out.printf("Salário final: R$ %.2f%n", gerente.calcularSalario());

        System.out.println();

        System.out.println("Estagiário: " + estagiario.nome);
        System.out.printf("Salário final: R$ %.2f%n", estagiario.calcularSalario());
    }
}