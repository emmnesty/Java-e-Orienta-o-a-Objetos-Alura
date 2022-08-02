package bitBank;

public class MeuCliente {
	public static void main(String[] args) {
		Cliente clienteJhonatan = new Cliente();
		Conta contaDoJhonatan = new Conta();
		
		
		clienteJhonatan.nome = "Jhonatan Maciel";
		clienteJhonatan.cpf = "222.222.222-22";
		clienteJhonatan.profissao = "Programador";
		
		contaDoJhonatan.titular = clienteJhonatan;
		
		System.out.println("Nome do titular: " + contaDoJhonatan.titular.nome);
		System.out.println("CPF do titular: " + contaDoJhonatan.titular.cpf);
		System.out.println("Nome da profissão: " + contaDoJhonatan.titular.profissao);
		System.out.println();
		
		// Outra forma de fazer:
		Cliente clienteAna = new Cliente();
		Conta contaDaAna = new Conta();
	
		
		contaDaAna.titular = new Cliente();
		
		clienteAna.nome = "Ana Silva";
		
		System.out.println("Nome do Titular: " + clienteAna.nome);
		System.out.println("Saldo: " + contaDaAna.mostrarSaldo());		
		
		
	}

}
