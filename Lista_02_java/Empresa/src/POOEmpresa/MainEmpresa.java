package POOEmpresa;

public class MainEmpresa {
	
	public static void main(String[] args) {
	
	Endereco auxendereco = new Endereco("Rua das Flores", 02, "Bairro das Arvores","Na esquina ao lado da igreja", "Aparecida de Goiânia", "Goiás");
	Empresa auxempresa = new Empresa("12. 345. 678/0001-10", "Produção de Software industria Ltda", auxendereco);
	Empregado auxempregado = new Empregado("Maria de Lurdes", 123, auxempresa);
	
	System.out.println(auxempregado);
	System.out.println(auxempresa);
	System.out.println(auxendereco);
	
	}
	
}