package POOescola;

public class Principal {
	
	public static void main(String[] args) {
		
		//String nomecurso, String codigocurso
		Curso auxcurso = new Curso("Engenharia de software", "ES");
		
		//String rua, int num, String bairro
		Endereco auxendereco = new Endereco("Rua do Gold", 01,"Bairro da Prata");
		
		//int codigodisciplina, String nome, int creditos
		Disciplina auxdis = new Disciplina(101, "Programação orientada a objetos", 64);
		Disciplina auxdisc = new Disciplina(102, "Banco de dados", 64);
		
		//String nome, int matriculaaluno, int ano, Curso aux1curso
		Aluno auxaluno = new Aluno("José da Silva", 201, 2022, auxcurso);
		
		auxcurso.Disciplinadc(auxdis);
		auxcurso.Disciplinadc(auxdisc);
		auxaluno.setEndereco(auxendereco);
		
		Professor auxprof = new Professor("Roberto Alves", auxendereco, 105, "Engenheiro");
		
		auxprof.setEndereco(auxendereco);
		
	}

}