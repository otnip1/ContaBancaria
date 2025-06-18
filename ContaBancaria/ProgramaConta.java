public class ProgramaConta {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("João");
        cp.depositar(1500.0);
        cp.consultarSaldo();
        cp.mostrarDados();
    }
}
