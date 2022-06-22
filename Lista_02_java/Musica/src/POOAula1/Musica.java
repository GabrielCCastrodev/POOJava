package POOAula1;

import java.util.ArrayList;
import java.util.List;

public class Musica {
	
	private String nome;
    private int ano;
    private String tipo;
    private List<Compositor> compositores;
    
    public Musica() {}
    
    public Musica(String nome, int ano, String tipo) {
    	
    	this.nome = nome;
    	this.ano = ano;
    	this.tipo = tipo;
    	this.compositores = new ArrayList<Compositor>();
    	
    }
    
    public String toString() {
    	
    	return "Musica " + this.nome + " do ano " +this.ano+ " e o compositor:" +this.compositores.toString();

    }
    
    public void adicionarCompositor(Compositor compositor) {
        this.compositores.add(compositor);
        
    }

}