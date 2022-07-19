package POOescola;

public class Endereco {
	
	protected String rua;
	protected int num;
	protected String bairro;
	
	public Endereco(String rua, int num, String bairro) {
		
		this.rua = rua;
		this.num = num;
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}