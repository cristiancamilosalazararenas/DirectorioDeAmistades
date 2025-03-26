package autonoma.directoriodeamistades.models;
import autonoma.directoriodeamistades.exceptions.CampoVacioException;
import autonoma.directoriodeamistades.exceptions.CorreoRepetidoException;
import autonoma.directoriodeamistades.exceptions.FaltaArrobaException;
import autonoma.directoriodeamistades.exceptions.NoIniciaConLosDigitosException;
import java.util.ArrayList;

/**
 * Clase Directorio. Encargada de contener toda la informacion de las instancias de la clase amigo
 * 
 * @author  Cristian Camilo Salazar Arenas
 * @version 20250323
 * @since   1.0
 */

public class Directorio {
    
    /**
    * Un ArrayList que se encargará de contener varias instancias de la clase Amigo
    */
    
    private ArrayList <Amigo> amigos;

    /**
    * Este es el constructor vacio de la clase Directorio.
    * 
    * @since   1.0
    */
    
    public Directorio() {
        this.amigos = new ArrayList<>();
    }
    
    /**
    * Este es el metodo encargado de agregar amigos.
    *
    * @param     amigo                 nombre del amigo a agregar
    * @return    retorna true si el amigo se agrego al ArrayList
    * @exception CorreoRepetidoException
    *            Si el correo se encuentra en el ArrayList de la clase Directorio
    * @exception CampoVacioException
    *            Si los paramatros estan vacios o son nulos
    * @exception FaltaArrobaException
    *            Si el usuario no ingresa el caracter especial "@"
     * @throws NoIniciaConLosDigitosException Si el usuario no inicia con los digitos 606 o 30
    * @since   1.0
    */
    
    public boolean agregarAmigo(Amigo amigo) throws CorreoRepetidoException, CampoVacioException, FaltaArrobaException, NoIniciaConLosDigitosException {
        for(int i=0; i<this.amigos.size(); i++){
            if(this.amigos.get(i).getCorreoElectronico().equals(amigo.getCorreoElectronico())){
                throw new CorreoRepetidoException();
            }
        }
        amigos.add(amigo);
        return true;
    }
    
    /**
    * Este es el metodo encargado de buscar amigos.
    *
    * @param     correoElectronico      el amigo se buscara a traves del correo electronico
    * @return    retorna la instancia de la clase Amigo si fue encontrado, si no, null
    * @since   1.0
    */
    
    public Amigo buscarAmigo(String correoElectronico){
        for(int i=0; i<this.amigos.size(); i++){
            if(this.amigos.get(i).getCorreoElectronico().equals(correoElectronico)){
                return this.amigos.get(i);
            }
        }
        return null;
    }
    
    public boolean eliminarAmigo(String correoElectronico){
        for(int i=0; i<this.amigos.size(); i++){
            if(this.amigos.get(i).getCorreoElectronico().equals(correoElectronico)){
                amigos.remove(this.amigos.get(i));
                return true;
            }
        }
        return false;
    }
    
    /**
    * Este es el metodo encargado de actualizar amigos.
    *
    * @param     correoElectronico          el amigo se buscara a traves del correo electronico
    * @param     nombre                     el nuevo nombre del amigo
    * @param     telefono                   el nuevo telefono del amigo
    * @param     nuevoCorreoElectronico     el nuevo correo del amigo
    * @param     nombreRedesSociales        el nuevo nombre de usuario del amigo en sus redes sociales
    * @return    retorna true o false dependiendo de si se encuentra el correo y se cumplen con todos los campos al intentar actualizar
    * @since   1.0
    */
    
    public boolean actualizarAmigo(String correoElectronico, String nombre, String telefono, String nuevoCorreoElectronico, String nombreRedesSociales) {
    Amigo amigoAActualizar = null;
    for (Amigo amigo : amigos) {
        if (amigo.getCorreoElectronico().equals(nuevoCorreoElectronico) && !amigo.getCorreoElectronico().equals(correoElectronico)) {
            return false;
        }
        if (amigo.getCorreoElectronico().equals(correoElectronico)) {
            amigoAActualizar = amigo;
        }
    }
    if (amigoAActualizar == null) {
        return false;
    }
    amigoAActualizar.setNombre(nombre);
    amigoAActualizar.setTelefono(telefono);
    amigoAActualizar.setCorreoElectronico(nuevoCorreoElectronico);
    amigoAActualizar.setNombreRedesSociales(nombreRedesSociales);
    return true;
}
    /**
    * Este es el metodo encargado de conseguir amigos.
    *
    * @return    retorna el ArrayList de todos los amigos ingresados en el directorio
    * @since   1.0
    */
    public ArrayList<Amigo> getAmigos() {
    return this.amigos;
}

}
