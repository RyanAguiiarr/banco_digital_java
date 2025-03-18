public interface IConta {

    public void sacar(Double valor);

    public void depositar(Double valor);

    public void transferir(Conta destino, Double valor);

    public void imprimir();
}
