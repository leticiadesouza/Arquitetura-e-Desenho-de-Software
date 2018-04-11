package abstractFactory;

public abstract class GUIFactory {
	public static GUIFactory defineFactory(){
		if(configuration.getAtualSystemOperational == "Windows"){
			return new winFactory();
		}else 
			return new ubuntuFactory();
	}
	
	
}
