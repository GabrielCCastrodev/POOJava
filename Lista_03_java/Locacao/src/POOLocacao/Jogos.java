package POOLocacao;

public class Jogos extends Item{
	
	protected int numjogadores;
	protected String plataforma;
	
	public Jogos(String titulo, int ano, int tempodeduracao, String comentarios, int numjogadores, String plataforma) {
		super(titulo, ano, tempodeduracao, comentarios);
		this.numjogadores = numjogadores;
		this.plataforma = plataforma;
	}

	public String toString() {
		
		String auxjogo = "\n";
		
		auxjogo += "\nTitulo: " +super.titulo;
		auxjogo += "\nAno: "+super.ano;
		auxjogo += "\nDuração: " +super.tempodeduracao;
	    auxjogo += "\nComentários: " +super.comentarios;
	    auxjogo += "\nNúmero de Jogadores: " +numjogadores;
		auxjogo += "\nPlataformas compatíveis: " +plataforma;
		
		return  auxjogo;
	}

	public int getNumjogadores() {
		return numjogadores;
	}

	public void setNumjogadores(int numjogadores) {
		this.numjogadores = numjogadores;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
}