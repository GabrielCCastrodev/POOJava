package POOLocacao;

public class Item {
	
	protected String titulo;
	protected int ano;
	protected int tempodeduracao;
	protected String comentarios;

	public Item(String titulo, int ano, int tempodeduracao, String comentarios) {
		
		this.titulo = titulo;
		this.ano = ano;
		this.tempodeduracao = tempodeduracao;
		this.comentarios = comentarios;
		
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getTempodeduracao() {
		return tempodeduracao;
	}

	public void setTempodeduracao(int tempodeduracao) {
		this.tempodeduracao = tempodeduracao;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
}