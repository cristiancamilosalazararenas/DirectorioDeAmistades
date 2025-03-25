package autonoma.directoriodeamistades.models;
import autonoma.directoriodeamistades.exceptions.CampoVacioException;
import autonoma.directoriodeamistades.exceptions.FaltaArrobaException;
import autonoma.directoriodeamistades.exceptions.NoIniciaConLosDigitos;

public abstract class Persona {
    //Atributos
    protected String nombre;
    protected String telefono;
    protected String correoElectronico;
    
    //Metodo constructor
    public Persona(String nombre, String telefono, String correoElectronico) throws CampoVacioException, FaltaArrobaException, NoIniciaConLosDigitos{
        if (nombre == null || telefono == null || correoElectronico == null){
            throw new CampoVacioException();
        }
        if (nombre.trim().isEmpty() || telefono.trim().isEmpty() || correoElectronico.trim().isEmpty()){
            throw new CampoVacioException();
        }
        if (!correoElectronico.contains("@")) {
            throw new FaltaArrobaException();
        }
        if (!telefono.startsWith("606") && !telefono.startsWith("30")) {
            throw new NoIniciaConLosDigitos();
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
