package POOescola;

public class Professor extends Pessoa{
	
	private int matriculaprof;
	private String formacao;
	
	public Professor(String nome, Endereco endereco, int matriculaprof, String formacao) {
		
		super(nome);
		this.matriculaprof = matriculaprof;
		this.formacao = formacao;
	}

	public int getMatriculaprof() {
		return matriculaprof;
	}

	public void setMatriculaprof(int matriculaprof) {
		this.matriculaprof = matriculaprof;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	@Override
	public String toString() {
		
		return "\nProfessor: " + matriculaprof + "\nFormacao: " + formacao;
	}
	
	

}