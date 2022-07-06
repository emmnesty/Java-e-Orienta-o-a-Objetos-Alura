package bitBank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 100;

		Conta segundaConta = primeiraConta;

		System.out.println(segundaConta.saldo);

		segundaConta.saldo += 100;

		System.out.println(primeiraConta.saldo);

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
