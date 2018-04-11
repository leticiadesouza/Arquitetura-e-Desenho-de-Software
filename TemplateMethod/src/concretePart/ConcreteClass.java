package concretePart;
import abstractPart.AbstractClass;

public class ConcreteClass extends AbstractClass{
	
	public ConcreteClass(){
		//nothing to do
	}
	
	public void operacao1(){
		System.out.println("operacao1: selecionar ingredientes para montar o sanduba!");
	}

	public void operacao2(){
		System.out.println("operacao2: efetuar pagamento!");
	}
}
