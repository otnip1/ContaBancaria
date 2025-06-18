public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void mostrarDados() {
        // System.out.println("Saldo: R$ " + saldo); // ERRO: saldo é private
        System.out.println("Titular: " + titular);  // OK: titular é protected
    }
}
