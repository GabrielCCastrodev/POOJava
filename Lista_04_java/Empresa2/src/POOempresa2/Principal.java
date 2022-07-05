package POOempresa2;

public class Principal {
	
	public static void main(String[] args) {
		
		//2 horistas, 4 adm, 3 comissionados, 1 gerente
		
		Funcionario[] lista = new Funcionario[10];
		
		lista[0] = new Gerente("Walleska","Caldas", 18530.50, 3706.10, 22236.60);
		
		lista[1] = new Administrador("José","Costa",5698.20);
		lista[2] = new Administrador("Joana","Batista",7521.50);
		lista[3] = new Administrador("Josefina","Chagas",3548.69);
		lista[4] = new Administrador("Claudio","Cardoso",3356.65);
		
		lista[5] = new Comissionado("Fernanda","Madeira",2000,20,140,2140);
		lista[6] = new Comissionado("Roberto","Silva",2000,30,210,2210);
		lista[7] = new Comissionado("Ronaldo","Sousa",2000,10,70,2070);
		
		lista[8] = new Horista("Renata","Silva",750,12.50,9375.00);
		lista[9] = new Horista("Carlos","Bueno",700,11.20,7840.00);
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]);
		}
		
	}
}