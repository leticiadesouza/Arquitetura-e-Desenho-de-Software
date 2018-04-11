package teste;

import componente.Comida;
import composite.Sanduiche;
import leaf.*;

public class CompositeTeste {

	public static void main(String[] args) {
		Comida comida1 = new Pao("integral", 15.0);
		Comida comida2 = new Carne("frago", 15.0);
		Comida comida3 = new Ovo("branco", 8.0);

		
		Sanduiche sanduiche1 = new Sanduiche();
		sanduiche1.addIngrediente(comida1);
		sanduiche1.addIngrediente(comida2);
		sanduiche1.addIngrediente(comida3);
		
		System.out.println("Primeiro sanduba: ");
	    sanduiche1.mostrarComida();
	}
}
