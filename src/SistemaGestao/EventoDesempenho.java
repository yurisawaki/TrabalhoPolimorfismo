package SistemaGestao;

public class EventoDesempenho {
    private Veiculo veiculo;
    private String descricao;

    public EventoDesempenho(Veiculo veiculo, String descricao) {
        this.veiculo = veiculo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

