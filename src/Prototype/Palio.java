package Prototype;

public class Palio extends Carro {

    private Palio(Palio palioPrototype) {
        this.valorCompra = palioPrototype.getValorCompra();
    }

    public Palio() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Palio\n" + "Montadora: Fiat\n" + "Valor: R$"
                + getValorCompra();
    }

    @Override
    public Carro clonar() {
        return new Palio(this);
    }

}
