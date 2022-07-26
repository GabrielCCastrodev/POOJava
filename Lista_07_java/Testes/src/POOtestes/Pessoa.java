package POOtestes;

public class Pessoa {
	
	private String nome;
	private double salario;
	private int numdep;
	private int idade;
	
	public Pessoa(String nome, double salario, int numdep, int idade) {
		
		this.nome = nome;
		this.salario = salario;
		this.numdep = numdep;
		this.idade = idade;
	}
	
	public double CalculaImposto(double salario, int idade, int numdep){
		
		double imposto;
		
		if (idade <= 64) {
			
			if (getSalario() < 1787.77) {
				imposto = 0;
			}
			else if (getSalario() >= 1787.77 && getSalario() <= 2679.29) {
				//Segunda faixa de imposto
				imposto = (getSalario() * 0.075) - 134.08;
			}
			else if (getSalario() >= 2679.30 && getSalario() <= 3572.43) {
				//Terceira faixa de imposto
				imposto = (getSalario() * 0.15) - 335.03;
			}
			else if (getSalario() >=3572.44 && getSalario() <= 4463.81) {
				//Quarta faixa de imposto
				imposto = (getSalario() * 0.225) - 602.96;
			}
			else {
				//Quinta faixa de imposto
				imposto = (getSalario() * 0.275) - 826.15;
			}
			
		}
		else {
			imposto = 0;
		}
		
		if (numdep > 0) {
			
			imposto = imposto - (getNumdep() * 179.71);
			
		}
		
		if (imposto < 0) {
			
			imposto = 0;
		}
		
		return imposto;
	}
	
	public void PessoaTest(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumdep() {
		return numdep;
	}

	public void setNumdep(int numdep) {
		this.numdep = numdep;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double calculaImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}