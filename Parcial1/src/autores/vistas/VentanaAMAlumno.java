/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.vistas;

import Interfaces.IControladorAMAlumno;
import Interfaces.IControladorAutores;
import autores.controladores.ControladorAMAlumno;
import autores.controladores.ControladorAMAutores;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author willz
 */
public class VentanaAMAlumno extends javax.swing.JDialog {
   
    private IControladorAMAlumno controlA;
    
    public VentanaAMAlumno(IControladorAMAlumno controladorAlumno, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.controlA=controladorAlumno;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txt_Documento = new javax.swing.JTextField();
        Txt_Apellido = new javax.swing.JTextField();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_CX = new javax.swing.JTextField();
        Txt_Clave = new javax.swing.JPasswordField();
        Txt_Clave_Repetida = new javax.swing.JPasswordField();
        btnGuardarAlumno = new javax.swing.JButton();
        btnCancelarAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setText("Documento:");

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel6.setText("Apellido:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setText("Calve:");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Repetir Clave:");

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel7.setText("CX:");

        Txt_Documento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Txt_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DocumentoKeyTyped(evt);
            }
        });

        Txt_Apellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Txt_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ApellidoKeyTyped(evt);
            }
        });

        Txt_Nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyTyped(evt);
            }
        });

        Txt_CX.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Txt_CX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_CXKeyTyped(evt);
            }
        });

        Txt_Clave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ClaveKeyTyped(evt);
            }
        });

        Txt_Clave_Repetida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Clave_Repetida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Clave_RepetidaKeyTyped(evt);
            }
        });

        btnGuardarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarAlumno.setText("Guardar");
        btnGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAlumnoActionPerformed(evt);
            }
        });

        btnCancelarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelarAlumno.setText("Cancelar");
        btnCancelarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txt_Documento)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(Txt_CX, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(Txt_Clave)
                    .addComponent(Txt_Clave_Repetida))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_CX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Clave_Repetida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DocumentoKeyTyped
        this.controlA.txtDocumentoPresionarTecla(evt);
    }//GEN-LAST:event_Txt_DocumentoKeyTyped

    private void Txt_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoKeyTyped
       this.controlA.txtApellidosPresionarTecla(evt);
    }//GEN-LAST:event_Txt_ApellidoKeyTyped

    private void Txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyTyped
        this.controlA.txtNombresPresionarTecla(evt);
    }//GEN-LAST:event_Txt_NombreKeyTyped

    private void Txt_CXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_CXKeyTyped
        this.controlA.txtCXPresionarTecla(evt);
    }//GEN-LAST:event_Txt_CXKeyTyped

    private void Txt_ClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ClaveKeyTyped
        this.controlA.passClavePresionarTecla(evt);
    }//GEN-LAST:event_Txt_ClaveKeyTyped

    private void Txt_Clave_RepetidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Clave_RepetidaKeyTyped
       this.controlA.passRepetirClavePresionarTecla(evt);
    }//GEN-LAST:event_Txt_Clave_RepetidaKeyTyped

    private void btnGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAlumnoActionPerformed
        this.dispose();
        this.controlA.btnGuardarClic(evt);
        IControladorAutores au= new ControladorAMAutores();
    }//GEN-LAST:event_btnGuardarAlumnoActionPerformed

    private void btnCancelarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlumnoActionPerformed
        this.dispose();
        this.controlA.btnCancelarClic(evt);
    }//GEN-LAST:event_btnCancelarAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        IControladorAMAlumno controladorAlumno= new ControladorAMAlumno();
    }

    public JTextField getTxt_Apellido() {
        return Txt_Apellido;
    }

    public JTextField getTxt_CX() {
        return Txt_CX;
    }

    public JPasswordField getTxt_Clave() {
        return Txt_Clave;
    }

    public JPasswordField getTxt_Repetir_Clave() {
        return Txt_Clave_Repetida;
    }

    public JTextField getTxt_Documento() {
        return Txt_Documento;
    }

    public JTextField getTxt_Nombre() {
        return Txt_Nombre;
    }
     public void dniEnabled(boolean enabled){
        this.Txt_Documento.setEnabled(enabled);
    }

    public void setDni(String dni){
        this.Txt_Documento.setText(dni);
    }
    public void setNombres(String nombres){
        this.Txt_Nombre.setText(nombres);
    }
    
    public void setApellidos(String apellidos){
        this.Txt_Apellido.setText(apellidos);
    }

    

    public void dniEnabledA(boolean enabled){
        this.Txt_Documento.setEnabled(enabled);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_Apellido;
    private javax.swing.JTextField Txt_CX;
    private javax.swing.JPasswordField Txt_Clave;
    private javax.swing.JPasswordField Txt_Clave_Repetida;
    private javax.swing.JTextField Txt_Documento;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JButton btnCancelarAlumno;
    private javax.swing.JButton btnGuardarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
