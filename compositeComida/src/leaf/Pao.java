package leaf;
import componente.Comida;

public class Pao implements Comida{
	private String tipoPao; //integral,frances, salvado
	private Double tamanhoPao;//tamanho do pao em cm
	
	public Pao(String tipoPao, Double tamanhoPao){
		this.tipoPao = tipoPao;
		this.tamanhoPao = tamanhoPao;
	}
	
	public void mostrarComida() {
		System.out.println("Saduiche tem pao sabor: ");
		System.out.println(this.tipoPao);
		System.out.println("E temtamanhode: " + this.tamanhoPao + " cm. ");
	}
}
