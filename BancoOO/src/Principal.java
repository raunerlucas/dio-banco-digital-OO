import Banco.Banco;
import Cliente.Cliente;
import Conta.*;


public class Principal {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco do Brasil");

		Conta cc = new ContaCorrente(new Cliente("Ferdinanda"), banco);
		Conta poupanca = new ContaPoupanca(new Cliente("Frederico"),banco);

		cc.depositar(500.0);
		cc.sacar(100.0);
		cc.transferir(100.0, poupanca);

		banco.exibirContas();
		banco.SaldoTotalBanco();

	}

}
