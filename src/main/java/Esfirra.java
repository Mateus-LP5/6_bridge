public class Esfirra extends Lanche {

    public Esfirra (double valorBase) {
        this.valorbase = valorBase;
    }

    public double calcularValorPedido(){
        return this.valorbase + this.complemento.valorAdicional();
    }
}
