package POOLocacao;

public class Filme extends Item{
	
	protected String diretor;

	public Filme(String titulo, int ano, int tempodeduracao, String comentarios, String diretor) {
		super(titulo, ano, tempodeduracao, comentarios);
		this.diretor = diretor;
	}

	public String toString() {
		
        String auxFilme = "\n";
		
		auxFilme += "\nTitulo: " +super.titulo;
		auxFilme += "\nAno: "+super.ano;
		auxFilme += "\nDuração: " +super.tempodeduracao;
	    auxFilme += "\nComentários: " +super.comentarios;
	    auxFilme += "\nDiretor: " +diretor;
		
		return auxFilme;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

}