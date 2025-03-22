package autonoma.directoriodeamistades.views;

import autonoma.directoriodeamistades.models.Directorio;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaPrincipal extends javax.swing.JFrame {

    private Directorio directorio;
    
    public VentanaPrincipal(Directorio directorio) {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/directoriodeamistades/images/Icono.png")).getImage());
        }catch(Exception e){
        
        }
        this.directorio = directorio;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAgregarAmigo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminarAmigo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarAmigo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnActualizarAmigo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAcercaDe = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 110));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel1.setText("DIRECTORIO");
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 47));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamistades/images/Crear.png"))); // NOI18N

        jLabel3.setText("Agregar Amigo");

        javax.swing.GroupLayout btnAgregarAmigoLayout = new javax.swing.GroupLayout(btnAgregarAmigo);
        btnAgregarAmigo.setLayout(btnAgregarAmigoLayout);
        btnAgregarAmigoLayout.setHorizontalGroup(
            btnAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarAmigoLayout.createSequentialGroup()
                .addGroup(btnAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAgregarAmigoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(btnAgregarAmigoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        btnAgregarAmigoLayout.setVerticalGroup(
            btnAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEliminarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarAmigoMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamistades/images/Eliminar.png"))); // NOI18N

        jLabel5.setText("Eliminar Amigo");

        javax.swing.GroupLayout btnEliminarAmigoLayout = new javax.swing.GroupLayout(btnEliminarAmigo);
        btnEliminarAmigo.setLayout(btnEliminarAmigoLayout);
        btnEliminarAmigoLayout.setHorizontalGroup(
            btnEliminarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnEliminarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnEliminarAmigoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarAmigoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12))))
        );
        btnEliminarAmigoLayout.setVerticalGroup(
            btnEliminarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarAmigoMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamistades/images/Crear.png"))); // NOI18N

        jLabel9.setText("Buscar Amigo");

        javax.swing.GroupLayout btnBuscarAmigoLayout = new javax.swing.GroupLayout(btnBuscarAmigo);
        btnBuscarAmigo.setLayout(btnBuscarAmigoLayout);
        btnBuscarAmigoLayout.setHorizontalGroup(
            btnBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarAmigoLayout.createSequentialGroup()
                .addGroup(btnBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBuscarAmigoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9))
                    .addGroup(btnBuscarAmigoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBuscarAmigoLayout.setVerticalGroup(
            btnBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnActualizarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarAmigoMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/directoriodeamistades/images/Actualizar.png"))); // NOI18N

        jLabel11.setText("Actualizar Amigo");

        javax.swing.GroupLayout btnActualizarAmigoLayout = new javax.swing.GroupLayout(btnActualizarAmigo);
        btnActualizarAmigo.setLayout(btnActualizarAmigoLayout);
        btnActualizarAmigoLayout.setHorizontalGroup(
            btnActualizarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnActualizarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        btnActualizarAmigoLayout.setVerticalGroup(
            btnActualizarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAcercaDe.setText("Acerca de");
        btnAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcercaDeMouseClicked(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAcercaDe)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcercaDe)
                    .addComponent(btnSalir))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseEntered
        this.mouseEntered(btnAgregarAmigo);
    }//GEN-LAST:event_btnAgregarAmigoMouseEntered

    private void btnAgregarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseExited
        this.mouseExited(btnAgregarAmigo);
    }//GEN-LAST:event_btnAgregarAmigoMouseExited

    private void btnEliminarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAmigoMouseEntered
        this.mouseEntered(btnEliminarAmigo);
    }//GEN-LAST:event_btnEliminarAmigoMouseEntered

    private void btnEliminarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAmigoMouseExited
        this.mouseExited(btnEliminarAmigo);
    }//GEN-LAST:event_btnEliminarAmigoMouseExited

    private void btnBuscarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAmigoMouseEntered
        this.mouseEntered(btnBuscarAmigo);
    }//GEN-LAST:event_btnBuscarAmigoMouseEntered

    private void btnBuscarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAmigoMouseExited
        this.mouseExited(btnBuscarAmigo);
    }//GEN-LAST:event_btnBuscarAmigoMouseExited

    private void btnActualizarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAmigoMouseEntered
        this.mouseEntered(btnActualizarAmigo);
    }//GEN-LAST:event_btnActualizarAmigoMouseEntered

    private void btnActualizarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAmigoMouseExited
        this.mouseExited(btnActualizarAmigo);
    }//GEN-LAST:event_btnActualizarAmigoMouseExited

    private void btnAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaDeMouseClicked
        JOptionPane.showMessageDialog(this, "Taller: \n - Directorio de amistades \n Asignatura: \n - POO \n Universidad: \n - UAM \n Desarrolladores: \n - Juan Sebastian Lopez \n - Cristian Camilo Salazar");
    }//GEN-LAST:event_btnAcercaDeMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAgregarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseClicked
        AgregarAmigo agregarAmigo = new AgregarAmigo(this, true, this.directorio, this);
        agregarAmigo.setVisible(true);
    }//GEN-LAST:event_btnAgregarAmigoMouseClicked

    private void btnEliminarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAmigoMouseClicked
        EliminarAmigo eliminarAmigo = new EliminarAmigo(this, true, this.directorio, this);
        eliminarAmigo.setVisible(true);
    }//GEN-LAST:event_btnEliminarAmigoMouseClicked

    private void btnBuscarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAmigoMouseClicked
        BuscarAmigo buscarAmigo = new BuscarAmigo(this, true, this.directorio, this);
        buscarAmigo.setVisible(true);
    }//GEN-LAST:event_btnBuscarAmigoMouseClicked

    private void btnActualizarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAmigoMouseClicked
        ActualizarAmigo actualizarAmigo = new ActualizarAmigo(this, true, this.directorio, this);
        actualizarAmigo.setVisible(true);
    }//GEN-LAST:event_btnActualizarAmigoMouseClicked

    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(132,206,253));
    }
    
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color(255,255,255));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JPanel btnActualizarAmigo;
    private javax.swing.JPanel btnAgregarAmigo;
    private javax.swing.JPanel btnBuscarAmigo;
    private javax.swing.JPanel btnEliminarAmigo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
