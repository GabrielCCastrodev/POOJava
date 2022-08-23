package POOfactory;

class Carta extends Documento{
	
	//código feito observando como foi feito no slide passado pela professora
	public Carta(int numero, String remetente) {
		
		this.numero = numero;
		this.remetente = remetente;
		
		System.out.println("Carta \nNúmero do documento: " +numero+ "\nRemetente: " +remetente);
		
	}

}