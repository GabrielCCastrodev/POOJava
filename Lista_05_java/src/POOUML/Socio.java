package POOUML;

public class Socio {
	
	protected String nome;
	protected int idade;
	protected char sexo;
	
	public Socio(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double CalcularValorMensalidade() {
		
		if(this.idade >= 65) {
			
			return 150.00;
		}
		
		return 250.00;
	}

}