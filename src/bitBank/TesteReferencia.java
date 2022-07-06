package bitBank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();

		Conta segundaConta = primeiraConta;

		System.out.println(segundaConta.mostrarSaldo());

		System.out.println(primeiraConta.mostrarSaldo());

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
