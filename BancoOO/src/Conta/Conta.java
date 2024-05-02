package Conta;

import Banco.Banco;
import Cliente.Cliente;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;

    protected final Banco banco;
    protected int numero;
    protected Double saldo = 0.0;
    protected Cliente cliente;

    public Conta(Cliente cliente, Banco banco) {
        this.banco = banco;
        banco.adicionarConta(this);
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public boolean sacar(Double valor) {
        System.out.println(STR."Sacando \{valor}");
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
        saldoAtual();
        return true;
    }

    @Override
    public void depositar(Double valor) {
        System.out.println(STR."=== Numero Conta: \{numero}===");
        System.out.println(STR."Depositando \{valor}");
        saldo += valor;
        saldoAtual();
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        System.out.println(STR."=== Numero Conta: \{numero}===");
        System.out.println(STR."=== Transferencia === \nR$\{valor} para a conta de \{contaDestino.cliente.getNome()}");
        if (this.sacar(valor))
            contaDestino.depositar(valor);
        else
            System.out.println("Transferencia não realizada");

    }

    private void saldoAtual() {
        System.out.println(STR."Saldo atual: \{saldo}\n");
    }


    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return STR."""
                \{banco},
               | Numero da Conta= \{numero}  |
               | Saldo= \{saldo}R$ |
                \{cliente}
            """;
    }
}
