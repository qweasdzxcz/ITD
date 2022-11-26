package Vista.Cliente;

import Controlador.Controlador_Cliente;
import Vista.Principal;

public class formCliente extends javax.swing.JDialog {

    public formCliente(java.awt.Frame parent, boolean modal) {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombreC = new javax.swing.JTextField();
        txt_paternoC = new javax.swing.JTextField();
        txt_maternoC = new javax.swing.JTextField();
        txt_celularC = new javax.swing.JTextField();
        btn_registrarCliente = new javax.swing.JButton();
        error_nombreC = new javax.swing.JLabel();
        error_paternoC = new javax.swing.JLabel();
        error_maternoC = new javax.swing.JLabel();
        error_celularC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO CLIENTE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Apellido P.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Apellido M.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Celular");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 30));

        txt_nombreC.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 200, 30));

        txt_paternoC.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_paternoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, 30));

        txt_maternoC.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_maternoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 200, 30));

        txt_celularC.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_celularC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 200, 30));

        btn_registrarCliente.setText("Registrar");
        jPanel1.add(btn_registrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 180, 50));

        error_nombreC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_nombreC.setForeground(new java.awt.Color(255, 51, 51));
        error_nombreC.setText("Error");
        jPanel1.add(error_nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, -1));

        error_paternoC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_paternoC.setForeground(new java.awt.Color(255, 51, 51));
        error_paternoC.setText("Error");
        jPanel1.add(error_paternoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, -1));

        error_maternoC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_maternoC.setForeground(new java.awt.Color(255, 51, 51));
        error_maternoC.setText("Error");
        jPanel1.add(error_maternoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 200, -1));

        error_celularC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_celularC.setForeground(new java.awt.Color(255, 51, 51));
        error_celularC.setText("Error");
        jPanel1.add(error_celularC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 421));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            formCliente dialog = new formCliente(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            Principal p = new Principal();
            editCliente ec = new editCliente(new javax.swing.JFrame(), true);
            Controlador_Cliente ccli = new Controlador_Cliente(p, dialog, ec);
            ccli.ocultarErrores();
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_registrarCliente;
    public static javax.swing.JLabel error_celularC;
    public static javax.swing.JLabel error_maternoC;
    public static javax.swing.JLabel error_nombreC;
    public static javax.swing.JLabel error_paternoC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField txt_celularC;
    public static javax.swing.JTextField txt_maternoC;
    public static javax.swing.JTextField txt_nombreC;
    public static javax.swing.JTextField txt_paternoC;
    // End of variables declaration//GEN-END:variables
}
