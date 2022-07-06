package bitBank;

public class TesteAtributo {

	public static void main(String[] args) {

		Conta contaDoJhonatan = new Conta();

		contaDoJhonatan.saldo = 100;
		contaDoJhonatan.depositar(50);
		
		System.out.println(contaDoJhonatan.saldo);

	}

}
