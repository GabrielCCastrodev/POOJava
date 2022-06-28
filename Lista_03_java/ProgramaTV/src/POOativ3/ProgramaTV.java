package POOativ3;

import java.util.ArrayList;

public class ProgramaTV {
	
	static int codigo = 001;
	int num;
	String nome;
	ArrayList <Pessoa> artistas = new ArrayList <Pessoa>();
	Pessoa diretor;
	String categoria;
	
	ProgramaTV(String nome, String categoria){
		
		num = codigo;
		codigo++;
		this.nome = nome;
		this.categoria = categoria;
		
	}
	
	ProgramaTV(int codigo, String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}
	
	void setDiretor(Pessoa diretor){
		this.diretor = diretor;
	}
	
	void setArtistas(Pessoa artista) {
		artistas.add(artista);
	}
	
	
	public String toString() {
		String programa = num + "-" + nome + " (" + categoria + ")\n";
		programa = programa + "Diretor : " + diretor +"\n";
		programa = programa + "Artistas : \n";
		for (int i=0;i<artistas.size();i++) {
			programa = programa + artistas.get(i) + "\n";
		}
		return programa;
	}

}