package SistemaGestao;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void realizarManutencaoEmTodos() {
        for (Veiculo veiculo : veiculos) {
            veiculo.realizarManutencao();
        }
    }

    public void gerarRelatorioDesempenho() {
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Caminhao) {

            } else if (veiculo instanceof Carro) {

            } else if (veiculo instanceof Moto) {

            }
        }
    }
}
