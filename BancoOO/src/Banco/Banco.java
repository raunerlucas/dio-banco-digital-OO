package Banco;

import Conta.*;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	protected int agencia = 1;
	private List<Conta> contas = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}
	public Banco(String nome, int agencia) {
		this.nome = nome;
		this.agencia = agencia;
	}
	public Banco(){}

	public void adicionarConta(Conta conta) {
		if (!contas.contains(conta))
			contas.add(conta);
		else
			System.out.println("Conta já cadastrada");
	}

	public void removerConta(Conta conta) {
		if (contas.contains(conta))
			contas.remove(conta);
		else
			System.out.println("Conta não cadastrada");
	}

	public void exibirContas() {
		contas.forEach(System.out::println);
	}

	public void SaldoTotalBanco(){
		double Saldo = contas.stream().mapToDouble(Conta::getSaldo).sum();
		System.out.println(STR."Saldo total do banco: \{Saldo}");
	}

	@Override
	public String toString() {
		return STR."Banco { Nome= \{nome}, Agencia= \{agencia} }";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}
