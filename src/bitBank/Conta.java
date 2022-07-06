package bitBank;

public class Conta {
	 int agencia;
	 int conta;
	 double saldo;
	 String nome;
	 
	 public void depositar (int valor) {
		 this.saldo = this.saldo + valor;
		 
	 }
}
