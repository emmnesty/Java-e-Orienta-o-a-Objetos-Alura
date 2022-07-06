package bitBank;

public class Conta {
	int agencia;
	int conta;
	private double saldo;
	Cliente titular;

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

	public double mostrarSaldo() {
		return this.saldo;
	}
}
