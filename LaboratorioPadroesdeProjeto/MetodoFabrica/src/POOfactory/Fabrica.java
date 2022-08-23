package POOfactory;

abstract class Fabrica {
	
	//código feito observando como foi feito no slide passado pela professora
	public abstract Documento criaDocumento(int numero, String remetente, String tipo);
}