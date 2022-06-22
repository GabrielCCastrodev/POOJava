package POOAlunos;

public class Alunos {
	
	private String nomealuno;
	private int matricula;
	private int ano;	
	private Curso curso;
	
	public Alunos(){}
	
	public Alunos(String nomealuno, int matricula, int ano, Curso curso) {
		
		this.setNomealuno(nomealuno);
		this.setMatricula(matricula);
		this.setAno(ano);
		this.setCurso(curso);
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNomealuno() {
		return nomealuno;
	}

	public void setNomealuno(String nomealuno) {
		this.nomealuno = nomealuno;
	}
	
public String toString() {
    	
    	return "Aluno: " +nomealuno+ " \nMatrícula: " +matricula+ " \nAno: " +ano; 

    }

}
