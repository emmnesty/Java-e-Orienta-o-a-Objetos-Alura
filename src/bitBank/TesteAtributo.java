package bitBank;

public class TesteAtributo {

	public static void main(String[] args) {

		Conta contaDoJhonatan = new Conta();
		Conta contaDaAna = new Conta();

		contaDoJhonatan.saldo = 100;
		contaDoJhonatan.depositar(1000);

		//contaDoJhonatan.sacar(30);

		System.out.println("Conta da Jhonatan: " + contaDoJhonatan.saldo);
		
		//contaDaAna.depositar(2000);
		System.out.println("Conta da Ana: " + contaDaAna.saldo);
		
		
		boolean transferencia = contaDoJhonatan.transferir(200, contaDaAna);
		
		if (transferencia) {
			System.out.println("Valor transferido com sucesso!");
		} else {
			System.out.println("Não há saldo suficiente!");
		}
		
		System.out.println("Conta da Ana: " + contaDaAna.saldo);
		

	}

}
