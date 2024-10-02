package SistemaGestao;

public class Carro extends Veiculo implements OperacaoVeiculo{
    public Carro(String marca, String modelo, int ano, int quilometragem) {
        super(marca, modelo, ano, quilometragem);
    }

    @Override
    public void acelerar() {
        System.out.println("Carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Carro está freando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção do carro realizada.");
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
