package autonoma.directoriodeamistades.exceptions;

/**
 * Clase FaltaArrobaException. Hereda de la clase RuntimeException
 * 
 * @author  Cristian Camilo Salazar Arenas
 * @version 20250323
 * @since   1.0
 */

public class FaltaArrobaException extends RuntimeException {

    public FaltaArrobaException() {
        super("El correo ingresado no tiene un arroba. Por favor, intentelo de nuevo.");
    }
}
