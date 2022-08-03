package POOProva;

public class Interesses {
	
	private String nome;
	private Grupo grupo;

	public Interesses(String nome, Grupo grupo) {
		
		this.nome = nome;
		this.grupo = grupo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Grupo getGrupo() {
		return grupo;
	}
	
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public void add(Interesses interesses) {
		// TODO Auto-generated method stub
	}
	
}