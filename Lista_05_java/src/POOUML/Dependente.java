package POOUML;

public class Dependente extends Socio{
	
	protected int tipo;

	public Dependente(String nome, int idade, char sexo, int tipo) {
		super(nome, idade, sexo);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public double CalcularValorMensalidade() {
		
		if(this.getIdade() == 1 || this.getIdade() == 2) {
			
			if(idade < 10) {
				
				return 100.00;
			} 
			else if(this.getIdade() >= 10 && this.getIdade() < 21){
				
				return 150.00;
			}
			else if(this.getIdade() >= 21 && this.getIdade() <= 65) {
				
				return 200.00;
			}
			return 80;
		}
		else {
			if(this.getIdade() <= 65) {
				
				return 250.00;
			}
			return 150.00;
		}
		
	}
	
	public String toString(){
		
		return "\nNome: " +this.getNome()+ "\nIdade: " +this.getIdade()+ "\nSexo: " +this.getSexo()+ "\nTipo: " +this.getTipo();
	}

}