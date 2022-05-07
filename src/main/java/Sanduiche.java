public class Sanduiche extends Lanche {

    public Sanduiche (double valorBase) {
        this.valorbase = valorBase;
    }

    public double calcularValorPedido(){
        return this.valorbase + this.complemento.valorAdicional();
    }

}
