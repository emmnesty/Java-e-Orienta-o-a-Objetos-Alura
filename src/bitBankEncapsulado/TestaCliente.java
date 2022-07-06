package bitBankEncapsulado;

public class TestaCliente {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 222222);
		Cliente cliente = new Cliente();

		//conta.setAgencia(123);

		System.out.println("Minha agência: " + conta.getAgencia());

		//conta.setConta(1001);

		System.out.println("Minha conta: " + conta.getConta());
		
		cliente.setNome("Jhonatan");
		conta.setTitular(cliente);

		System.out.println(conta.getTitular().getNome());
	}

}
