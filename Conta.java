public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;

    private static int SEQUENCIAL = 0;
    private static final int AGENCIA_PADRAO = 1;

    public Conta() {
         this.agencia = Conta.AGENCIA_PADRAO;
         this.numero = Conta.SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(Double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta destino, Double valor) {
        sacar(valor);
        destino.depositar(valor);
    }
}
