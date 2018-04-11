package leaf;
import componente.Comida;

public class Carne implements Comida{
	private String tipoCarne; //vermelha,frango,peixe
	private Double tamanhoCarne;//tamanho da carne em cm
	
	public Carne(String tipoCarne, Double tamanhoCarne){
		this.tipoCarne = tipoCarne;
		this.tamanhoCarne = tamanhoCarne;
	}
	
	public void mostrarComida() {
		System.out.println("Saduiche tem carne sabor: ");
		System.out.println(this.tipoCarne);
		System.out.println("E tem tamanhode: " + this.tamanhoCarne + " cm. ");
	}

}
