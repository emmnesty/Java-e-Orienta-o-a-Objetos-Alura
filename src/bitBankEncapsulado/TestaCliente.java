package bitBankEncapsulado;

public class TestaCliente {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia(123);

		System.out.println("Minha agência: " + conta.getAgencia());

		conta.setConta(1001);

		System.out.println("Minha conta: " + conta.getConta());

	}

}
