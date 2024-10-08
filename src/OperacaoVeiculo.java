

public interface OperacaoVeiculo {
    void realizarViagem(String origem, String destino, int distancia);
    void carregarCarga(int peso);
    void descarregarCarga(int peso);
}
