package POOEmpresa;

public class Empresa {
	
	private String cnpj;
	private String razao;
	private Endereco endereco;
	
	public Empresa() {}

	public Empresa(String cnpj, String razao, Endereco endereco) {
		
		this.setCnpj(cnpj);
		this.setRazao(razao);
		this.setEndereco(endereco);
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
    public String toString() {
    	
    	return "\nCNPJ: " +cnpj+ "\nRazão: " +razao ;

    }

}
