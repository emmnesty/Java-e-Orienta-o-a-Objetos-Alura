package bitBank;

public class MeuCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		conta.saldo = 1000;
		
		cliente.nome = "Jhonatan Maciel";
		cliente.cpf = "222.222.222-22";
		cliente.profissao = "Programador";
		
		conta.titular = cliente;
		
		System.out.println("Nome do titular: " + conta.titular.nome);
		System.out.println("CPF do titular: " + conta.titular.cpf);
		System.out.println("Nome da profissão: " + conta.titular.profissao);
		
		
	}

}
