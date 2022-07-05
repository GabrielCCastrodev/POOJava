package POOempresa2;

public class Funcionario {
	
	protected String nome;
	protected String sobrenome;
	
	public Funcionario(String nome, String sobrenome) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}