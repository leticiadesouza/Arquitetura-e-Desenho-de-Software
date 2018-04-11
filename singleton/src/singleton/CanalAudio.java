package singleton;

public class CanalAudio {
	private int totalCanalRadio=1;
	private int totalCanalInternet=1 ;
	
	public static CanalAudio instancia;
	
	public CanalAudio(){
		//Nothing to do
	}
		
	public String criarCanalRadio(){
		return new String("Canal Radio #" + totalCanalRadio++ + " criado.");
	}
	
	public String criarCanalInternet(){
		return new String("Canal Internet #" + totalCanalInternet++ + " criado.");
	}
	
	public String gerarRelatorio(){
		return new String("Total de canais de Radio: " + totalCanalRadio + 
				"\nTotal de canais deInternet: " + totalCanalInternet);
	}
	

	public static CanalAudio getInstancia(){
		if(instancia == null){
			instancia = new CanalAudio();
		}
		return instancia;
	}
}
 