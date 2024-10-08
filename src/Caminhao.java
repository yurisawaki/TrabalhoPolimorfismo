

public class Caminhao extends Veiculo implements OperacaoVeiculo {
    public Caminhao(String marca, String modelo, int ano, int quilometragem) {
        super(marca, modelo, ano, quilometragem);
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhão está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Caminhão está freando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção do caminhão realizada.");
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
    
    @Override
    public String toString() {
        return "Caminhão - " + super.toString();
    }

    
}
