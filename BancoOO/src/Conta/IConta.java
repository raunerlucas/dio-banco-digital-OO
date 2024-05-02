package Conta;

public interface IConta {
	
	boolean sacar(Double valor);
	
	void depositar(Double valor);
	
	void transferir(Double valor, Conta contaDestino);

}
