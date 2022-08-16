package POOArquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {
	
    public static void main(String[] args) throws IOException{
        	
    	
    	InputStream is = new FileInputStream("D:\\programacaoHD\\Eclipse_Java\\eclipse\\Arquivos_dev\\funcionarios.txt");
    	InputStreamReader isr = new InputStreamReader(is);
    	BufferedReader br = new BufferedReader(isr);
    	ArrayList<Funcionario> func = new ArrayList<Funcionario>();
    	double somaimposto = 0;
    	double somaimpostomasculino = 0;
    	double somaimpostofeminino = 0;
    	
    	
    	String aux = br.readLine();
    	int i = 0;
    	
    	while (aux != null) {
    		
    		// no arquivo funcionario.txt, apertar um enter antes da primeira linha, ou seja, a primeira linha será em branco.
    		
    		aux = br.readLine(); 
    		
    		
    		if (aux != null) {
    			String[] auxsplit = aux.split("#");
    			
    			func.add(new Funcionario(auxsplit[0], auxsplit[1].charAt(0), Double.parseDouble(auxsplit[2]), Integer.parseInt(auxsplit[3])));
    			
    			System.out.println("Nome: " +auxsplit[0]);
    			System.out.println("Sexo: " +auxsplit[1]);
    			System.out.println("Salário: "+auxsplit[2]);
    			System.out.println("Dependentes: " +auxsplit[3]+ "\n");
    			
    			somaimposto = somaimposto + func.get(i).impostoRenda();
    			
    			if(func.get(i).sexo == 'M') {
        			somaimpostomasculino = somaimpostomasculino + func.get(i).impostoRenda();
        		}
            	else if(func.get(i).sexo == 'F'){
        			somaimpostofeminino = somaimpostofeminino + func.get(i).impostoRenda();
        		}
    			
    			i++;
    			
    		}
    	}
    	
    	System.out.printf("Soma de impostos pagos por mulheres: %.2f\n" ,somaimpostofeminino);
    	System.out.printf("Soma de impostos pagos por homens: %.2f\n" ,somaimpostomasculino);
    	System.out.printf("Soma de todos os impostos: %.2f" ,somaimposto);
    	
        br.close();
    	
    }
	
}