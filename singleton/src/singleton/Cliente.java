package singleton;

public class Cliente {
	public static void main(String[] args){
		CanalAudio canal = new CanalAudio();
		
		System.out.println(canal.criarCanalRadio());
		System.out.println(canal.criarCanalInternet());
		
		System.out.println(canal.criarCanalRadio());
		System.out.println(canal.criarCanalInternet());	
		System.out.println(canal.criarCanalInternet());	
		
		System.out.println(canal.gerarRelatorio());	
	}
}
