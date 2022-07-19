package POOTerritorio;

public class Principal {
	
	public static void main(String[] args) {
		
		Cidade[] ci = new Cidade[10];
		
		//String nome, String codigo, int populacao, int tamanho
		ci[0] = new Cidade("Goiânia", "GYN", 1296000 , 728);
		ci[1] = new Cidade("Britânia", "BRI", 5815 , 1461);
		ci[2] = new Cidade("Brasília", "BSB", 3094325 , 5761000);
		ci[3] = new Cidade("Aparecida de Goiânia", "APGYN", 590146 , 288465);
		ci[4] = new Cidade("Goiânia", "GYN", 1296000 , 740);
		
		System.out.println(ci[0].Igualdade(ci[0], ci[4]));
		System.out.println(ci[0].Igualdade(ci[1], ci[4]));
		System.out.println(ci[0].Igualdade(ci[2], ci[4]));
		System.out.println(ci[0].Igualdade(ci[3], ci[4]));
		
		for (int j = 0; j < 5; j++) {
			
			System.out.println("\n" + ci[j].MostraDados());
			
		}
		
        for (int i = 0; i < ci.length; i++) {
			
			ci[i].densidadecidade(ci[i].getPopulacao(), ci[i].getTamanho());
			
		}
	}

}
