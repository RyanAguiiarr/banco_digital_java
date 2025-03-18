public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupaca = new ContaPoupança();

        contaCorrente.imprimir();
        contaPoupaca.imprimir();
    }
}
