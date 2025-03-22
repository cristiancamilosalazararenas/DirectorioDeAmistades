package autonoma.directoriodeamistades.models;

public class Amigo extends Persona {
    //Atributos
    private String nombreRedesSociales;
    
    //Metodo constructor
    public Amigo(String nombre, String telefono, String correoElectronico, String nombreRedesSociales) {
        super(nombre, telefono, correoElectronico);
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
