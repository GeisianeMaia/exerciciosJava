package Model;

public class Moto extends Veiculo{
	
	private String cilindradas;

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public void imprimir() {
		System.out.println("Marca: "+getMarca());
		System.out.println("Ano: "+getAno());
		System.out.println("Cor: "+getCor());
		System.out.println(this.cilindradas+ " cilindradas");
	}
	

}
