package abstractFactory;

public class UbuntuFactory extends GUIFactory{
	
	public Button createButton(){
		return  new UbuntuButton();
	}
}
