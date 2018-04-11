package abstractFactory;

public class WinFactory extends GUIFactory{
	
	public Button createButton(){
		return  new buttonWin();
	}
}
