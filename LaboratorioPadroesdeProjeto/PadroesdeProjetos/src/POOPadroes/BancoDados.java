package POOPadroes;

public class BancoDados {
	
	private String nome;
	private int codigo;
	public static BancoDados ban;
	 
	 private BancoDados() {
	    codigo = 001;
	    nome = "MySql";
	 }
	 
	 public static BancoDados getInstancia() {
		 
		 if (ban == null) {
			ban = new BancoDados();
		} 
		return ban;
	 }
	 

  public String toString() { 
     return "BancoDados : " + codigo + "-" + nome + " - Instância :" + this.hashCode() ; 
  } 

}