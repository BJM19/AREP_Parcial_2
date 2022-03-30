package edu.eci.arep.parcial.api.impl;

import edu.eci.arep.parcial.api.ApiCalculadora;

/**
 * Clase que implementa los metodos de la calculadora
 *
 * Autor= Brayan Alexis Jiménez Moya
 */
public class ApiImplCalculadora implements ApiCalculadora {

	public Double log(Double dato) {
		return Math.log10(dato);
	}

	public Double sin(Double dato) {
		return Math.sin(dato);
		
	}
	
}


