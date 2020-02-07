package Prototype;

public class Gol extends Carro {

    protected Gol(Gol golPrototype) {
        this.valorCompra = golPrototype.getValorCompra();
    }

    public Gol() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Gol\nMontadora: Wolkswagen\n" + "Valor: R$"
                + getValorCompra();
    }

    @Override
    public Carro clonar() {
        return new Gol(this);
    }

}
