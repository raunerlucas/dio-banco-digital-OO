package Conta;

import Cliente.Cliente;
import Banco.Banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }


    @Override
    public String toString() {
        return STR."""
=== Extrato Conta Corrente ===
\{super.toString()}
""";
    }
}
