package autonoma.directoriodeamistades.exceptions;

/**
 * Clase CampoVacioException. Hereda de la clase RuntimeException
 * 
 * @author  Cristian Camilo Salazar Arenas
 * @version 20250323
 * @since   1.0
 */

public class CampoVacioException extends RuntimeException{

    public CampoVacioException(){
        super("Por favor, no deje ningun campo vacio.");
    }
}
