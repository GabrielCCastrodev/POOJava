package POOProva;

public class Cliente {
	
	private String nome;
	private int idade;
	private Grupo grupo;
	
	public Cliente(String nome, int idade, Grupo grupo) {
		
		this.nome = nome;
		this.idade = idade;
		this.grupo = grupo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public void add(Cliente clientes) {
		// TODO Auto-generated method stub
		
	}
	
}