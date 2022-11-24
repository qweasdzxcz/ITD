package Vista;

import Controlador.Controlador_Categoria;
import Controlador.Controlador_NuevaVenta;
import Controlador.Controlador_Producto;
import Vista.Usuario.formUsuario;
import Controlador.Controlador_Usuario;
import Vista.Producto.formProducto;
import Vista.Usuario.editUsuario;
import Vista.Producto.formProducto;
import Vista.Producto.editProducto;
import Vista.Ventas.BusquedaProducto;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
//        formUsuario f = new formUsuario(new javax.swing.JFrame(), true);
//        Controlador_Usuario cu = new Controlador_Usuario(this, f);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUsuario = new javax.swing.JPopupMenu();
        btn_editarUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btn_eliminarUsuario = new javax.swing.JMenuItem();
        popCategoria = new javax.swing.JPopupMenu();
        btn_editarCategoria = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btn_eliminarCategoria = new javax.swing.JMenuItem();
        popProducto = new javax.swing.JPopupMenu();
        btn_editarProducto = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btn_eliminarProducto = new javax.swing.JMenuItem();
        popNuevaVenta = new javax.swing.JPopupMenu();
        btn_eliminarPedido = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_datos = new javax.swing.JLabel();
        barraEmpresa = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();
        tabed = new javax.swing.JTabbedPane();
        panel_nuevasVentas = new javax.swing.JPanel();
        txt_cantidad = new javax.swing.JTextField();
        btn_buscarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        nuevaVentaTabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btn_generarVenta = new javax.swing.JButton();
        btn_buscarCliente = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_cliente = new javax.swing.JLabel();
        btn_agregarTabla = new javax.swing.JButton();
        lbl_stock = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbl_idProducto = new javax.swing.JLabel();
        panel_configuracion = new javax.swing.JPanel();
        panel_ventas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        panel_categorias = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        categoriaTabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreCat = new javax.swing.JTextField();
        error_estadoCat = new javax.swing.JLabel();
        error_nombreCat = new javax.swing.JLabel();
        cbx_estadoCat = new javax.swing.JComboBox<>();
        btn_actualizarCategoria = new javax.swing.JButton();
        btn_registrarCategoria = new javax.swing.JButton();
        lbl_idCategoria = new javax.swing.JLabel();
        panel_usuarios = new javax.swing.JPanel();
        btn_nuevoUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usuarioTabla = new javax.swing.JTable();
        txt_buscarUsuario = new javax.swing.JTextField();
        panel_productos = new javax.swing.JPanel();
        btn_nuevoProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productoTabla = new javax.swing.JTable();
        txt_buscarUsuario2 = new javax.swing.JTextField();
        panel_principal = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panel_menu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_usuarios = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        btn_categorias = new javax.swing.JButton();
        btn_nuevasVentas = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        btn_editarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_editarUsuario.setText("Editar");
        btn_editarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarUsuarioActionPerformed(evt);
            }
        });
        popUsuario.add(btn_editarUsuario);
        popUsuario.add(jSeparator1);

        btn_eliminarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_eliminarUsuario.setText("Eliminar");
        btn_eliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarUsuarioActionPerformed(evt);
            }
        });
        popUsuario.add(btn_eliminarUsuario);

        btn_editarCategoria.setText("Editar");
        popCategoria.add(btn_editarCategoria);
        popCategoria.add(jSeparator2);

        btn_eliminarCategoria.setText("Eliminar");
        popCategoria.add(btn_eliminarCategoria);

        btn_editarProducto.setText("Editar");
        popProducto.add(btn_editarProducto);
        popProducto.add(jSeparator3);

        btn_eliminarProducto.setText("Eliminar");
        popProducto.add(btn_eliminarProducto);

        btn_eliminarPedido.setText("Eliminar");
        popNuevaVenta.add(btn_eliminarPedido);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_datos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_datos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 200, 30));

        barraEmpresa.setBackground(new java.awt.Color(254, 242, 220));
        barraEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setText("Chosita Burguer");
        barraEmpresa.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(110, 73, 52));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("admin123");
        barraEmpresa.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 150, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraEmpresa.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 73, 52));
        jLabel11.setText("Administrador");
        barraEmpresa.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 140, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 73, 52));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("||");
        barraEmpresa.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 20, 30));

        btn_menu.setText("menu");
        barraEmpresa.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 30));

        jPanel2.add(barraEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));
        jPanel2.getAccessibleContext().setAccessibleName("");

        tabed.setBackground(new java.awt.Color(255, 255, 255));

        panel_nuevasVentas.setBackground(new java.awt.Color(255, 255, 255));
        panel_nuevasVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        panel_nuevasVentas.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 60, 30));

        btn_buscarProducto.setText("Buscar producto");
        panel_nuevasVentas.add(btn_buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stock");
        panel_nuevasVentas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 90, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cliente");
        panel_nuevasVentas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 80, 20));

        lbl_precio.setText("0");
        panel_nuevasVentas.add(lbl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 60, 30));

        nuevaVentaTabla.setBackground(new java.awt.Color(255, 255, 255));
        nuevaVentaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item", "nombre", "precio Unit", "cantidad", "precio total"
            }
        ));
        jScrollPane4.setViewportView(nuevaVentaTabla);

        panel_nuevasVentas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 680, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre");
        panel_nuevasVentas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 90, -1));

        btn_generarVenta.setText("Generar Venta");
        panel_nuevasVentas.add(btn_generarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 170, 50));

        btn_buscarCliente.setText("Buscar");
        panel_nuevasVentas.add(btn_buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, 30));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Total");
        panel_nuevasVentas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 80, 20));
        panel_nuevasVentas.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 556, 70, 40));
        panel_nuevasVentas.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 56, 180, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cantidad");
        panel_nuevasVentas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 90, -1));
        panel_nuevasVentas.add(lbl_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 210, 30));

        btn_agregarTabla.setText("Añadir");
        panel_nuevasVentas.add(btn_agregarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 100, 30));

        lbl_stock.setText("0");
        panel_nuevasVentas.add(lbl_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 70, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Precio");
        panel_nuevasVentas.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 90, -1));

        lbl_idProducto.setText("0");
        panel_nuevasVentas.add(lbl_idProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 50, 20));

        tabed.addTab("tab4", panel_nuevasVentas);

        panel_configuracion.setBackground(new java.awt.Color(255, 255, 255));
        tabed.addTab("tab7", panel_configuracion);

        panel_ventas.setBackground(new java.awt.Color(255, 255, 255));
        panel_ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Cliente", "Monto", "Fecha Venta"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        panel_ventas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 870, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Registro de Ventas");
        panel_ventas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 280, 40));

        tabed.addTab("tab6", panel_ventas);

        panel_categorias.setBackground(new java.awt.Color(255, 255, 255));
        panel_categorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoriaTabla.setBackground(new java.awt.Color(255, 255, 255));
        categoriaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "ESTADO"
            }
        ));
        categoriaTabla.setComponentPopupMenu(popCategoria);
        categoriaTabla.setRowHeight(30);
        categoriaTabla.setShowHorizontalLines(true);
        jScrollPane3.setViewportView(categoriaTabla);

        panel_categorias.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 60, 630, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Estado");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 30));

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVA CATEGORIA");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 60));

        txt_nombreCat.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_nombreCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, 30));

        error_estadoCat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_estadoCat.setForeground(new java.awt.Color(255, 51, 51));
        error_estadoCat.setText("Error");
        jPanel3.add(error_estadoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, -1));

        error_nombreCat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_nombreCat.setForeground(new java.awt.Color(255, 51, 51));
        error_nombreCat.setText("Error");
        jPanel3.add(error_nombreCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, 20));

        cbx_estadoCat.setBackground(new java.awt.Color(255, 255, 255));
        cbx_estadoCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbx_estadoCat.setSelectedIndex(-1);
        jPanel3.add(cbx_estadoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, 30));

        btn_actualizarCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btn_actualizarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_actualizarCategoria.setForeground(new java.awt.Color(255, 153, 102));
        btn_actualizarCategoria.setText("Actualizar");
        btn_actualizarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_actualizarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 100, 40));

        btn_registrarCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btn_registrarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrarCategoria.setForeground(new java.awt.Color(255, 153, 102));
        btn_registrarCategoria.setText("Registrar");
        btn_registrarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_registrarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 40));

        lbl_idCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(lbl_idCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 30));

        panel_categorias.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 320, 290));

        tabed.addTab("tab5", panel_categorias);

        panel_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_nuevoUsuario.setText("Nuevo Empleado");
        panel_usuarios.add(btn_nuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 160, 40));

        usuarioTabla.setBackground(new java.awt.Color(255, 255, 255));
        usuarioTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO P.", "APELLIDO M.", "DNI", "CELULAR", "USUARIO", "ROL", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuarioTabla.setComponentPopupMenu(popUsuario);
        usuarioTabla.setRowHeight(30);
        usuarioTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        usuarioTabla.setShowGrid(false);
        usuarioTabla.setShowHorizontalLines(true);
        usuarioTabla.getTableHeader().setResizingAllowed(false);
        usuarioTabla.getTableHeader().setReorderingAllowed(false);
        usuarioTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(usuarioTabla);
        if (usuarioTabla.getColumnModel().getColumnCount() > 0) {
            usuarioTabla.getColumnModel().getColumn(0).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(1).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(2).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(3).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(4).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(5).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(6).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(7).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(8).setResizable(false);
        }

        panel_usuarios.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 880, 460));

        txt_buscarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuarios.add(txt_buscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 380, 30));

        tabed.addTab("tab1", panel_usuarios);

        panel_productos.setBackground(new java.awt.Color(255, 255, 255));
        panel_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_nuevoProducto.setText("Nuevo Producto");
        panel_productos.add(btn_nuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 160, 40));

        productoTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(productoTabla);

        panel_productos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 830, -1));

        txt_buscarUsuario2.setBackground(new java.awt.Color(255, 255, 255));
        panel_productos.add(txt_buscarUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 380, 30));

        tabed.addTab("tab2", panel_productos);

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Productos");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 160, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("10");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 30));

        panel_principal.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, 100));

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("10");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ventas HOY");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 30));

        panel_principal.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 160, 100));

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Clientes");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("10");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 30));

        panel_principal.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 160, 100));

        tabed.addTab("tab3", panel_principal);

        jPanel1.add(tabed, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 1060, 680));

        panel_menu.setBackground(new java.awt.Color(255, 153, 102));
        panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Cerrar Sesion");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 30));

        btn_usuarios.setText("usuario");
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuariosActionPerformed(evt);
            }
        });
        panel_menu.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        btn_productos.setText("productos");
        btn_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 30));

        btn_categorias.setText("categoria");
        btn_categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 30));

        btn_nuevasVentas.setText("Nueva Venta");
        btn_nuevasVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_nuevasVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jButton6.setText("Ventas");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 30));

        jButton7.setText("Clientes");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 30));

        jButton8.setText("jButton1");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 120, 30));

        jButton9.setText("jButton1");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 120, 30));

        jPanel1.add(panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, 650));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuariosActionPerformed

    private void usuarioTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTablaMouseClicked

    }//GEN-LAST:event_usuarioTablaMouseClicked

    private void btn_editarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarUsuarioActionPerformed

    private void btn_eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarUsuarioActionPerformed

    private void btn_actualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarCategoriaActionPerformed

    private void btn_registrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal p = new Principal();
                formUsuario f = new formUsuario(new javax.swing.JFrame(), true);
                editUsuario e = new editUsuario(new javax.swing.JFrame(), true);
                formProducto fp = new formProducto(new javax.swing.JFrame(), true);
                editProducto ep = new editProducto(new javax.swing.JFrame(), true);
                BusquedaProducto busProducto = new BusquedaProducto(new javax.swing.JFrame(), true);
                
                Controlador_Usuario cu = new Controlador_Usuario(p, f, e);
                Controlador_Categoria cc = new Controlador_Categoria(p);
                Controlador_Producto cp = new Controlador_Producto(p, fp, ep);
                Controlador_NuevaVenta cnv = new Controlador_NuevaVenta(p, busProducto);
                cc.ocultarErrores();
                cu.ocultarErrores();
                cp.ocultarErrores();
                //cp.llenarCategoria();
                p.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraEmpresa;
    public javax.swing.JButton btn_actualizarCategoria;
    public javax.swing.JButton btn_agregarTabla;
    public javax.swing.JButton btn_buscarCliente;
    public javax.swing.JButton btn_buscarProducto;
    public javax.swing.JButton btn_categorias;
    public javax.swing.JMenuItem btn_editarCategoria;
    public javax.swing.JMenuItem btn_editarProducto;
    public javax.swing.JMenuItem btn_editarUsuario;
    public javax.swing.JMenuItem btn_eliminarCategoria;
    public javax.swing.JMenuItem btn_eliminarPedido;
    public javax.swing.JMenuItem btn_eliminarProducto;
    public javax.swing.JMenuItem btn_eliminarUsuario;
    public javax.swing.JButton btn_generarVenta;
    public javax.swing.JButton btn_menu;
    public javax.swing.JButton btn_nuevasVentas;
    public javax.swing.JButton btn_nuevoProducto;
    public javax.swing.JButton btn_nuevoUsuario;
    public javax.swing.JButton btn_productos;
    public javax.swing.JButton btn_registrarCategoria;
    public javax.swing.JButton btn_usuarios;
    public static javax.swing.JTable categoriaTabla;
    public static javax.swing.JComboBox<String> cbx_estadoCat;
    public static javax.swing.JLabel error_estadoCat;
    public static javax.swing.JLabel error_nombreCat;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTable jTable2;
    public static javax.swing.JLabel lbl_cliente;
    public static javax.swing.JLabel lbl_datos;
    public static javax.swing.JLabel lbl_idCategoria;
    public static javax.swing.JLabel lbl_idProducto;
    public static javax.swing.JLabel lbl_nombre;
    public static javax.swing.JLabel lbl_precio;
    public static javax.swing.JLabel lbl_stock;
    public static javax.swing.JLabel lbl_total;
    public static javax.swing.JTable nuevaVentaTabla;
    public static javax.swing.JPanel panel_categorias;
    private javax.swing.JPanel panel_configuracion;
    private javax.swing.JPanel panel_menu;
    public static javax.swing.JPanel panel_nuevasVentas;
    private javax.swing.JPanel panel_principal;
    public static javax.swing.JPanel panel_productos;
    public static javax.swing.JPanel panel_usuarios;
    private javax.swing.JPanel panel_ventas;
    private javax.swing.JPopupMenu popCategoria;
    private javax.swing.JPopupMenu popNuevaVenta;
    private javax.swing.JPopupMenu popProducto;
    private javax.swing.JPopupMenu popUsuario;
    public static javax.swing.JTable productoTabla;
    public static javax.swing.JTabbedPane tabed;
    private javax.swing.JTextField txt_buscarUsuario;
    private javax.swing.JTextField txt_buscarUsuario2;
    public static javax.swing.JTextField txt_cantidad;
    public static javax.swing.JTextField txt_nombreCat;
    public static javax.swing.JTable usuarioTabla;
    // End of variables declaration//GEN-END:variables
}
