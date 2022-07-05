package POOempresa2;

public class Comissionado extends Funcionario{
	
	protected double salariocomiss;
	protected int totvendas;
	//considerando o valor da venda como 100
	protected double prcvendas;
	protected double soma;
	
	public Comissionado(String nome, String sobrenome, double salariocomiss, int totvendas, double prcvendas, double soma) {
		super(nome, sobrenome);
		this.salariocomiss = salariocomiss;
		this.totvendas = totvendas;
		this.prcvendas = prcvendas;
		this.soma = soma;
	}

	public double getSalariocomiss() {
		return salariocomiss;
	}

	public void setSalariocomiss(double salariocomiss) {
		this.salariocomiss = salariocomiss;
	}

	public int getTotvendas() {
		return totvendas;
	}

	public void setTotvendas(int totvendas) {
		this.totvendas = totvendas;
	}

	public double getPrcvendas() {
		return prcvendas;
	}

	public void setPrcvendas(double prcvendas) {
		this.prcvendas = prcvendas;
	}
	
	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}
	
    public String toString() {
    	
    	String auxCom = "\n";
    	
    	auxCom += "\nNome: " +super.nome;
    	auxCom += "\nSobrenome: " +super.sobrenome;
    	auxCom += "\nSalário: " +salariocomiss;
    	auxCom += "\nNúmero de Vendas: " +totvendas;
    	auxCom += "\nComissão por venda: " +prcvendas;
    	auxCom += "\nGanho mensal: " +soma;
		
		return auxCom;
	}
	
}