

public class Moto extends Veiculo implements OperacaoVeiculo {
    public Moto(String marca, String modelo, int ano, int quilometragem) {
        super(marca, modelo, ano, quilometragem);
    }

    @Override
    public void acelerar() {
        System.out.println("Moto está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Moto está freando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção da moto realizada.");
    }

    @Override
    public void realizarViagem(String origem, String destino, int distancia) {

    }

    @Override
    public void carregarCarga(int peso) {

    }

    @Override
    public void descarregarCarga(int peso) {

    }
}
