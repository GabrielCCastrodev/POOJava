package POOUML;

import java.util.ArrayList;

public class Titular extends Socio implements Associacao{
	
	protected int numTitulo;
	
	private ArrayList <Dependente> dependente;

	public Titular(String nome, int idade, char sexo, int numTitulo) {
		super(nome, idade, sexo);
		this.numTitulo = numTitulo;
	}

	public int getNumTitulo() {
		return numTitulo;
	}

	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}
	
	@Override
	public void AssociacaoObjeto(Object obj){
		
		Dependente dep = (Dependente) obj;
		this.dependente.add(dep);
		
	}
	
	@Override
	public double calcularValorMensalidade() {
		
		if(this.getIdade() >= 65){
			
			return 200.00;
		}
		
		return 500.00;
	}

	public String toString() {
		
		String aux = "\n";
		
		for (int i = 0; i < this.dependente.size(); i++) {
			
			if(i == this.dependente.size()){
				
				aux = aux +this.dependente.get(i).getNome();
				
			}
			
			aux = aux +this.dependente.get(i).getNome()+ "\n";
			
		}
		
		return "\nNome: " +this.getNome()+ "\nIdade: " +this.getIdade()+ "\nSexo: " +this.getSexo()+ "\nTipo: " +this.getNumTitulo();
	}

	public ArrayList<Titular> getDependente() {
		// TODO Auto-generated method stub
		return null;
	}
}