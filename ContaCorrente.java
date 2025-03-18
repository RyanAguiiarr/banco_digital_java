public class ContaCorrente extends Conta{


    @Override
    public void imprimir() {
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
