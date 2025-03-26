package autonoma.directoriodeamistades.exceptions;

/**
 * Clase NoIniciaConLosDigitos. Hereda de la clase RuntimeException
 * 
 * @author  Cristian Camilo Salazar Arenas
 * @version 20250323
 * @since   1.0
 */

public class NoIniciaConLosDigitosException extends RuntimeException {
    public NoIniciaConLosDigitosException(){
        super("El campo del telefono debe iniciar con los digitos 606 o 30.");
    }
}
