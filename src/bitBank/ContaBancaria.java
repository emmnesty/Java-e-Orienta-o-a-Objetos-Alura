package bitBank;

public class ContaBancaria {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();

		Conta segundaConta = new Conta();

		System.out.println("Saldo da primeira conta: R$" + primeiraConta.mostrarSaldo());
		System.out.println("Saldo da segunda conta: R$" + segundaConta.mostrarSaldo());
	}

}
