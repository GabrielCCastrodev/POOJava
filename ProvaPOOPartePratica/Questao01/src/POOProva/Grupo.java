package POOProva;

import java.util.ArrayList;

public class Grupo {
	
	private String nome;
	private Loja loja;
	private ArrayList<Interesses> interesses = new ArrayList<Interesses>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	
	public Grupo(String nome, Loja loja) {
		
		this.nome = nome;
		this.loja = loja;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Loja getLoja() {
		return this.loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public ArrayList<Interesses> getInteresses() {
		return this.interesses;
	}

	public void addInteresses(Interesses interesses) {
		interesses.add(interesses);
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}

	public void addClientes(Cliente clientes) {
		clientes.add(clientes);
	}

}