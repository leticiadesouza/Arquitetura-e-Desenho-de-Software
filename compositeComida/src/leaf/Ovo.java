package leaf;
import componente.Comida;

public class Ovo implements Comida{
	private String tipoOvo; //branco,cordonia, caipira
	private Double tamanhoOvo;//tamanho do ovo em cm
	
	public Ovo(String tipoOvo, Double tamanhoOvo){
		this.tipoOvo = tipoOvo;
		this.tamanhoOvo = tamanhoOvo;
	}
	
	public void mostrarComida() {
		System.out.println("Saduiche tem ovo sabor: ");
		System.out.println(this.tipoOvo);
		System.out.println("E tem tamanho de: " + this.tamanhoOvo + " cm. ");
	}

}
