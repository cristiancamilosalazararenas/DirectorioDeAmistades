package autonoma.directoriodeamistades.exceptions;

public class CorreoRepetidoException extends RuntimeException {

    public CorreoRepetidoException() {
        super("El correo electronico que ingreso ya se encuentra en el directorio. Por favor, ingrese uno distinto.");
    }
}
