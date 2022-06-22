package POOClientes;

public class Cliente {
	
	private String nomecliente;
	private String cpf;
	private Endereco endereco;
	
	Cliente() {}

	public Cliente(String nomecliente, String cpf, Endereco endereco) {
		super();
		this.nomecliente = nomecliente;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
    public String toString() {
    	
    	return "Cliente: " +nomecliente+ "\nCPF: " +cpf;  

    }

}