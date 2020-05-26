package Model;

public class Carro extends Veiculo{

	private String qtdePortas;

	public String getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(String qtdePortas) {
		this.qtdePortas = qtdePortas;
	}

	public void imprimir() {
		System.out.println("Marca: "+getMarca());
		System.out.println("Ano: "+getAno());
		System.out.println("Cor: "+getCor());
		System.out.println(this.qtdePortas+ " portas");
	}
	
	
}
