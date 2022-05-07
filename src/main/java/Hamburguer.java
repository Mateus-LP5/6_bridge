public class Hamburguer extends Lanche {

    public Hamburguer (double valorBase) {
        this.valorbase = valorBase;
    }

    public double calcularValorPedido(){
        return this.valorbase + this.complemento.valorAdicional();
    }
}
