package autonoma.directoriodeamistades.models;

import autonoma.directoriodeamistades.exceptions.CampoVacioException;

public class Amigo extends Persona {
    //Atributos
    private String nombreRedesSociales;
    
    //Metodo constructor
    public Amigo(String nombre, String telefono, String correoElectronico, String nombreRedesSociales) throws CampoVacioException {
        super(nombre, telefono, correoElectronico);
        if (nombreRedesSociales == null){
            throw new CampoVacioException();
        }
        if (nombreRedesSociales.trim().isEmpty()){
            throw new CampoVacioException();
        }
        this.nombreRedesSociales = nombreRedesSociales;
    }

    //Getters y setters
    public String getNombreRedesSociales() {
        return nombreRedesSociales;
    }

    public void setNombreRedesSociales(String nombreRedesSociales) {
        this.nombreRedesSociales = nombreRedesSociales;
    }
    
    
}
