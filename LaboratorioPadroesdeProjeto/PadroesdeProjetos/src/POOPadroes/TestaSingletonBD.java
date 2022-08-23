package POOPadroes;

public class TestaSingletonBD {

	public static void main(String[] args) { 
		
		for (int i = 0; i < 10; i++) { 
		    BancoDados bd = BancoDados.getInstancia(); 
		    System.out.println(bd); 
		} 
		
	} 
} 