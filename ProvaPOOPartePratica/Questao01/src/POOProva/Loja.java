package POOProva;

import java.util.ArrayList;

public class Loja {
	
	private String nome;
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();

	public Loja(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void addGrupo(Grupo grupo) {
		grupos.add(grupo);
	}
	
	public ArrayList<Grupo> getGrupos(){
		return this.grupos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}