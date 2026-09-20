class ContaBancaria {

    String titular;
    private double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
}

public class Exercício9 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Carlos";

        System.out.println("Titular: " + conta.titular);

        conta.depositar(1000);
        conta.exibirSaldo();

        conta.sacar(300);
        conta.exibirSaldo();

        conta.sacar(800);
        conta.exibirSaldo();
    }
}