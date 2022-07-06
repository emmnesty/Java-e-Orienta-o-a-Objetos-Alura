package bitBankHerdado;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Jhonatan");
		funcionario.setCpf("111.111.111-11");
		funcionario.setSalario(1354);
		
		System.out.println(funcionario.getBonificacao());
	}

}
