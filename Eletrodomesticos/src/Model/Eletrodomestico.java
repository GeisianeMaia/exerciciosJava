package Model;

public class Eletrodomestico {

	private String marca;
	private String ano;
	private String cor;
	private String tipo;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void imprimir() {
		System.out.println("Marca: "+marca);
		System.out.println("Ano: "+ano);
		System.out.println("Cor: "+cor);
		System.out.println("Tipo: "+tipo);
	}
	
	
}
