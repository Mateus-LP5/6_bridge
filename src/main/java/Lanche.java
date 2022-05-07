public abstract class Lanche {

    protected Complemento complemento;
    protected double valorbase;

    public Lanche setComplemento(Complemento complemento) {
        this.complemento = complemento;
        return this;
    }

    public Lanche setValorbase(double valorbase) {
        this.valorbase = valorbase;
        return this;
    }

    public abstract double calcularValorPedido();
}
