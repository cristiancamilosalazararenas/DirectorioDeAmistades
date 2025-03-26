package autonoma.directoriodeamistades.models;

import autonoma.directoriodeamistades.exceptions.CampoVacioException;
import autonoma.directoriodeamistades.exceptions.FaltaArrobaException;
import autonoma.directoriodeamistades.exceptions.NoIniciaConLosDigitosException;

/**
 * Clase Persona. Encargada de funcionar como clase abstracta para que la clase Amigo herede de ella
 * 
 * @author  Cristian Camilo Salazar Arenas
 * @version 20250323
 * @since   1.0
 */

public abstract class Persona {
    
    /**
    * Un atributo que almacenara los nombres de cada persona
    */
    
    protected String nombre;
    
    /**
    * Un atributo que almacenara los telefonos de cada persona
    */
    
    protected String telefono;
    
    /**
    * Un atributo que almacenara el correo electronico de cada persona
    */
    
    protected String correoElectronico;
    
    /**
    * Este es el metodo constructor de la clase Persona
    *
    * @param     nombre                 nombre de la persona
    * @param     telefono               telefono de la persona
    * @param     correoElectronico      correo de la persona
    * @exception CampoVacioException
    *            Si los paramatros estan vacios o son nulos
    * @exception FaltaArrobaException
    *            Si el usuario no ingresa el caracter especial "@"
     * @throws NoIniciaConLosDigitosException Si el usuario no inicia con los digitos 606 o 30
    * @since   1.0
    */
    
    public Persona(String nombre, String telefono, String correoElectronico) throws CampoVacioException, FaltaArrobaException, NoIniciaConLosDigitosException{
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
            throw new NoIniciaConLosDigitosException();
        }
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    /**
    * Este es el metodo para obtener el nombre de una instancia de la clase Persona
    * @return nombre de la persona
    * @since   1.0
    */
    public String getNombre() {
        return nombre;
    }
    
    /**
    * Este es el metodo para modificar el nombre de una instancia de la clase Persona
    * @param        nombre      nuevo nombre de la persona       
    * @since   1.0
    */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    * Este es el metodo para obtener el telefono de una instancia de la clase Persona
    * @return  numero de telefono
    * @since   1.0
    */

    public String getTelefono() {
        return telefono;
    }
    
    /**
    * Este es el metodo para modificar el telefono de una instancia de la clase Persona
    * @param        telefono        nuevo telefono de la persona
    * @since   1.0
    */

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
    * Este es el metodo para obtener el correo de una instancia de la clase Persona
    * @return correo de la persona
    * @since   1.0
    */
    

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    /**
    * Este es el metodo para modificar el correo de una instancia de la clase Persona
    * @param        correoElectronico       nuevo correo de la persona
    * @since   1.0
    */

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
