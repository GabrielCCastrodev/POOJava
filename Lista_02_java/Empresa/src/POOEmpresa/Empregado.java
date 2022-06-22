package POOEmpresa;

public class Empregado {
	
	private String nomeempregado;
	private int matricula;
	private Empresa empresa;
	
	public Empregado () {}

	public Empregado(String nomeempregado, int matricula, Empresa empresa) {
		
		this.setNomeempregado(nomeempregado);
		this.setMatricula(matricula);
		this.setEmpresa(empresa);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNomeempregado() {
		return nomeempregado;
	}

	public void setNomeempregado(String nomeempregado) {
		this.nomeempregado = nomeempregado;
	}
	
    public String toString() {
    	
    	return "Nome: " +nomeempregado+ "\nMatrícula: " +matricula ;

    }
	
}