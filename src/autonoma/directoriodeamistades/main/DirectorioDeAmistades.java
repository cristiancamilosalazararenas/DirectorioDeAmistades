package autonoma.directoriodeamistades.main;

import autonoma.directoriodeamistades.models.Directorio;
import autonoma.directoriodeamistades.views.VentanaPrincipal;

/**
 * Clase main.
 * 
 * @author  Cristian Camilo Salazar Arenas
 * @version 20250323
 * @since   1.0
 */

public class DirectorioDeAmistades {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        VentanaPrincipal ventana = new VentanaPrincipal(directorio);
        ventana.setVisible(true);
    }
}
