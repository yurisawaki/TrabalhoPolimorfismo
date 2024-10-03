package SistemaGestao;

public class Main {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("Toyota", "Supra", 2000, 100000);
        Carro carro = new Carro("Ford", "Fusion", 2005, 50000);
        Moto moto = new Moto("Honda", "Hornet", 2012, 10000);

        System.out.println("Atributos dos veículos:");
        System.out.println(caminhao);


        Frota frota = new Frota();
        frota.adicionarVeiculo(caminhao);
        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(moto);

        System.out.println("Realizando manutenção em todos os veículos:");
        frota.realizarManutencaoEmTodos();

        Viagem<Caminhao> viagemCaminhao = new Viagem<>(caminhao, "Manaus", "Belém", 530);
        Viagem<Carro> viagemCarro = new Viagem<>(carro, "Curitiba", "Porto Alegre", 700);
        Viagem<Moto> viagemMoto = new Viagem<>(moto, "Florianópolis", "Blumenau", 150);

        System.out.println("\nIniciando viagens:");
        viagemCaminhao.iniciarViagem();
        viagemCarro.iniciarViagem();
        viagemMoto.iniciarViagem();


        Rastreador<Veiculo> rastreador = new Rastreador<>();
        rastreador.adicionarVeiculo(caminhao);
        rastreador.adicionarVeiculo(carro);
        rastreador.adicionarVeiculo(moto);

        EventoDesempenho<Veiculo> eventoCaminhao = new EventoDesempenho<>(caminhao, "Consumo de combustível: 40L/100km");
        EventoDesempenho<Veiculo> eventoCarro = new EventoDesempenho<>(carro, "Consumo de combustível: 12L/100km");
        EventoDesempenho<Veiculo> eventoMoto = new EventoDesempenho<>(moto, "Consumo de combustível: 6L/100km");

        System.out.println("\nRegistrando eventos de desempenho:");
        rastreador.registrarEvento(caminhao, eventoCaminhao);
        rastreador.registrarEvento(carro, eventoCarro);
        rastreador.registrarEvento(moto, eventoMoto);

        System.out.println("\nGerando relatórios de desempenho:");
        frota.gerarRelatorioDesempenho();
    }
}
