package POOativ3;

public class Serie extends ProgramaTV{
	
	private int temporadas;
	private int episodios;
	
	Serie(String nome, String categoria, int temporadas, int episodios) {
		super(nome, categoria);
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public String ToString() {
		
		String Serie = super.toString();
		
		return "A Série " +nome+ "da categoria " +categoria+ "possui " +temporadas+ "e" +episodios+ "episódios";
		
	}

}