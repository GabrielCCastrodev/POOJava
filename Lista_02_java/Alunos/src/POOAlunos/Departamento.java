package POOAlunos;

public class Departamento {
	
	private String nomedepartamento;
	private String sigla;
	
	public Departamento(){}

	public Departamento(String nomedepartamento, String sigla) {
		
		this.setNomedepartamento(nomedepartamento);
		this.setSigla(sigla);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNomedepartamento() {
		return nomedepartamento;
	}

	public void setNomedepartamento(String nomedepartamento) {
		this.nomedepartamento = nomedepartamento;
	}
	
    public String toString() {
    	
    	return "Nome: " +nomedepartamento+ " \nSigla: " +sigla ; 

    }

}