package autonoma.directoriodeamistades.models;
import autonoma.directoriodeamistades.exceptions.CampoVacioException;
import autonoma.directoriodeamistades.exceptions.CorreoRepetidoException;
import autonoma.directoriodeamistades.exceptions.FaltaArrobaException;
import autonoma.directoriodeamistades.exceptions.NoIniciaConLosDigitos;
import java.util.ArrayList;

public class Directorio {
    //Atributos
    private ArrayList <Amigo> amigos;

    //Metodo constructor
    public Directorio() {
        this.amigos = new ArrayList<>();
    }
    
    //Metodos CRUD
    public boolean agregarAmigo(Amigo amigo) throws CorreoRepetidoException, CampoVacioException, FaltaArrobaException, NoIniciaConLosDigitos {
        for(int i=0; i<this.amigos.size(); i++){
            if(this.amigos.get(i).getCorreoElectronico().equals(amigo.getCorreoElectronico())){
                throw new CorreoRepetidoException();
            }
        }
        amigos.add(amigo);
        return true;
    }
    
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
    //Lopez agrego este metodo el cual es necesario para poder eliminar un amigo
    public ArrayList<Amigo> getAmigos() {
    return this.amigos;
}

}
