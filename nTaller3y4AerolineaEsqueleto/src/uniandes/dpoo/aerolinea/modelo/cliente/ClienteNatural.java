package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente{
	
	private String nombre;
	public static String NATURAL = "Natural";

	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarTiquete(Tiquete tiquete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calcularValorTotalTiquetes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void usarTiquetes(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}

}
