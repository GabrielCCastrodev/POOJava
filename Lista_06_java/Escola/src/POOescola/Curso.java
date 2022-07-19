package POOescola;

import java.util.ArrayList;

public class Curso {
	
	ArrayList<Disciplina> aux1disc = new ArrayList<Disciplina>();
	
	private String nomecurso;
	private String codigocurso;
	
	public Curso(String nomecurso, String codigocurso) {
		
		this.nomecurso = nomecurso;
		this.codigocurso = codigocurso;
	}
	
    public void Disciplinadc(Disciplina aux) {
		
		this.aux1disc.add(aux);
	}

	public String getnomecurso() {
		return nomecurso;
	}
	
	public void setnomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	
	public String getCodigocurso() {
		return codigocurso;
	}
	
	public void setCodigocurso(String codigocurso) {
		this.codigocurso = codigocurso;
	}

}