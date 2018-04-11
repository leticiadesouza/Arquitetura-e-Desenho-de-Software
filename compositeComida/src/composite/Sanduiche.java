package composite;

import java.util.ArrayList;
import java.util.List;

import componente.Comida;

public class Sanduiche implements Comida {
	
	private List<Comida> ingredientes = new ArrayList<Comida>();
	public void addIngrediente(Comida comida){
		this.ingredientes.add(comida);
	}
	
	public void removerIngredientes(Comida comida){
		this.ingredientes.remove(comida);
	}
	
	@Override
	public void mostrarComida() {
		for(Comida comida : this.ingredientes){
			comida.mostrarComida();
		}
	}
}