package POOprova2;

public class DepositoIdentificado extends Deposito{
	
	private String CPF;

	public DepositoIdentificado(String descricao, double valor, String cPF) {
		super(descricao, valor);
		CPF = cPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}