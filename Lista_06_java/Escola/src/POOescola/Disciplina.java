package POOescola;

public class Disciplina {
	
	private int codigodisciplina;
	private String nome;
	private int creditos;
	
	public Disciplina(int codigodisciplina, String nome, int creditos) {
		
		this.codigodisciplina = codigodisciplina;
		this.nome = nome;
		this.creditos = creditos;
	}

	public int getCodigodisciplina() {
		return codigodisciplina;
	}

	public void setCodigodisciplina(int codigodisciplina) {
		this.codigodisciplina = codigodisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	

}