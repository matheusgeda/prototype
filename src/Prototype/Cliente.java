package Prototype;

public class Cliente {
    public static void main(String[] args) {
        Palio prototipoPalio = new Palio();

        Carro palioNovo = prototipoPalio.clonar();
        palioNovo.setValorCompra(27900.0);
        Carro palioUsado = prototipoPalio.clonar();
        palioUsado.setValorCompra(21000.0);

        System.out.println(palioNovo.exibirInfo());
        System.out.println(palioUsado.exibirInfo());
    }
}

