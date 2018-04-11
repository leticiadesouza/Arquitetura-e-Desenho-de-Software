package Decorator;

import Componente.Mapa;

public class MapaDecorador implements Mapa{
	private Mapa mapa;
	
	public MapaDecorador(Mapa m){
		this.mapa = m;
	}
	
	public void mostrarMapa(){
		this.mapa.mostrarMapa();
		System.out.println("mapa decorador");
	}
}
