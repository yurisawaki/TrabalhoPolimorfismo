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
        try {
            for (Veiculo veiculo : veiculos) {
                veiculo.realizarManutencao();
            }
        } catch (Exception e) {
            System.err.println("Erro ao realizar manutenção: " + e.getMessage());
        }
    }

    public void gerarRelatorioDesempenho() {
        try {
            for (Veiculo veiculo : veiculos) {
                System.out.println("Relatório de " + veiculo.getClass().getSimpleName() + ":");
                System.out.println("Marca: " + veiculo.marca);
                System.out.println("Modelo: " + veiculo.modelo);
                System.out.println("Ano: " + veiculo.ano);
                System.out.println("Quilometragem: " + veiculo.quilometragem);
                if (veiculo instanceof Caminhao) {
                    System.out.println("Consumo médio: 40L/100km");
                } else if (veiculo instanceof Carro) {
                    System.out.println("Consumo médio: 12L/100km");
                } else if (veiculo instanceof Moto) {
                    System.out.println("Consumo médio: 6L/100km");
                }
                System.out.println(); // Linha em branco para separar relatórios
            }
        } catch (Exception e) {
            System.err.println("Erro ao gerar relatório de desempenho: " + e.getMessage());
        }
    }
}
