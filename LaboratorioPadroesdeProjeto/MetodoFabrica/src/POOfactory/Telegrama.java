package POOfactory;

class Telegrama extends Documento{
	
	//código feito observando como foi feito no slide passado pela professora
    public Telegrama(int numero, String remetente) {
		
		this.numero = numero;
		this.remetente = remetente;
		
		System.out.println("Telegrama \nNúmero do documento: " +numero+ "\nRemetente: " +remetente);
		
	}

}