

import java.util.HashMap;
import java.util.Map;


public class Rastreador<T extends Veiculo> {
    private Map<T, String> veiculosMonitorados;

    public Rastreador() {
        veiculosMonitorados = new HashMap<>();
    }

    public void adicionarVeiculo(T veiculo) {
        veiculosMonitorados.put(veiculo, "Rastreando");
    }

    public void monitorarEvento(T veiculo, EventoDesempenho<? extends Veiculo> evento) {
        System.out.println("Monitorando evento para " + veiculo.getClass().getSimpleName() + ": " + evento.getDescricao());
    }

    public void notificarMarco(T veiculo, String marco) {
        System.out.println("Veículo " + veiculo.getClass().getSimpleName() + " atingiu o marco: " + marco);
    }

    public void registrarEvento(T veiculo, EventoDesempenho<? extends Veiculo> evento) {
        monitorarEvento(veiculo, evento);
    }
}


