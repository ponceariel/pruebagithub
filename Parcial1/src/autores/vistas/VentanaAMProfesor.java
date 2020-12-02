
package autores.vistas;

import Interfaces.IControladorAMProfesor;
import Interfaces.IControladorAutores;
import autores.controladores.ControladorAMAutores;
import autores.controladores.ControladorAMProfesor;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class VentanaAMProfesor extends javax.swing.JDialog {

   private IControladorAMProfesor controlProfe; 
   
    public VentanaAMProfesor(IControladorAMProfesor controladorP, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.controlProfe=controladorP;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txt_Documento = new javax.swing.JTextField();
        Txt_Apellido = new javax.swing.JTextField();
        Txt_Nombre = new javax.swing.JTextField();
        ComboBox_Cargo = new javax.swing.JComboBox<>();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        Txt_Clave = new javax.swing.JPasswordField();
        Txt_Repetir_Clave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setText("Documento:");

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel6.setText("Apellido:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setText("Cargo:");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setText("Calve:");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Repetir clave:");

        Txt_Documento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Txt_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DocumentoKeyTyped(evt);
            }
        });

        Txt_Apellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Txt_Apellido.setToolTipText("");
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

        ComboBox_Cargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ComboBox_Cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combobox(evt);
            }
        });

        BtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarProfesor(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarProfesor(evt);
            }
        });

        Txt_Clave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ClaveKeyTyped(evt);
            }
        });

        Txt_Repetir_Clave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Repetir_Clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_Repetir_ClaveKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Txt_Clave, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboBox_Cargo, javax.swing.GroupLayout.Alignment.LEADING, 0, 423, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Repetir_Clave)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_Cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Repetir_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarProfesor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarProfesor
        this.dispose();
        this.controlProfe.btnGuardarClic(evt); 
        IControladorAutores ap= new ControladorAMAutores();
    }//GEN-LAST:event_BtnGuardarProfesor

    private void BtnCancelarProfesor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarProfesor
        this.dispose();
        this.controlProfe.btnCancelarClic(evt);
    }//GEN-LAST:event_BtnCancelarProfesor

    private void Txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyTyped
        this.controlProfe.txtNombresPresionarTecla(evt);
    }//GEN-LAST:event_Txt_NombreKeyTyped

    private void Txt_DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DocumentoKeyTyped
        this.controlProfe.txtDocumentoPresionarTecla(evt);
    }//GEN-LAST:event_Txt_DocumentoKeyTyped

    private void Txt_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoKeyTyped
         this.controlProfe.txtApellidosPresionarTecla(evt);
    }//GEN-LAST:event_Txt_ApellidoKeyTyped

    private void Txt_ClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ClaveKeyTyped
          this.controlProfe.passClavePresionarTecla(evt);
    }//GEN-LAST:event_Txt_ClaveKeyTyped

    private void Txt_Repetir_ClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Repetir_ClaveKeyTyped
          this.controlProfe.passRepetirClavePresionarTecla(evt);
    }//GEN-LAST:event_Txt_Repetir_ClaveKeyTyped

    private void Combobox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combobox
           
    }//GEN-LAST:event_Combobox

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         IControladorAMProfesor Controlador_Profesor= new ControladorAMProfesor();
    }

    public JComboBox getComboBox_Cargo() {
        return ComboBox_Cargo;
    }

    public JTextField getTxt_Documento() {
        return Txt_Documento;
    }

    public JTextField getTxt_Apellido() {
        return Txt_Apellido;
    }

    public JTextField getTxt_Clave() {
        return Txt_Clave;
    }

    public JTextField getTxt_Nombre() {
        return Txt_Nombre;
    }

    public JTextField getTxt_Repetir_Clave() {
        return Txt_Repetir_Clave;
    }
    public void dniEnabled(boolean enabled){
        this.Txt_Documento.setEnabled(enabled);
    }

       
    public void setDni(String dni){
        this.Txt_Documento.setText(dni);
    }
    
    public void setApellidos(String apellidos){
        this.Txt_Apellido.setText(apellidos);
    }
    
    public void setNombres(String nombres){
        this.Txt_Nombre.setText(nombres);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<String> ComboBox_Cargo;
    private javax.swing.JTextField Txt_Apellido;
    private javax.swing.JPasswordField Txt_Clave;
    private javax.swing.JTextField Txt_Documento;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JPasswordField Txt_Repetir_Clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
