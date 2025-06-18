public class ContaBancaria {
    private double saldo;
    protected String titular;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void consultarSaldo() {
        System.out.println("Saldo de " + titular + ": R$ " + saldo);
    }
}
