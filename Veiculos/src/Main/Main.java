package Main;

import Model.Carro;
import Model.Moto;

public class Main {
	
	public static void main(String[] args) {
		
		Moto moto = new Moto();
		
		   moto.setMarca("Honda");
		   moto.setAno("2020");
		   moto.setCor("Vermelha");
		   moto.setCilindradas("250");
		   
		   moto.imprimir();
		   moto.acelerar();
		   moto.reduzir();
		   

		   System.out.println("\n");
		   
		  Carro carro = new Carro();
		  
		  carro.setMarca("Fiat");
		  carro.setAno("2019");
		  carro.setCor("Preto");
		  carro.setQtdePortas("4");
		  
		  carro.imprimir();
		  carro.acelerar();
		  carro.reduzir();
		  System.out.println("\n");
		  
 }
}
