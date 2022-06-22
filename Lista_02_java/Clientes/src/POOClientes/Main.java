package POOClientes;

public class Main {
	
	public static void main(String[] args) {
		
		Endereco auxendereco = new Endereco("Rua do Ouro", 01, "Bairro da Prata","Na esquina de frente com o bar do João", "Aparecida de Goiânia", "Goiás");
		Cliente auxcliente = new Cliente("José da Costa", "012.345.678-90", auxendereco);
		
		System.out.println(auxcliente);
		System.out.println(auxendereco);
		
	}

}
