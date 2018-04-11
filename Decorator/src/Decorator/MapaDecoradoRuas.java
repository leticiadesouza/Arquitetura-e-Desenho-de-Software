package Decorator;

import Componente.Mapa;

public class MapaDecoradoRuas extends MapaDecorador{
	public MapaDecoradoRuas(Mapa m){
		super(m);
	}
	
	public void mostrarMapa(){
		super.mostrarMapa();
		System.out.println("mostrar mapa decorado por  ruas");
	}
}
