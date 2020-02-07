package Prototype;

public class Fiesta extends Carro {

    protected Fiesta(Fiesta fiestaPrototype) {
        this.valorCompra = fiestaPrototype.getValorCompra();
    }

    public Fiesta() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$"
                + getValorCompra();
    }

    @Override
    public Carro clonar() {
        return new Fiesta(this);
    }

}