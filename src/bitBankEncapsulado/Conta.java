package bitBankEncapsulado;

public class Conta {
	private int agencia;
	private int conta;
	private double saldo;
	private Cliente titular;

	public void depositar(double valor) {
		this.saldo += valor;

	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int novaAgencia) {
		this.agencia = novaAgencia;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setConta(int novaConta) {
		this.conta = novaConta;
	}

	public int getConta() {
		return this.conta;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

}
