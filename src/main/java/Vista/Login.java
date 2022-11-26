
package Vista;

import Controlador.Controlador_Login;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_barra = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt_username = new javax.swing.JTextField();
        error_username = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        error_password = new javax.swing.JLabel();
        error_ingresar = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        panel_barra.setBackground(new java.awt.Color(255, 255, 255));
        panel_barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_username.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, 30));

        error_username.setBackground(new java.awt.Color(0, 0, 0));
        error_username.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(error_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 30));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, 30));
        jPanel1.add(error_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 200, 30));
        jPanel1.add(error_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, -1));

        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ingresar.setText("INGRESAR");
        jPanel1.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 200, 50));

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir_48.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 70, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 380, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Login login = new Login();
            Controlador_Login cl = new Controlador_Login(login);
            cl.ocultarErrores();
            login.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ingresar;
    public javax.swing.JButton btn_salir;
    public static javax.swing.JLabel error_ingresar;
    public static javax.swing.JLabel error_password;
    public static javax.swing.JLabel error_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_barra;
    public static javax.swing.JPasswordField txt_password;
    public static javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
