
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogo_equipos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        texto_pais = new javax.swing.JTextField();
        texto_nombreEquipo = new javax.swing.JTextField();
        texto_ciudad = new javax.swing.JTextField();
        texto_estadio = new javax.swing.JTextField();
        boton_Agregar = new javax.swing.JButton();
        dialogo_jugadores = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        texto_nombreJugador = new javax.swing.JTextField();
        box_posicion = new javax.swing.JComboBox<>();
        spinner_edad = new javax.swing.JSpinner();
        boton_Agregar2 = new javax.swing.JButton();
        dialogo_transferir = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_jugadores = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton4 = new javax.swing.JButton();
        pop_menu = new javax.swing.JPopupMenu();
        menu_modificar = new javax.swing.JMenuItem();
        menu_borrar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        item_equipo = new javax.swing.JMenuItem();
        item_jugadores = new javax.swing.JMenuItem();
        item_transferencia = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        dialogo_equipos.setPreferredSize(new java.awt.Dimension(709, 498));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Crear equipos");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pais del equipo");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre del equipo");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ciudad");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Estadio");

        boton_Agregar.setText("Agregar");
        boton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texto_pais)
                            .addComponent(texto_nombreEquipo)
                            .addComponent(texto_ciudad)
                            .addComponent(texto_estadio, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(boton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addComponent(texto_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(texto_nombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(texto_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(texto_estadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(boton_Agregar)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogo_equiposLayout = new javax.swing.GroupLayout(dialogo_equipos.getContentPane());
        dialogo_equipos.getContentPane().setLayout(dialogo_equiposLayout);
        dialogo_equiposLayout.setHorizontalGroup(
            dialogo_equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogo_equiposLayout.setVerticalGroup(
            dialogo_equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogo_jugadores.setPreferredSize(new java.awt.Dimension(709, 498));

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Crear jugadores");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Edad");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Posicion");

        box_posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista ", "Delantero" }));
        box_posicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_posicionActionPerformed(evt);
            }
        });

        spinner_edad.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));

        boton_Agregar2.setText("Agregar");
        boton_Agregar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_Agregar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_Agregar2MouseEntered(evt);
            }
        });
        boton_Agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Agregar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_Agregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(box_posicion, 0, 174, Short.MAX_VALUE)
                                    .addComponent(texto_nombreJugador)
                                    .addComponent(spinner_edad))))))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(texto_nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(spinner_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(box_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(boton_Agregar2)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogo_jugadoresLayout = new javax.swing.GroupLayout(dialogo_jugadores.getContentPane());
        dialogo_jugadores.getContentPane().setLayout(dialogo_jugadoresLayout);
        dialogo_jugadoresLayout.setHorizontalGroup(
            dialogo_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogo_jugadoresLayout.setVerticalGroup(
            dialogo_jugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogo_transferir.setPreferredSize(new java.awt.Dimension(709, 498));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Transferencias");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 72, -1, -1));

        list_jugadores.setModel(new DefaultListModel());
        list_jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_jugadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_jugadores);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 174, 170, 236));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Equipos");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Jugadores");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jScrollPane3.setViewportView(jTree1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 172, 180, 240));

        jButton4.setText("Transferir ->");
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 258, -1, -1));

        javax.swing.GroupLayout dialogo_transferirLayout = new javax.swing.GroupLayout(dialogo_transferir.getContentPane());
        dialogo_transferir.getContentPane().setLayout(dialogo_transferirLayout);
        dialogo_transferirLayout.setHorizontalGroup(
            dialogo_transferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogo_transferirLayout.setVerticalGroup(
            dialogo_transferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu_modificar.setText("Modificar\n");
        menu_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_modificarActionPerformed(evt);
            }
        });
        pop_menu.add(menu_modificar);

        menu_borrar.setText("Eliminar");
        menu_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_borrarActionPerformed(evt);
            }
        });
        pop_menu.add(menu_borrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jToolBar1.setRollover(true);

        jButton1.setText("Crear equipos");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Crear jugadores");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setText("Transferir");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido a Boroa League Fantasy");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UfZaJ-b__400x400.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 153, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones");

        item_equipo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        item_equipo.setText("Crear equipos");
        item_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_equipoActionPerformed(evt);
            }
        });
        jMenu1.add(item_equipo);

        item_jugadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        item_jugadores.setText("Crear jugadores");
        item_jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_jugadoresActionPerformed(evt);
            }
        });
        jMenu1.add(item_jugadores);

        item_transferencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        item_transferencia.setText("Transferencias");
        item_transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_transferenciaActionPerformed(evt);
            }
        });
        jMenu1.add(item_transferencia);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_transferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_transferenciaActionPerformed
        // TODO add your handling code here:
        dialogo_transferir.pack();
        dialogo_transferir.setResizable(false);
        dialogo_transferir.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_item_transferenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_AgregarActionPerformed

    private void box_posicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_posicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_posicionActionPerformed

    private void boton_Agregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Agregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_Agregar2ActionPerformed

    private void item_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_equipoActionPerformed
        // TODO add your handling code here:

        dialogo_equipos.pack();
        dialogo_equipos.setResizable(false);
        dialogo_equipos.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_item_equipoActionPerformed

    private void item_jugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_jugadoresActionPerformed
        // TODO add your handling code here:

        dialogo_jugadores.pack();
        dialogo_jugadores.setResizable(false);
        dialogo_jugadores.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_item_jugadoresActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dialogo_equipos.pack();
        dialogo_equipos.setResizable(false);
        dialogo_equipos.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        dialogo_jugadores.pack();
        dialogo_jugadores.setResizable(false);
        dialogo_jugadores.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dialogo_transferir.pack();
        dialogo_transferir.setResizable(false);
        dialogo_transferir.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void boton_Agregar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_Agregar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_Agregar2MouseEntered

    private void boton_Agregar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_Agregar2MouseClicked
        // TODO add your handling code here:
        //REVISAR QUE NO ESTE VACIO
        if (texto_nombreJugador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(dialogo_jugadores, "Llene todos los campos");
        } else {

            //TOMAR EL MODELO DE LA LISTA
            DefaultListModel model = (DefaultListModel) list_jugadores.getModel();

            //AGREGAR A LA LISTA
            model.addElement(new Jugador(texto_nombreJugador.getText(),
                    (Integer) spinner_edad.getValue(),
                    (String) box_posicion.getSelectedItem()));

            //MANDAR LOS DATOS AL MODELO
            list_jugadores.setModel(model);

            //LIMPIAR
            texto_nombreJugador.setText("");
            spinner_edad.setValue(15);
            box_posicion.setSelectedIndex(0);
            JOptionPane.showMessageDialog(dialogo_jugadores, "El jugador se agrego exitosamente.");
        }
    }//GEN-LAST:event_boton_Agregar2MouseClicked

    private void list_jugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_jugadoresMouseClicked
        // TODO add your handling code here:

        if (list_jugadores.getSelectedIndex() >= 0) {
            if (evt.getButton() == 3) {
                pop_menu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_list_jugadoresMouseClicked

    private void menu_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_modificarActionPerformed
        // TODO add your handling code here:
        if (list_jugadores.getSelectedIndex() >= 0) {
            DefaultListModel modelList = (DefaultListModel) list_jugadores.getModel();
            
            ((Jugador) modelList.get(list_jugadores.getSelectedIndex()))
                    .setNombre(JOptionPane.showInputDialog("Ingrese nuevo nombre: ")
                    );
            ((Jugador) modelList.get(list_jugadores.getSelectedIndex()))
                    .setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva edad: "))
                    );
            ((Jugador) modelList.get(list_jugadores.getSelectedIndex()))
                    .setPosicion(JOptionPane.showInputDialog("Ingrese nueva posicion: ")
                    );
            
            list_jugadores.setModel(modelList);
        }
    }//GEN-LAST:event_menu_modificarActionPerformed

    private void menu_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_borrarActionPerformed
        // TODO add your handling code here:
        
        if (list_jugadores.getSelectedIndex() >= 0) {
            DefaultListModel mode = (DefaultListModel) list_jugadores.getModel();
            mode.remove(list_jugadores.getSelectedIndex());
            list_jugadores.setModel(mode);
            JOptionPane.showMessageDialog(dialogo_transferir, "Jugador eliminado exitosamente.");
        }
    }//GEN-LAST:event_menu_borrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Agregar;
    private javax.swing.JButton boton_Agregar2;
    private javax.swing.JComboBox<String> box_posicion;
    private javax.swing.JDialog dialogo_equipos;
    private javax.swing.JDialog dialogo_jugadores;
    private javax.swing.JDialog dialogo_transferir;
    private javax.swing.JMenuItem item_equipo;
    private javax.swing.JMenuItem item_jugadores;
    private javax.swing.JMenuItem item_transferencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTree1;
    private javax.swing.JList<String> list_jugadores;
    private javax.swing.JMenuItem menu_borrar;
    private javax.swing.JMenuItem menu_modificar;
    private javax.swing.JPopupMenu pop_menu;
    private javax.swing.JSpinner spinner_edad;
    private javax.swing.JTextField texto_ciudad;
    private javax.swing.JTextField texto_estadio;
    private javax.swing.JTextField texto_nombreEquipo;
    private javax.swing.JTextField texto_nombreJugador;
    private javax.swing.JTextField texto_pais;
    // End of variables declaration//GEN-END:variables
}
