package POOTerritorio;

public class Cidade implements Publicavel{
	
	private String nome;
	private String codigo;
	private int populacao;
	private int tamanho;
	
	public Cidade(String nome, String codigo, int populacao, int tamanho) {
		
		this.nome = nome;
		this.codigo = codigo;
		this.populacao = populacao;
		this.tamanho = tamanho;
	}
	
	public boolean Igualdade(Cidade city, Cidade cityaux)
    {
		boolean auxtrue = true;
		boolean auxfalse = false;
		
        if (city.getNome() == cityaux.getNome() && city.getCodigo() == cityaux.getCodigo()) {
			
        	return auxtrue;
		}
        else {
			return auxfalse;
		}
    }
	
    public boolean isLimitrofe(Cidade city, Cidade cityaux)
    {
    	boolean auxtrue = true;
    	boolean auxfalse = false;
    	
        return auxtrue;
    }
	
	public void densidadecidade(int populacao, int tamanho) {
		
		double densidadecidade;
		
		densidadecidade = populacao / tamanho;
		
		if (densidadecidade > 500) {
			
			System.out.println("Povoação elevada");
		}
		else if (500 >= densidadecidade && densidadecidade >= 100) {
			
			System.out.println("Povoação regular");
		}
		else {
			System.out.println("Povoação baixa");
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String MostraDados() {
		
		return "\nNome: " +nome+ "\nCódigo: " +codigo+ "\nPopulação: " +populacao+ "\nTamanho: " +tamanho;
	}

}