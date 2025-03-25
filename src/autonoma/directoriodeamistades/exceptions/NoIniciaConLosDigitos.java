package autonoma.directoriodeamistades.exceptions;

public class NoIniciaConLosDigitos extends RuntimeException {
    public NoIniciaConLosDigitos(){
        super("El campo del telefono debe iniciar con los digitos 606 o 30.");
    }
}
