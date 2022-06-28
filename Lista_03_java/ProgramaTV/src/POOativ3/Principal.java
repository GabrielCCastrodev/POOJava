package POOativ3;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList <Serie> series = new ArrayList <Serie>();
		
		Serie p = new Serie("Grey's Anatomy","Medicina",19,400);
		p.diretor = new Pessoa("Diretor 1", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
		series.add(p);
		
		p = new Serie("Lucifer","Suspense",6,80);
		p.diretor = new Pessoa("Diretor 2", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
		series.add(p);
		
		p = new Serie("The Witcher","Aventura",2,16);
		p.diretor = new Pessoa("Diretor 3", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
		series.add(p);
		
		p = new Serie("How i met Your mother","Comedia romantica",9, 200);
		p.diretor = new Pessoa("Diretor 4", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
		series.add(p);
		
					
		for (int i=0;i<series.size();i++) {
			System.out.println(series.get(i));
		}		
		
	}

}