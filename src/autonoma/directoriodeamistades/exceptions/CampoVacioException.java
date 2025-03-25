package autonoma.directoriodeamistades.exceptions;

public class CampoVacioException extends RuntimeException{

    public CampoVacioException(){
        super("Por favor, no deje ningun campo vacio.");
    }
}
