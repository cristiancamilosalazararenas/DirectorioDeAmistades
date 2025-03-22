package autonoma.directoriodeamistades.models;

public abstract class Persona {
    //Atributos
    protected String nombre;
    protected String telefono;
    protected String correoElectronico;
    
    //Metodo constructor
    public Persona(String nombre, String telefono, String correoElectronico) throws IllegalArgumentException{
        if (this.nombre.trim().isEmpty() || this.telefono.trim().isEmpty() || this.correoElectronico.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        if (!correoElectronico.contains("@")) {
            throw new IllegalArgumentException();
        }
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
