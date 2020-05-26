package Model;

public class Veiculo {
	
	private String marca;
	private String ano;
	private String cor;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void acelerar() {
		
		System.out.println("Está acelerando.");
		
	}
	
	public void reduzir() {
		System.out.println("Esta reduzindo a velocidade.");
	}
	

}
