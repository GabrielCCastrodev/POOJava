package POOempresa2;

public class Horista extends Funcionario{
	
	protected int horastrabalhadas;
	protected double valorhora;
	protected double soma2 = horastrabalhadas * valorhora;
	
	public Horista(String nome, String sobrenome, int horastrabalhadas, double valorhora, double soma2) {
		super(nome, sobrenome);
		this.horastrabalhadas = horastrabalhadas;
		this.valorhora = valorhora;
		this.soma2 = soma2;
	}

	public int getHorastrabalhadas() {
		return horastrabalhadas;
	}

	public void setHorastrabalhadas(int horastrabalhadas) {
		this.horastrabalhadas = horastrabalhadas;
	}

	public double getValorhora() {
		return valorhora;
	}

	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}
	
	public double getSoma2() {
		return soma2;
	}

	public void setSoma2(double soma2) {
		this.soma2 = soma2;
	}
	
	
    public String toString() {
    	
    	String auxHor = "\n";
    	
    	auxHor += "\nNome: " +super.nome;
    	auxHor += "\nSobrenome: " +super.sobrenome;
    	auxHor += "\nValor da hora: " +valorhora;
    	auxHor += "\nHoras trabalhadas: " +horastrabalhadas;
    	auxHor += "\nGanho mensal: " +soma2;
		
		return auxHor;
	}
    
}