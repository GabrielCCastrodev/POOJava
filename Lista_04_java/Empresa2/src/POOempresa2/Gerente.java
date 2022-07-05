package POOempresa2;

public class Gerente extends Funcionario{
	
	
	protected double salariogerente;
	protected double bonificacao = salariogerente * 0.20;
	protected double soma3 = salariogerente + bonificacao;
	
	public Gerente(String nome, String sobrenome, double salariogerente, double bonificacao, double soma3) {
		super(nome, sobrenome);
		this.salariogerente = salariogerente;
		this.bonificacao = bonificacao;
		this.soma3 = soma3;
	}

	public double getSalariogerente() {
		return salariogerente;
	}

	public void setSalariogerente(double salariogerente) {
		this.salariogerente = salariogerente;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	public double getSoma3() {
		return soma3;
	}

	public void setSoma3(double soma3) {
		this.soma3 = soma3;
	}
	
    public String toString() {
		
    	String auxGerente = "\n";
    	
    	auxGerente += "\nNome: " +super.nome;
    	auxGerente += "\nSobrenome: " +super.sobrenome;
    	auxGerente += "\nSalário: " +salariogerente;
    	auxGerente += "\nBonificação: " +bonificacao;
    	auxGerente += "\nGanho mensal: " +soma3;
    	
		return auxGerente;
	}
	
}