package POOescola;

public class Aluno extends Pessoa{
	
	private int matriculaaluno;
	private int ano;
	private Curso aux1curso;
	
	public Aluno(String nome, int matriculaaluno, int ano, Curso aux1curso) {
		
		super(nome);
		this.matriculaaluno = matriculaaluno;
		this.ano = ano;
		this.aux1curso = aux1curso;
	}

	public int getMatriculaaluno() {
		return matriculaaluno;
	}

	public void setMatriculaaluno(int matriculaaluno) {
		this.matriculaaluno = matriculaaluno;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Curso getAux1curso() {
		return aux1curso;
	}

	public void setAux1curso(Curso aux1curso) {
		this.aux1curso = aux1curso;
	}
	
}