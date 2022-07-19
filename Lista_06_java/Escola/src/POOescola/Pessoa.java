package POOescola;

public abstract class Pessoa{
	
	private String nome;
	private Endereco aux1endereco;
	
	public Pessoa(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return aux1endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.aux1endereco = endereco;
	}

	@Override
	public String toString() {
		
		return "\nNome: " + nome + "\nEndereco: " + aux1endereco;
	}
	
	

}