package Vista.Usuario;

import Controlador.Controlador_Usuario;
import Vista.Principal;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class editUsuario extends javax.swing.JDialog {

    public editUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        error_nombre = new javax.swing.JLabel();
        error_paterno = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        error_materno = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        error_dni = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        error_celular = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        error_rol = new javax.swing.JLabel();
        cbx_rol = new javax.swing.JComboBox<>();
        lbl_id = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbx_estado = new javax.swing.JComboBox<>();
        error_estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDITAR USUARIO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, 30));

        txt_paterno.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 200, 30));

        error_nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_nombre.setForeground(new java.awt.Color(255, 51, 51));
        error_nombre.setText("Error");
        jPanel1.add(error_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, -1));

        error_paterno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_paterno.setForeground(new java.awt.Color(255, 51, 51));
        error_paterno.setText("Error");
        jPanel1.add(error_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, -1));

        txt_materno.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 200, 30));

        error_materno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_materno.setForeground(new java.awt.Color(255, 51, 51));
        error_materno.setText("Error");
        jPanel1.add(error_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, -1));

        txt_dni.setBackground(new java.awt.Color(255, 255, 255));
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniKeyTyped(evt);
            }
        });
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 200, 30));

        error_dni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_dni.setForeground(new java.awt.Color(255, 51, 51));
        error_dni.setText("Error");
        jPanel1.add(error_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 200, -1));

        txt_celular.setBackground(new java.awt.Color(255, 255, 255));
        txt_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celularKeyTyped(evt);
            }
        });
        jPanel1.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 200, 30));

        error_celular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_celular.setForeground(new java.awt.Color(255, 51, 51));
        error_celular.setText("Error");
        jPanel1.add(error_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, -1));

        btn_actualizar.setBackground(new java.awt.Color(0, 0, 0));
        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 153, 102));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(null);
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.setFocusPainted(false);
        btn_actualizar.setFocusable(false);
        btn_actualizar.setRequestFocusEnabled(false);
        btn_actualizar.setRolloverEnabled(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 200, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nombre ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Apellido Paterno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Apellido Materno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("DNI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Celular");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Rol");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 30));

        error_rol.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_rol.setForeground(new java.awt.Color(255, 51, 51));
        error_rol.setText("Error");
        jPanel1.add(error_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 200, -1));

        cbx_rol.setBackground(new java.awt.Color(255, 255, 255));
        cbx_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor" }));
        cbx_rol.setSelectedIndex(-1);
        jPanel1.add(cbx_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 200, 30));

        lbl_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 60, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Estado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, 30));

        cbx_estado.setBackground(new java.awt.Color(255, 255, 255));
        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbx_estado.setSelectedIndex(-1);
        jPanel1.add(cbx_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 200, 30));

        error_estado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_estado.setForeground(new java.awt.Color(255, 51, 51));
        error_estado.setText("Error");
        jPanel1.add(error_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyTyped
        soloNumeros(txt_dni, 8, evt);
    }//GEN-LAST:event_txt_dniKeyTyped

    private void txt_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyTyped
        soloNumeros(txt_celular, 9, evt);
    }//GEN-LAST:event_txt_celularKeyTyped

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editUsuario dialog = new editUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                Principal p = new Principal();
                formUsuario f = new formUsuario(new javax.swing.JFrame(), true);
                Controlador_Usuario cu = new Controlador_Usuario(p, f, dialog);
                cu.ocultarErrores();
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    public static javax.swing.JComboBox<String> cbx_estado;
    public static javax.swing.JComboBox<String> cbx_rol;
    public static javax.swing.JLabel error_celular;
    public static javax.swing.JLabel error_dni;
    public static javax.swing.JLabel error_estado;
    public static javax.swing.JLabel error_materno;
    public static javax.swing.JLabel error_nombre;
    public static javax.swing.JLabel error_paterno;
    public static javax.swing.JLabel error_rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lbl_id;
    public static javax.swing.JTextField txt_celular;
    public static javax.swing.JTextField txt_dni;
    public static javax.swing.JTextField txt_materno;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JTextField txt_paterno;
    // End of variables declaration//GEN-END:variables

    public void soloNumeros(JTextField txt, int tamMax, KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (validar < '0' || validar > '9') {
            evt.consume();
        }
        if (Character.isDigit(validar)) {
            if (txt.getText().length() >= tamMax) {
                evt.consume();
            }
        }
    }
}
