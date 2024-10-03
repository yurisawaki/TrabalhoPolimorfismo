package SistemaGestao;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int quilometragem;

    public Veiculo(String marca, String modelo, int ano, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void acelerar() {
        System.out.println("Veículo está acelerando.");
    }

    public void frear() {
        System.out.println("Veículo está freando.");
    }

    public void realizarManutencao() {
        System.out.println("Manutenção genérica realizada.");
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Quilometragem: " + quilometragem;
    }

}


