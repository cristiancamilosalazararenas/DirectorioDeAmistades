package autonoma.directoriodeamistades.models;

import autonoma.directoriodeamistades.exceptions.CampoVacioException;

/**
 * Clase Amigo que hereda atributos y métodos de la clase Persona
 * 
 * @author  Cristian Camilo Salazar Arenas
 * @version 20250323
 * @since   1.0
 */

public class Amigo extends Persona {
    
    /**
    * Nombre de usuario en las redes sociales de la clase Amigo
    */
    
    private String nombreRedesSociales;
    
    /**
    * Este es el constructor de la clase Amigo.
    *
    * @param     nombre                 nombre del amigo
    * @param     telefono               telefono del amigo
    * @param     correoElectronico      correo del amigo
    * @param     nombreRedesSociales    nombre de usuario de las redes sociales del amigo
    * @exception CampoVacioException
    *            Si los paramatros estan vacios o son nulos
    * @since   1.0
    */
    
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

    /**
    * Metodo para obtener el nombre de usuario de las redes sociales de cualquier instancia de la clase Amigo.
    *
    * @return    El nombre de usuario de las redes sociales
    * @since   1.0
    */
    public String getNombreRedesSociales() {
        return nombreRedesSociales;
    }
    
    /**
    * Metodo para cambiar el nombre de usuario de las redes sociales de cualquier instancia de la clase Amigo.
    * @param   nombreRedesSociales      recibe como parametro el nombre de usuario actual del amigo
    * @since   1.0
    */
    
    public void setNombreRedesSociales(String nombreRedesSociales) {
        this.nombreRedesSociales = nombreRedesSociales;
    }
    
    
}
