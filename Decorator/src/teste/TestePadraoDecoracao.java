package teste;

import Componente.Mapa;
import ComponenteBasico.MapaBasico;
import Decorator.MapaDecoradoRuas;
//import Decorator.MapaDecorador;

public class TestePadraoDecoracao {
	public static void main(String[] args){
		Mapa mapaRua = new MapaDecoradoRuas (new MapaBasico());
		mapaRua.mostrarMapa();
		System.out.println("\n*****");
		
		

	}
}
  