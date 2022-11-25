
package Vista.Cliente;

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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        error_direccion = new javax.swing.JLabel();
        error_nombre = new javax.swing.JLabel();
        error_paterno = new javax.swing.JLabel();
        error_materno = new javax.swing.JLabel();
        error_celular = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Direccion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Apellido P.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Apellido M.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Celular");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 30));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 200, 30));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 200, 30));

        txt_paterno.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, 30));

        txt_materno.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 200, 30));

        txt_celular.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 200, 30));

        btn_registrar.setText("Registrar");
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 180, 50));

        error_direccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_direccion.setForeground(new java.awt.Color(255, 51, 51));
        error_direccion.setText("Error");
        jPanel1.add(error_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 200, -1));

        error_nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_nombre.setForeground(new java.awt.Color(255, 51, 51));
        error_nombre.setText("Error");
        jPanel1.add(error_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, -1));

        error_paterno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_paterno.setForeground(new java.awt.Color(255, 51, 51));
        error_paterno.setText("Error");
        jPanel1.add(error_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, -1));

        error_materno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_materno.setForeground(new java.awt.Color(255, 51, 51));
        error_materno.setText("Error");
        jPanel1.add(error_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 200, -1));

        error_celular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_celular.setForeground(new java.awt.Color(255, 51, 51));
        error_celular.setText("Error");
        jPanel1.add(error_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 200, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

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
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_registrar;
    public static javax.swing.JLabel error_celular;
    public static javax.swing.JLabel error_direccion;
    public static javax.swing.JLabel error_materno;
    public static javax.swing.JLabel error_nombre;
    public static javax.swing.JLabel error_paterno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField txt_celular;
    public static javax.swing.JTextField txt_direccion;
    public static javax.swing.JTextField txt_materno;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JTextField txt_paterno;
    // End of variables declaration//GEN-END:variables
}
