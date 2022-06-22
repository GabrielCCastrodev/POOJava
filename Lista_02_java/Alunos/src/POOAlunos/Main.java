package POOAlunos;

public class Main {
	
	public static void main(String[] args) {
		
		Departamento auxdepartamento = new Departamento("Instituto de Informática", "INF");
		Curso auxcurso = new Curso("Engenharia de Software", "ES", auxdepartamento);
		Alunos auxaluno = new Alunos("Fulano de tal", 102, 2020, auxcurso);
		
		System.out.println(auxaluno);
		System.out.println(auxcurso);
		System.out.println(auxdepartamento);
		
	}

}
