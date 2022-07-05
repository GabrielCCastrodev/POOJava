package POOempresa2;

public class Administrador extends Funcionario{

	private double salarioadm;
	
	public Administrador(String nome, String sobrenome, double salarioadm) {
		super(nome, sobrenome);
		this.salarioadm = salarioadm;
	}

	public double getSalarioadm() {
		return salarioadm;
	}

	public void setSalarioadm(double salarioadm) {
		this.salarioadm = salarioadm;
	}
	
    public String toString() {
    	
    	String auxAdm = "\n";
    	
    	auxAdm += "\nNome: " +super.nome;
    	auxAdm += "\nSobrenome: " +super.sobrenome;
    	auxAdm += "\nSalário: " +salarioadm;
		
		return auxAdm;
	}
	
}