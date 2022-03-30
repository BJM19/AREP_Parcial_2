package edu.eci.arep.parcial.api;

/**
 * Interfaz que se usa para la generacion de la calculadora de los datos
 *
 * Autor= Brayan Alexis Jiménez Moya
 */
public interface ApiCalculadora {
	/**
     * Funcion que realiza la operacion log
     * @param value valor a calcular
     * @return resultado operacion
     */
    public Double log(Double dato);

    /**
     * Funcion que realiza la operacion sin
     * @param value valor a calcular
     * @return resultado operacion
     */
    public Double sin(Double dato);

}



