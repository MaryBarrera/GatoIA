package gato;
import javax.swing.*;

public class Modelo extends javax.swing.JFrame {
    
    /*Juego del gato donde se aplicará este modelo.*/
    private Gato gato;
    private JOptionPane mensaje;
    /*Datos del modelo.*/
    public final int HOMBREvsHOMBRE = 1;
    public final int HOMBREvsCOMPUTADORA = 2;
    public int tipo_juego = 0;
    public String nombre1, nombre2;
    
    /** Crea un nuevo Modelo */
    public Modelo( Gato gato ) {
        /*Iniciamos componentes visuales.*/
        initComponents();
        setVisible(true);
        mensaje = new JOptionPane();
        
        /*Asignamos el gato.*/
        this.gato = gato;
        
    }
    
    /*Método que recoje los datos.*/
    public boolean recojer(){

        /*Comprobamos que los campos estén llenos.*/
        if( this.txtJugador1.getText().equals("") ){
            mensaje.showMessageDialog(this,"Llene el nombre del jugador 1 por favor.","[X] Error:",JOptionPane.ERROR_MESSAGE);
            return false;   
        }
            
        
        /*Recojemos los valores.*/
        this.tipo_juego = ( this.hvsh.isSelected() ) ? HOMBREvsHOMBRE : HOMBREvsCOMPUTADORA;
        this.nombre1 = this.txtJugador1.getText();
        
        return true;
    }
    
    /*Método que envía los datos ( modelo ) al gato.*/
    public void enviarModelo(){
        gato.recojerModelo();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        hvsh = new javax.swing.JRadioButton();
        hvpc = new javax.swing.JRadioButton();
        img2 = new javax.swing.JLabel();
        opcionDos = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        setLocationByPlatform(true);
        setUndecorated(true);

        Grupo.add(hvsh);
        hvsh.setForeground(new java.awt.Color(153, 153, 153));
        hvsh.setText("Persona vs Persona");
        hvsh.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        hvsh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        hvsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hvshActionPerformed(evt);
            }
        });

        Grupo.add(hvpc);
        hvpc.setSelected(true);
        hvpc.setText("Persona vs Computadora");
        hvpc.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        hvpc.setMargin(new java.awt.Insets(0, 0, 0, 0));
        hvpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hvpcActionPerformed(evt);
            }
        });

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gato/images/pvspc.png"))); // NOI18N

        opcionDos.setText("Nombre Jugador");

        btnAceptar.setMnemonic(java.awt.event.KeyEvent.VK_ENTER);
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(btnAceptar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(btnCancelar))
                            .add(layout.createSequentialGroup()
                                .add(opcionDos)
                                .add(18, 18, 18)
                                .add(txtJugador1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(66, 66, 66)
                                .add(img2))))
                    .add(layout.createSequentialGroup()
                        .add(35, 35, 35)
                        .add(hvpc))
                    .add(layout.createSequentialGroup()
                        .add(55, 55, 55)
                        .add(hvsh)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(img2)
                .add(18, 18, 18)
                .add(hvsh)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(hvpc)
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(opcionDos)
                    .add(txtJugador1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAceptar)
                    .add(btnCancelar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        /*Recojemos los datos de los campos.*/
        if( recojer() ){
            /*Los enviamos al gato.*/
            enviarModelo();
            /*Cerramos esta ventana.*/
            dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void hvshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hvshActionPerformed
        
    }//GEN-LAST:event_hvshActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void hvpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hvpcActionPerformed
      
    }//GEN-LAST:event_hvpcActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton hvpc;
    private javax.swing.JRadioButton hvsh;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel opcionDos;
    private javax.swing.JTextField txtJugador1;
    // End of variables declaration//GEN-END:variables
    
}
