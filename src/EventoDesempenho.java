

public class EventoDesempenho<T extends Veiculo> {
    private T veiculo;
    private String descricao;

    public EventoDesempenho(T veiculo, String descricao) {
        this.veiculo = veiculo;
        this.descricao = descricao;
    }

    public T getVeiculo() {
        return veiculo;

    }

    public String getDescricao() {
        return descricao;
    }
}


