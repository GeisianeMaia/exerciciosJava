package Main;

import Model.Eletrodomestico;

public class Main {

	public static void main(String[] args) {
		
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		
		eletrodomestico.setMarca("Brastemp");
		eletrodomestico.setAno("2020");
		eletrodomestico.setCor("inox");
		eletrodomestico.setTipo("Microondas");
		
		eletrodomestico.imprimir();
	}

}
