package autonoma.directoriodeamistades.models;

public class Amigo extends Persona {
    //Atributos
    private String nombreRedesSociales;
    
    //Metodo constructor
    public Amigo(String nombre, String telefono, String correoElectronico, String nombreRedesSociales) throws IllegalArgumentException {
        super(nombre, telefono, correoElectronico);
        if (this.nombreRedesSociales.trim().isEmpty()){
            throw new IllegalArgumentException();
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
