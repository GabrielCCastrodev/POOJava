package POOUML;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal{
	
    public static void main(String[] args){
    	
        ArrayList<Titular> titular = new ArrayList<Titular>();
        
        for(int i = 0; i < 4; i++){
        	
            String nome;
            char sexo;
            int idade;
            int numTitulo;

            nome = JOptionPane.showInputDialog("Nome: ");
            sexo = JOptionPane.showInputDialog("Insira o sexo (F or M): ").charAt(0);
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
            numTitulo = Integer.parseInt(JOptionPane.showInputDialog("Número de título: "));
            Titular auxtit = new Titular(nome, idade, sexo, numTitulo);
            titular.add(auxtit);
        }

        for(int i = 0; i < titular.size(); i++){
        	
            int qntDep = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dependentes " + titular.get(i).getNome() + ": "));
            
            for(int j = 0; j < qntDep; j++){
            	
                String nome = JOptionPane.showInputDialog("Digite o nome: ");
                char sexo = JOptionPane.showInputDialog("Informe o sexo (F/M): ").charAt(0);
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
                int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo: "));

                Dependente dependente = new Dependente(nome, idade, sexo, tipo);
                titular.get(i).AssociacaoObjeto(dependente);
            }
        }

        for(int i = 0; i < titular.size(); i++){
        	
            double ValorPago = titular.get(i).CalcularValorMensalidade();
            
            for(int j = 0; i < titular.get(i).getDependente().size(); i++){
            	
                ValorPago += titular.get(i).getDependente().get(j).CalcularValorMensalidade();
            }
            
            System.out.println("Valor que o/a " + titular.get(i).getNome() + "pagou: " + ValorPago);
        }
    }
}