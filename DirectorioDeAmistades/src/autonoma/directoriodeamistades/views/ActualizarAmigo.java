package autonoma.directoriodeamistades.views;

import autonoma.directoriodeamistades.models.Directorio;
import javax.swing.ImageIcon;

public class ActualizarAmigo extends javax.swing.JDialog {
    
    private Directorio directorio;
    private VentanaPrincipal ventanaPrincipal;

    public ActualizarAmigo(java.awt.Frame parent, boolean modal, Directorio directorio, VentanaPrincipal ventanaPrincipal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/directoriodeamistades/images/Icono.png")).getImage());
        }catch(Exception e){
        
        }
        this.directorio = directorio;
        this.ventanaPrincipal = ventanaPrincipal;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
