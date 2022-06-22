package POOAlunos;

public class Curso {
	
	private String nomecurso;
	private String sigla;
	private Departamento departamento;
	
	public Curso() {}

	public Curso(String nomecurso, String sigla, Departamento departamento) {
		
		this.setNomecurso(nomecurso);
		this.setSigla(sigla);
		this.setDepartamento(departamento);
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNomecurso() {
		return nomecurso;
	}

	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	
    public String toString() {
    	
    	return "Curso: " +nomecurso+ "\nSigla do curso: " +sigla ; 

    }

}
