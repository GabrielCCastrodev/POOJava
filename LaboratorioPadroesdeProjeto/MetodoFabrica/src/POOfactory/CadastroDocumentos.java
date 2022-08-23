package POOfactory;

public class CadastroDocumentos {
	
	//código feito observando como foi feito no slide passado pela professora
	public static void main(String args[]) {
		
		FabricaDocumentos fac = new FabricaDocumentos();
		
		int numero = 01;
		String remetente = "João";
		String tipo = "N";
		
		Documento doc = fac.criaDocumento(numero, remetente, tipo);
	}
}