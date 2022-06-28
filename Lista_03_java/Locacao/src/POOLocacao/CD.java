package POOLocacao;

public class CD extends Item{
	
	protected String artista;
	protected int numfaixas;

	public CD(String titulo, int ano, int tempodeduracao, String comentarios, String artista, int numfaixas) {
		super(titulo, ano, tempodeduracao, comentarios);
		this.artista = artista;
		this.numfaixas = numfaixas;
	}
	
    public String toString() {
		
		String auxCD = "\n";
		
		auxCD += "\nTitulo: " +super.titulo;
		auxCD += "\nAno: "+super.ano;
		auxCD += "\nDuração: " +super.tempodeduracao;
	    auxCD += "\nComentários: " +super.comentarios;
	    auxCD += "\nArtista: " +artista;
		auxCD += "\nNúmero de faixas: " +numfaixas;
		
		return  auxCD;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNumfaixas() {
		return numfaixas;
	}

	public void setNumfaixas(int numfaixas) {
		this.numfaixas = numfaixas;
	}

}