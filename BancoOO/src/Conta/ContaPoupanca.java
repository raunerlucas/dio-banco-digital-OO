package Conta;

import Cliente.Cliente;
import Banco.Banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	public String toString() {
		return STR."""
=== Extrato Conta Poupança ===
\{super.toString()}
""";
	}
}
