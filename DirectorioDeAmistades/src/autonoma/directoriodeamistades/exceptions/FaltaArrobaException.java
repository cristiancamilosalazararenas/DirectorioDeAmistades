package autonoma.directoriodeamistades.exceptions;

public class FaltaArrobaException extends RuntimeException {

    public FaltaArrobaException() {
        super("El correo ingresado no tiene un arroba. Por favor, intentelo de nuevo.");
    }
}
