package POOfactory;

class FabricaDocumentos extends Fabrica{

	//código feito observando como foi feito no slide passado pela professora
	public Documento criaDocumento(int numero, String remetente, String tipo) {
		
		if (tipo.toUpperCase().equals("C")) {
			return new Carta(numero, remetente);
		}
		if (tipo.toUpperCase().equals("N")) {
			return new Notificacao(numero, remetente);
		}
		if (tipo.toUpperCase().equals("T")) {
			return new Telegrama(numero, remetente);
		}
		else {
			System.out.println("Tipo informado inválido!");
		}
		
		return null;
	}
}