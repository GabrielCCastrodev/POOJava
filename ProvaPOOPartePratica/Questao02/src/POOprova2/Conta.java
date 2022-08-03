package POOprova2;

import java.util.ArrayList;

public class Conta {
	
	private String nome;
	private double saldo;
	int mes;
	private ArrayList <Deposito> depositos = new ArrayList<Deposito>();
	private ArrayList <Saque> saques = new ArrayList<Saque>();
	
	Conta (String nome, int mes, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		this.mes = mes;
	}
	
	
	public double saldoRestante() {
		
		double auxsaldo;
		
		auxsaldo = totalSaldo() - somaSaque();
		
		return auxsaldo;
	}
	
     public boolean adicionaSaque(String descricao,  double valor, String data) {
    	 
    	 boolean auxtrue = true;
    	 boolean auxfalse = false;
		
		if (valor > saldoRestante()) {
			
			return auxfalse;
		}
		else {
		saques.add(new Saque(descricao, valor, data));
		}
		
		return auxtrue;
	}
     
     double somaSaque() {
    	 
    	 double total = 0;
    	 
    	 for (int i = 0; i < saques.size(); i++) {
 			total = total + saques.get(i).getValor();
 		 }
    	 
    	 return total;
     }
	
	
	void adicionaDeposito(String descricao,  double valor) {
		
		depositos.add(new Deposito(descricao, valor));
	}
	
    void adicionaDeposito(String descricao,  double valor, String CPF) {
		
		depositos.add(new DepositoIdentificado(descricao, valor, CPF));
	}
		
	double totalSaldo() {
		
		double total = saldo;
		
		for (int i = 0; i < depositos.size(); i++) {
			total = total + depositos.get(i).getValor();
		}
		
		return total;
	}
	
	public String toString() {
		
		String dadosConta = nome + " - Mês : " + mes + "\n" + "Saldo : " + saldo + "\n";
		
		dadosConta = dadosConta + "Depositos : \n";
		
		for (int i = 0;i < depositos.size();i++) {
			dadosConta = dadosConta + depositos.get(i) + "\n";
		}

		
		dadosConta = dadosConta + "Total DisponÌvel : " + totalSaldo()  + "\n";
		dadosConta = dadosConta + "Saques : \n";
		
		for (int i = 0;i < saques.size();i++) {
			dadosConta = dadosConta + saques.get(i) + "\n";
		}
		
		dadosConta = dadosConta + "Total de Saque : " + somaSaque() + "\n";
		dadosConta = dadosConta + "Total disponível: " + saldoRestante();
		
		return  dadosConta;
	}	
}
