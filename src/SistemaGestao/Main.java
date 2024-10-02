package SistemaGestao;

public class Main {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("Volvo", "FH", 2020, 100000);
        Carro carro = new Carro("Toyota", "Corolla", 2019, 50000);
        Moto moto = new Moto("Honda", "CB500", 2021, 10000);

        caminhao.acelerar();
        carro.acelerar();
        moto.acelerar();

        Frota frota = new Frota();
        frota.adicionarVeiculo(caminhao);
        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(moto);

        System.out.println("Realizando manutenção em todos os veículos:");
        frota.realizarManutencaoEmTodos();

        Viagem<Caminhao> viagemCaminhao = new Viagem<>(caminhao, "São Paulo", "Rio de Janeiro", 430);
        Viagem<Carro> viagemCarro = new Viagem<>(carro, "Belo Horizonte", "Brasília", 740);
        Viagem<Moto> viagemMoto = new Viagem<>(moto, "Salvador", "Recife", 800);

        System.out.println("\nIniciando viagens:");
        viagemCaminhao.iniciarViagem();
        viagemCarro.iniciarViagem();
        viagemMoto.iniciarViagem();

        Rastreador rastreador = new Rastreador();
        rastreador.adicionarVeiculo(caminhao);
        rastreador.adicionarVeiculo(carro);
        rastreador.adicionarVeiculo(moto);

        EventoDesempenho eventoCaminhao = new EventoDesempenho(caminhao, "Consumo de combustível: 30L/100km");
        EventoDesempenho eventoCarro = new EventoDesempenho(carro, "Consumo de combustível: 15L/100km");
        EventoDesempenho eventoMoto = new EventoDesempenho(moto, "Consumo de combustível: 5L/100km");

        System.out.println("\nRegistrando eventos de desempenho:");
        rastreador.registrarEvento(caminhao, eventoCaminhao);
        rastreador.registrarEvento(carro, eventoCarro);
        rastreador.registrarEvento(moto, eventoMoto);

        System.out.println("\nGerando relatórios de desempenho:");
        frota.gerarRelatorioDesempenho();
    }
}
