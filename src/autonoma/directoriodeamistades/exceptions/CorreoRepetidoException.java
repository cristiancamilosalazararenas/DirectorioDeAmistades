package autonoma.directoriodeamistades.exceptions;

/**
 * Clase CorreoRepetidoException. Hereda de la clase RuntimeException
 * 
 * @author  Cristian Camilo Salazar Arenas
 * @version 20250323
 * @since   1.0
 */

public class CorreoRepetidoException extends RuntimeException {

    public CorreoRepetidoException() {
        super("El correo electronico que ingreso ya se encuentra en el directorio. Por favor, ingrese uno distinto.");
    }
}
