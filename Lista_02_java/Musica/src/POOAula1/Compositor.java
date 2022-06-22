package POOAula1;

public class Compositor {
	
	private String nomecompositor;
    private String nacionalidade;
    
    public Compositor(String nomecompositor, String nacionalidade) {
		
    	this.nomecompositor = nomecompositor;
    	this.nacionalidade = nacionalidade;
	}

	public void setnome(String nomecompositor) {
    	this.nomecompositor = nomecompositor;
    	
    }
    
    public void setnacionalidade(String nacionalidade) {
    	this.nacionalidade = nacionalidade;
    	
    }
    
    public String getnome() {
    	return nomecompositor;
    	
    }
    
public String toString() {
    	
    	return "Nome do Compositor: "+nomecompositor+ "do" +nacionalidade;

    }
    
    public String getnacionalidade() {
    	return nacionalidade;
    	
    }
}