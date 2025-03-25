package autonoma.directoriodeamistades.main;

import autonoma.directoriodeamistades.models.Directorio;
import autonoma.directoriodeamistades.views.VentanaPrincipal;

public class DirectorioDeAmistades {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        VentanaPrincipal ventana = new VentanaPrincipal(directorio);
        ventana.setVisible(true);
    }
}
