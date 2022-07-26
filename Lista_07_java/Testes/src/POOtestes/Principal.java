package POOtestes;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		DecimalFormat dec = new DecimalFormat(".00");
		//String nome, double salario, int numdep, int idade
		Pessoa pes = new Pessoa("Ciclano da Costa" , 4500.00, 0, 32);
		
		JOptionPane .showMessageDialog(null, "O valor do imposto é: " + dec.format(pes.CalculaImposto(pes.getSalario(),pes.getIdade(),pes.getNumdep())));
		
	}
}