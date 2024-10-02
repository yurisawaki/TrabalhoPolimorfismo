package SistemaGestao;

public class Viagem<T extends OperacaoVeiculo> {
    private T veiculo;
    private String origem;
    private String destino;
    private int distancia;

    public Viagem(T veiculo, String origem, String destino, int distancia) {
        this.veiculo = veiculo;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public void iniciarViagem() {
        veiculo.realizarViagem(origem, destino, distancia);
        System.out.println("veiculo "+ veiculo.getClass().getSimpleName() + " iniciou a viagem");
    }
}
