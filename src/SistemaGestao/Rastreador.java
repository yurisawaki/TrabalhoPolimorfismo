package SistemaGestao;

import java.util.HashMap;
import java.util.Map;


public class Rastreador {
    private Map<Veiculo, String> veiculosMonitorados;

    public Rastreador() {
        veiculosMonitorados = new HashMap<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosMonitorados.put(veiculo, "Rastreando");
    }

    public void monitorarEvento(Veiculo veiculo, EventoDesempenho evento) {
        System.out.println("Monitorando evento para " + veiculo.getClass().getSimpleName() + ": " + evento.getDescricao());
    }

    public void notificarMarco(Veiculo veiculo, String marco) {
        System.out.println("Veículo " + veiculo.getClass().getSimpleName() + " atingiu o marco: " + marco);
    }

    public void registrarEvento(Veiculo veiculo, EventoDesempenho evento) {
        monitorarEvento(veiculo, evento);
    }
}
