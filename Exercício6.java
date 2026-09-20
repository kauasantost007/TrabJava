class Veiculo {

    String placa;
    String modelo;
    int anoFabricacao;
    double quilometragem;

    void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println();
    }

    void registrarViagem(double km) {
        quilometragem = quilometragem + km;
    }
}

public class Exercício6 {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();

        veiculo1.placa = "ABC1D23";
        veiculo1.modelo = "Honda";
        veiculo1.anoFabricacao = 2020;
        veiculo1.quilometragem = 50000;

        Veiculo veiculo2 = new Veiculo();

        veiculo2.placa = "DEF4G56";
        veiculo2.modelo = "Toyota";
        veiculo2.anoFabricacao = 2022;
        veiculo2.quilometragem = 30000;

        veiculo1.registrarViagem(150);
        veiculo2.registrarViagem(250);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}