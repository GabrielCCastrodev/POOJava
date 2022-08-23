package POOfactory;

class Notificacao extends Documento{
	
	//código feito observando como foi feito no slide passado pela professora
    public Notificacao(int numero, String remetente) {
		
		this.numero = numero;
		this.remetente = remetente;
		
		System.out.println("Notificação \nNúmero do documento: " +numero+ "\nRemetente: " +remetente);
		
	}
}