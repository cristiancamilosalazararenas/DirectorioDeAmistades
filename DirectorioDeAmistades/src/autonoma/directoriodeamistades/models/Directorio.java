package autonoma.directoriodeamistades.models;
import java.util.ArrayList;

public class Directorio {
    //Atributos
    private ArrayList <Amigo> amigos;

    //Metodo constructor
    public Directorio() {
        this.amigos = new ArrayList<>();
    }
    
    //Metodos CRUD
    public boolean agregarAmigo(Amigo amigo){
        for(int i=0; i<this.amigos.size(); i++){
            if(this.amigos.get(i).getCorreoElectronico().equals(amigo.getCorreoElectronico())){
                return false;
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

}
