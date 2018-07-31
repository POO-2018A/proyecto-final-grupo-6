/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1;

import java.awt.Event;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    ArrayList<Object> jugadores = new ArrayList<>();// vamos a resivir objetos de jugadores
    int cont = 0;
    ClsControlador controller = new ClsControlador();//llamamos a la clase controlador

    //arreglo de string cuando seleccionemos un jugador 
    String items[][];
    DefaultTableModel tblModelItems;
    ArrayList<Items> listaItems = new ArrayList<Items>();

    String items2[][];
    DefaultTableModel tblModelItems2;
    ArrayList<Items> listaItems2 = new ArrayList<Items>();

    public Interfaz() {
        initComponents();

        ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/fondo2.gif"));
        Icon fondo1 = new ImageIcon(image1.getImage().getScaledInstance(lblFondo1.getWidth(), lblFondo1.getHeight(), Image.SCALE_DEFAULT));
        lblFondo1.setIcon(fondo1);
        this.repaint();

        ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/fondo5.jpg"));
        Icon fondo2 = new ImageIcon(image2.getImage().getScaledInstance(lblFondo2.getWidth(), lblFondo2.getHeight(), Image.SCALE_DEFAULT));
        lblFondo2.setIcon(fondo2);
        this.repaint();

        ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"));
        Icon fondo3 = new ImageIcon(image3.getImage().getScaledInstance(lblFondo3.getWidth(), lblFondo3.getHeight(), Image.SCALE_DEFAULT));
        lblFondo3.setIcon(fondo3);
        this.repaint();

        ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/fondo4.gif"));
        Icon fondo4 = new ImageIcon(image4.getImage().getScaledInstance(lblFondo4.getWidth(), lblFondo4.getHeight(), Image.SCALE_DEFAULT));
        lblFondo4.setIcon(fondo4);
        this.repaint();

        ImageIcon image5 = new ImageIcon(getClass().getResource("/Imagenes/fondo1.gif"));
        Icon fondo5 = new ImageIcon(image5.getImage().getScaledInstance(lblFondo5.getWidth(), lblFondo5.getHeight(), Image.SCALE_DEFAULT));
        lblFondo5.setIcon(fondo5);
        this.repaint();
        jugadores = controller.extraerObjetos("player.dat");//datos guardados en nuestro juego
        //llenamos combos y tablas con las funciones en el inferior
        llenarComboJugadores();
        llenarTablaJugadores();
        llenarComboJugador1();
        llenarComboJugador2();

        //tenemos una variable contadora de todos los jugadores que vamos ingresando
        if (jugadores.size() > 0) {
            ClsJugadores ultimo = (ClsJugadores) jugadores.get(jugadores.size() - 1);
            cont = ultimo.getId();
        }
        tpnjuego.setSelectedIndex(0);
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);

        btnBatalla.setEnabled(false);
        lblBatalla1.setEnabled(false);
        lblBatalla2.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpnjuego = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnSelectP = new javax.swing.JButton();
        btnRegJ = new javax.swing.JButton();
        lblFondo5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbJugadores = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        btnSeleccion = new javax.swing.JButton();
        lblFondo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbJugador1 = new javax.swing.JComboBox<>();
        cmbJugador2 = new javax.swing.JComboBox<>();
        cmbPersonajes1 = new javax.swing.JComboBox<>();
        cmbPersonajes2 = new javax.swing.JComboBox<>();
        btnJugador1 = new javax.swing.JButton();
        btnJugador2 = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        btnBatalla = new javax.swing.JButton();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lblPersonaje1 = new javax.swing.JLabel();
        lblPersonaje2 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNombre1Pelea = new javax.swing.JLabel();
        lblNombre2Pelea = new javax.swing.JLabel();
        lblBatalla1 = new javax.swing.JLabel();
        lblBatalla2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnAbanVol = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnAtaque1 = new javax.swing.JButton();
        btnAf1 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnAtaque2 = new javax.swing.JButton();
        btnD2 = new javax.swing.JButton();
        btnAf2 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        lblFondo3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolverSel = new javax.swing.JButton();
        btnVolverVen = new javax.swing.JButton();
        lblFondo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(null);

        btnSelectP.setText("SELECIONAR PERSONAJES");
        btnSelectP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPActionPerformed(evt);
            }
        });
        jPanel5.add(btnSelectP);
        btnSelectP.setBounds(220, 84, 240, 80);

        btnRegJ.setText("REGISTRAR NUEVO JUGADOR");
        btnRegJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegJActionPerformed(evt);
            }
        });
        jPanel5.add(btnRegJ);
        btnRegJ.setBounds(220, 220, 240, 90);
        jPanel5.add(lblFondo5);
        lblFondo5.setBounds(0, 0, 710, 470);

        tpnjuego.addTab("VENTANA INICIAL", jPanel5);

        jPanel1.setLayout(null);

        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 20, 70, 14);

        jLabel6.setText("APELLIDO");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 60, 70, 14);

        jLabel7.setText("CEDULA");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 100, 60, 14);

        jLabel8.setText("USUARIO");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 130, 70, 14);

        cmbJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugadoresActionPerformed(evt);
            }
        });
        jPanel1.add(cmbJugadores);
        cmbJugadores.setBounds(380, 20, 200, 20);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(130, 10, 120, 30);
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(130, 130, 120, 30);
        jPanel1.add(txtApellido);
        txtApellido.setBounds(130, 50, 120, 30);
        jPanel1.add(txtCedula);
        txtCedula.setBounds(130, 90, 120, 30);

        btnregistrar.setText("REGISTRAR");
        btnregistrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 51)));
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar);
        btnregistrar.setBounds(300, 130, 90, 40);

        btneliminar.setText("ELIMINAR");
        btneliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar);
        btneliminar.setBounds(400, 130, 90, 40);

        btnmodificar.setText("MODIFICAR");
        btnmodificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar);
        btnmodificar.setBounds(510, 130, 90, 40);

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "NOMBRE", "APELLIDO", "CEDULA", "USUARIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblJugadores);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 510, 130);

        btnSeleccion.setText("IR A SELECCION");
        btnSeleccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccion);
        btnSeleccion.setBounds(550, 230, 130, 17);
        jPanel1.add(lblFondo1);
        lblFondo1.setBounds(0, 0, 710, 460);

        tpnjuego.addTab("REGISTRO JUGADORES", jPanel1);

        jPanel2.setLayout(null);

        jPanel2.add(cmbJugador1);
        cmbJugador1.setBounds(20, 20, 220, 20);

        jPanel2.add(cmbJugador2);
        cmbJugador2.setBounds(360, 20, 230, 20);

        cmbPersonajes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOKU", "GOHAN", "VEGETA", "PICCOLO" }));
        jPanel2.add(cmbPersonajes1);
        cmbPersonajes1.setBounds(20, 60, 220, 20);

        cmbPersonajes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOKU", "GOHAN", "VEGETA", "PICCOLO" }));
        jPanel2.add(cmbPersonajes2);
        cmbPersonajes2.setBounds(360, 60, 230, 20);

        btnJugador1.setText("SELECCIONAR");
        btnJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnJugador1);
        btnJugador1.setBounds(50, 270, 140, 23);

        btnJugador2.setText("SELECCIONAR");
        btnJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnJugador2);
        btnJugador2.setBounds(440, 270, 150, 23);

        btnVolver1.setText("VOLVER A ELEGIR");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver1);
        btnVolver1.setBounds(40, 320, 160, 23);

        btnVolver2.setText("VOLVER A ELEGIR");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver2);
        btnVolver2.setBounds(410, 310, 190, 23);

        btnBatalla.setText("START");
        btnBatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatallaActionPerformed(evt);
            }
        });
        jPanel2.add(btnBatalla);
        btnBatalla.setBounds(250, 340, 120, 50);
        jPanel2.add(lblImagen1);
        lblImagen1.setBounds(20, 110, 230, 120);
        jPanel2.add(lblImagen2);
        lblImagen2.setBounds(370, 110, 220, 120);

        lblJugador1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblJugador1.setForeground(new java.awt.Color(0, 153, 51));
        lblJugador1.setText("PLAYER1");
        lblJugador1.setAlignmentX(0.1F);
        lblJugador1.setAlignmentY(0.1F);
        jPanel2.add(lblJugador1);
        lblJugador1.setBounds(270, 120, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("VS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(280, 170, 80, 30);

        lblJugador2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblJugador2.setForeground(new java.awt.Color(51, 153, 0));
        lblJugador2.setText("PLAYER2");
        jPanel2.add(lblJugador2);
        lblJugador2.setBounds(270, 220, 100, 30);

        lblPersonaje1.setBackground(new java.awt.Color(0, 0, 0));
        lblPersonaje1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPersonaje1.setForeground(new java.awt.Color(204, 0, 0));
        lblPersonaje1.setText("PERSONAJE 1");
        jPanel2.add(lblPersonaje1);
        lblPersonaje1.setBounds(50, 240, 130, 22);

        lblPersonaje2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPersonaje2.setForeground(new java.awt.Color(204, 0, 0));
        lblPersonaje2.setText("PERSONAJE 2");
        jPanel2.add(lblPersonaje2);
        lblPersonaje2.setBounds(460, 240, 130, 20);
        jPanel2.add(lblFondo2);
        lblFondo2.setBounds(0, 0, 710, 460);

        tpnjuego.addTab("SELECCION PERSONAJES", jPanel2);

        jPanel3.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("VIDA");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 10, 110, 20);

        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("ESTAMINA");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 40, 120, 20);

        jLabel9.setForeground(new java.awt.Color(102, 204, 255));
        jLabel9.setText("VIDA");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(564, 10, 70, 14);

        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("ESTAMINA");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(540, 50, 110, 14);

        lblNombre1Pelea.setText("jLabel11");
        jPanel3.add(lblNombre1Pelea);
        lblNombre1Pelea.setBounds(70, 70, 120, 20);

        lblNombre2Pelea.setText("jLabel11");
        jPanel3.add(lblNombre2Pelea);
        lblNombre2Pelea.setBounds(440, 80, 40, 14);
        jPanel3.add(lblBatalla1);
        lblBatalla1.setBounds(30, 110, 240, 140);
        jPanel3.add(lblBatalla2);
        lblBatalla2.setBounds(370, 110, 240, 130);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(30, 326, 320, 120);

        btnAbanVol.setText("ABANDONAR");
        btnAbanVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbanVolActionPerformed(evt);
            }
        });
        jPanel3.add(btnAbanVol);
        btnAbanVol.setBounds(360, 380, 100, 40);

        btnContinuar.setText("CONTINUAR");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel3.add(btnContinuar);
        btnContinuar.setBounds(510, 380, 130, 40);

        btnAtaque1.setText("ATAQUE");
        btnAtaque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAtaque1);
        btnAtaque1.setBounds(40, 260, 90, 23);

        btnAf1.setText("ATAQUE FINAL");
        btnAf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAf1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAf1);
        btnAf1.setBounds(150, 260, 110, 23);

        btnD1.setText("DEFENSA");
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnD1);
        btnD1.setBounds(40, 290, 90, 23);

        btnC1.setText("CURAR");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnC1);
        btnC1.setBounds(150, 290, 90, 23);

        btnAtaque2.setText("ATAQUE");
        btnAtaque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaque2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAtaque2);
        btnAtaque2.setBounds(410, 260, 90, 23);

        btnD2.setText("DEFENSA");
        btnD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnD2);
        btnD2.setBounds(410, 290, 90, 23);

        btnAf2.setText("ATAQUE FINAL");
        btnAf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAf2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAf2);
        btnAf2.setBounds(510, 260, 105, 23);

        btnC2.setText("CURAR");
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnC2);
        btnC2.setBounds(510, 290, 100, 20);
        jPanel3.add(lblFondo3);
        lblFondo3.setBounds(0, 0, 710, 460);

        tpnjuego.addTab("BATALLA", jPanel3);

        jPanel4.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "NOMBRE", "USUARIO", "VICTORIAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(113, 86, 492, 103);

        btnVolverSel.setText("VOLVER A JUGAR");
        btnVolverSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSelActionPerformed(evt);
            }
        });
        jPanel4.add(btnVolverSel);
        btnVolverSel.setBounds(159, 259, 185, 42);

        btnVolverVen.setText("SALIR");
        btnVolverVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverVenActionPerformed(evt);
            }
        });
        jPanel4.add(btnVolverVen);
        btnVolverVen.setBounds(381, 259, 140, 42);

        lblFondo4.setText("jLabel2");
        jPanel4.add(lblFondo4);
        lblFondo4.setBounds(0, 0, 710, 460);

        tpnjuego.addTab("ESTADISTICAS", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnjuego, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tpnjuego, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugadoresActionPerformed

        ClsJugadores jugadorSeleccionado = (ClsJugadores) cmbJugadores.getSelectedItem();
        txtNombre.setText(jugadorSeleccionado.getNombre());
        txtApellido.setText(jugadorSeleccionado.getApellido());
        txtCedula.setText(jugadorSeleccionado.getCedula());
        txtUsuario.setText(jugadorSeleccionado.getUsuario());

        btnmodificar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnregistrar.setEnabled(false);
    }//GEN-LAST:event_cmbJugadoresActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

        //llamamos los datos que necesitamos
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula = txtCedula.getText();
        String usuario = txtUsuario.getText();
        if (nombre.equals("") || apellido.equals("") || cedula.equals("") || usuario.equals("")) { //comparacion para que todos los campos esten llenos
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar todos los campos");
        } else {
            System.out.println("registra");
            cont++;
            ClsJugadores jugador = new ClsJugadores(cont, txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtUsuario.getText());
            boolean jugadorExistente = false;
            //hacemos la compracion que no vuelva a registrar un jugador con el mismo nombre de usuario
            for (Object mObj : jugadores) {
                ClsJugadores c = (ClsJugadores) mObj;
                if (c.getCedula().equals(jugador.getCedula())) {
                    jugadorExistente = true;
                    break;
                }
            }
            for (Object mObj : jugadores) {
                ClsJugadores m = (ClsJugadores) mObj;
                if (m.getUsuario().equals(jugador.getUsuario())) {
                    jugadorExistente = true;
                    break;
                }
            }
            if (!jugadorExistente) {
                jugadores.add(jugador);
                controller.escribirObjeto("player.dat", jugadores);
                jugadores = controller.extraerObjetos("player.dat");
                limpiar();
                llenarComboJugadores();
                llenarComboJugador1();
                llenarComboJugador2();
                Object jugadoresG[] = {jugador.getId(), jugador.getNombre(), jugador.getApellido(), jugador.getCedula(), jugador.getUsuario()};
                DefaultTableModel model = (DefaultTableModel) tblJugadores.getModel();
                model.addRow(jugadoresG);
                JOptionPane.showMessageDialog(rootPane, "Se registro exitosamente al jugador : " + jugador.getNombre() + " - " + jugador.getUsuario());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ya existe Usuario o Cedula REGISTRADA!");
            }
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        ClsJugadores jugadorSeleccionado = (ClsJugadores) cmbJugadores.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblJugadores.getModel();
        model.removeRow(cmbJugadores.getSelectedIndex());
        jugadores.remove(jugadorSeleccionado);
        controller.escribirObjeto("player.dat", jugadores);
        llenarComboJugadores();
        llenarComboJugador1();
        llenarComboJugador2();
        limpiar();
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        ClsJugadores jugadorSeleccionado = (ClsJugadores) cmbJugadores.getSelectedItem();
        jugadorSeleccionado.setNombre(txtNombre.getText());
        jugadorSeleccionado.setApellido(txtApellido.getText());
        jugadorSeleccionado.setCedula(txtCedula.getText());
        jugadorSeleccionado.setUsuario(txtUsuario.getText());
       
         System.out.println("registra");
            cont++;
            ClsJugadores jugador = new ClsJugadores(cont, txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtUsuario.getText());
            boolean jugadorExistente = false;
            //hacemos la compracion que no vuelva a registrar un jugador con el mismo nombre de usuario
            for (Object mObj : jugadores) {
                ClsJugadores c = (ClsJugadores) mObj;
                if (c.getCedula().equals(jugador.getCedula())) {
                    jugadorExistente = true;
                    break;
                }
            }
            for (Object mObj : jugadores) {
                ClsJugadores m = (ClsJugadores) mObj;
                if (m.getUsuario().equals(jugador.getUsuario())) {
                    jugadorExistente = true;
                    break;
                }
            }
            if (!jugadorExistente) {
        Object jugadoresG[] = {jugadorSeleccionado.getId(), jugadorSeleccionado.getNombre(), jugadorSeleccionado.getApellido(), jugadorSeleccionado.getCedula(), jugadorSeleccionado.getUsuario()};
        DefaultTableModel model = (DefaultTableModel) tblJugadores.getModel();
        model.removeRow(cmbJugadores.getSelectedIndex());
        jugadores.remove(cmbJugadores.getSelectedIndex());
        model.insertRow(cmbJugadores.getSelectedIndex(), jugadoresG);
        jugadores.add(cmbJugadores.getSelectedIndex(), jugadorSeleccionado);
        controller.escribirObjeto("player.dat", jugadores);
        llenarComboJugadores();
        llenarComboJugador1();
        llenarComboJugador2();
        limpiar();
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
            }else {
                JOptionPane.showMessageDialog(rootPane, "Ya existe Usuario o Cedula REGISTRADA!");
            }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        if (jugadores.size() > 1) {
            tpnjuego.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registre 2 jugadores");
        }

    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnSelectPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPActionPerformed
        if (jugadores.size() > 1) {
            tpnjuego.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe registrar 2 jugadores");
        }
    }//GEN-LAST:event_btnSelectPActionPerformed

    private void btnRegJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegJActionPerformed
        tpnjuego.setSelectedIndex(1);
    }//GEN-LAST:event_btnRegJActionPerformed

    private void btnJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador1ActionPerformed
        btnJugador1.setEnabled(true);
        String jugador1Seleccionado = "" + cmbJugador1.getSelectedItem().toString();
        String personajeSeleccionado = "" + cmbPersonajes1.getSelectedItem().toString();
        Items nuevoItem = new Items(personajeSeleccionado, jugador1Seleccionado);
        listaItems.add(nuevoItem);

        lblJugador1.setText(jugador1Seleccionado);

        if ("GOKU".equals(personajeSeleccionado)) {
            ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/goku.gif"));
            Icon fondo1 = new ImageIcon(image1.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_DEFAULT));
            lblImagen1.setIcon(fondo1);
            Icon batalla1 = new ImageIcon(image1.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla1);
            this.repaint();
            lblPersonaje1.setText(personajeSeleccionado);
            lblNombre1Pelea.setText(jugador1Seleccionado);
            btnJugador1.setEnabled(false);
            //btnBatalla.setEnabled(true);
        }
        if ("VEGETA".equals(personajeSeleccionado)) {
            ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/vegeta.gif"));
            Icon fondo2 = new ImageIcon(image2.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_DEFAULT));
            lblImagen1.setIcon(fondo2);
            Icon batalla2 = new ImageIcon(image2.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla2);
            this.repaint();
            lblPersonaje1.setText(personajeSeleccionado);
            lblNombre1Pelea.setText(jugador1Seleccionado);
            btnJugador1.setEnabled(false);
            //btnBatalla.setEnabled(true);
        }
        if ("GOHAN".equals(personajeSeleccionado)) {
            ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/gohan.gif"));
            Icon fondo3 = new ImageIcon(image3.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_DEFAULT));
            lblImagen1.setIcon(fondo3);
            Icon batalla3 = new ImageIcon(image3.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla3);
            this.repaint();
            lblPersonaje1.setText(personajeSeleccionado);
            lblNombre1Pelea.setText(jugador1Seleccionado);
            btnJugador1.setEnabled(false);
            // btnBatalla.setEnabled(true);
        }
        if ("PICCOLO".equals(personajeSeleccionado)) {
            ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/piccolo.gif"));
            Icon fondo4 = new ImageIcon(image4.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_DEFAULT));
            lblImagen1.setIcon(fondo4);
            Icon batalla4 = new ImageIcon(image4.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla4);
            this.repaint();
            lblPersonaje1.setText(personajeSeleccionado);
            lblNombre1Pelea.setText(jugador1Seleccionado);
            btnJugador1.setEnabled(false);
            // btnBatalla.setEnabled(true);
        }

        cmbJugador1.setEnabled(false);
        cmbPersonajes1.setEnabled(false);

    }//GEN-LAST:event_btnJugador1ActionPerformed

    private void btnBatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatallaActionPerformed
        lblBatalla1.setEnabled(true);
        lblBatalla2.setEnabled(true);
        tpnjuego.setSelectedIndex(3);
    }//GEN-LAST:event_btnBatallaActionPerformed

    private void btnJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador2ActionPerformed
        btnBatalla.setEnabled(false);
        String jugador2Seleccionado = "" + cmbJugador2.getSelectedItem().toString();
        String personajeSeleccionado = "" + cmbPersonajes2.getSelectedItem().toString();
        boolean verificacionJugador2 = true;
        Items nuevoItem = new Items(personajeSeleccionado, jugador2Seleccionado);
        listaItems2.add(nuevoItem);
        btnJugador2.setEnabled(false);

        if (verificacionJugador2 == true) {
            lblJugador2.setText(jugador2Seleccionado);
            if ("GOKU".equals(personajeSeleccionado)) {
                ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/goku.gif"));
                Icon fondo1 = new ImageIcon(image1.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_DEFAULT));
                lblImagen2.setIcon(fondo1);
                Icon batalla1 = new ImageIcon(image1.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
                lblBatalla2.setIcon(batalla1);
                this.repaint();
                lblPersonaje2.setText(personajeSeleccionado);
                lblNombre2Pelea.setText(jugador2Seleccionado);
                btnJugador2.setEnabled(false);
                btnBatalla.setEnabled(true);

            }
            if ("VEGETA".equals(personajeSeleccionado)) {
                ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/vegeta.gif"));
                Icon fondo2 = new ImageIcon(image2.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_DEFAULT));
                lblImagen2.setIcon(fondo2);
                Icon batalla2 = new ImageIcon(image2.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
                lblBatalla2.setIcon(batalla2);
                this.repaint();
                lblPersonaje2.setText(personajeSeleccionado);
                lblNombre2Pelea.setText(jugador2Seleccionado);
                btnJugador2.setEnabled(false);
                btnBatalla.setEnabled(true);

            }
            if ("GOHAN".equals(personajeSeleccionado)) {
                ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/gohan.gif"));
                Icon fondo3 = new ImageIcon(image3.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_DEFAULT));
                lblImagen2.setIcon(fondo3);
                Icon batalla3 = new ImageIcon(image3.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
                lblBatalla2.setIcon(batalla3);
                this.repaint();
                lblPersonaje2.setText(personajeSeleccionado);
                lblNombre2Pelea.setText(jugador2Seleccionado);
                btnJugador2.setEnabled(false);
                btnBatalla.setEnabled(true);
            }
            if ("PICCOLO".equals(personajeSeleccionado)) {
                ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/piccolo.gif"));
                Icon fondo4 = new ImageIcon(image4.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_DEFAULT));
                lblImagen2.setIcon(fondo4);
                Icon batalla4 = new ImageIcon(image4.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
                lblBatalla2.setIcon(batalla4);
                this.repaint();
                lblPersonaje2.setText(personajeSeleccionado);
                lblNombre2Pelea.setText(jugador2Seleccionado);
                btnJugador2.setEnabled(false);
                btnBatalla.setEnabled(true);

            }
            cmbJugador2.setEnabled(false);
            cmbPersonajes2.setEnabled(false);

        }
    }//GEN-LAST:event_btnJugador2ActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        cmbJugador1.setEnabled(true);
        cmbPersonajes1.setEnabled(true);
        btnJugador1.setEnabled(true);
        btnBatalla.setEnabled(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        cmbJugador2.setEnabled(true);
        cmbPersonajes2.setEnabled(true);
        btnJugador2.setEnabled(true);
        btnBatalla.setEnabled(false);

    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnVolverSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSelActionPerformed
        tpnjuego.setSelectedIndex(2);
    }//GEN-LAST:event_btnVolverSelActionPerformed

    private void btnVolverVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverVenActionPerformed
        tpnjuego.setSelectedIndex(0);
    }//GEN-LAST:event_btnVolverVenActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        tpnjuego.setSelectedIndex(4);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAbanVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbanVolActionPerformed
        tpnjuego.setSelectedIndex(2);
    }//GEN-LAST:event_btnAbanVolActionPerformed

    private void btnAtaque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque1ActionPerformed
        String personajeAtSeleccionado = "" + cmbPersonajes1.getSelectedItem().toString();
        if ("GOKU".equals(personajeAtSeleccionado)) {
            ImageIcon image11 = new ImageIcon(getClass().getResource("/Imagenes/ataque1.1.gif"));
            Icon batalla11 = new ImageIcon(image11.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla11);
            this.repaint();
        }
        if ("GOHAN".equals(personajeAtSeleccionado)) {
            ImageIcon image12 = new ImageIcon(getClass().getResource("/Imagenes/A2.gif"));
            Icon batalla12 = new ImageIcon(image12.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla12);
            this.repaint();

        }
        if ("VEGETA".equals(personajeAtSeleccionado)) {
            ImageIcon image13 = new ImageIcon(getClass().getResource("/Imagenes/A3.gif"));
            Icon batalla13 = new ImageIcon(image13.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla13);
            this.repaint();

        }
        if ("PICCOLO".equals(personajeAtSeleccionado)) {
            ImageIcon image14 = new ImageIcon(getClass().getResource("/Imagenes/A4.gif"));
            Icon batalla14 = new ImageIcon(image14.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla14);
            this.repaint();
        }
    }//GEN-LAST:event_btnAtaque1ActionPerformed

    private void btnAtaque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaque2ActionPerformed
        String personajeAt2Seleccionado = "" + cmbPersonajes2.getSelectedItem().toString();
        if ("GOKU".equals(personajeAt2Seleccionado)) {
            ImageIcon image11 = new ImageIcon(getClass().getResource("/Imagenes/ataque1.1gif"));
            Icon batalla11 = new ImageIcon(image11.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla11);
            this.repaint();

        }
        if ("GOHAN".equals(personajeAt2Seleccionado)) {
            ImageIcon image12 = new ImageIcon(getClass().getResource("/Imagenes/A2.gif"));
            Icon batalla12 = new ImageIcon(image12.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla12);
            this.repaint();

        }
        if ("VEGETA".equals(personajeAt2Seleccionado)) {
            ImageIcon image13 = new ImageIcon(getClass().getResource("/Imagenes/A3.gif"));
            Icon batalla13 = new ImageIcon(image13.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla13);
            this.repaint();

        }
        if ("PICCOLO".equals(personajeAt2Seleccionado)) {
            ImageIcon image14 = new ImageIcon(getClass().getResource("/Imagenes/A4.gif"));
            Icon batalla14 = new ImageIcon(image14.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla14);
            this.repaint();
        }
    }//GEN-LAST:event_btnAtaque2ActionPerformed

    private void btnAf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAf1ActionPerformed
        String personajeAFSeleccionado = "" + cmbPersonajes1.getSelectedItem().toString();
        if ("GOKU".equals(personajeAFSeleccionado)) {
            ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/AF1.gif"));
            Icon batalla1 = new ImageIcon(image1.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla1);
            this.repaint();

        }
        if ("GOHAN".equals(personajeAFSeleccionado)) {
            ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/AF2.gif"));
            Icon batalla2 = new ImageIcon(image2.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla2);
            this.repaint();

        }
        if ("VEGETA".equals(personajeAFSeleccionado)) {
            ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/AF3.gif"));
            Icon batalla3 = new ImageIcon(image3.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla3);
            this.repaint();

        }
        if ("PICCOLO".equals(personajeAFSeleccionado)) {
            ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/AF4.gif"));
            Icon batalla4 = new ImageIcon(image4.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla4);
            this.repaint();
        }
    }//GEN-LAST:event_btnAf1ActionPerformed

    private void btnAf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAf2ActionPerformed
        String personajeAF2Seleccionado = "" + cmbPersonajes2.getSelectedItem().toString();
        if ("GOKU".equals(personajeAF2Seleccionado)) {
            ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/AF1.gif"));
            Icon batalla1 = new ImageIcon(image1.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla1);
            this.repaint();

        }
        if ("GOHAN".equals(personajeAF2Seleccionado)) {
            ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/AF2.gif"));
            Icon batalla2 = new ImageIcon(image2.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla2);
            this.repaint();

        }
        if ("VEGETA".equals(personajeAF2Seleccionado)) {
            ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/AF3.gif"));
            Icon batalla3 = new ImageIcon(image3.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla3);
            this.repaint();

        }
        if ("PICCOLO".equals(personajeAF2Seleccionado)) {
            ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/AF4.gif"));
            Icon batalla4 = new ImageIcon(image4.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla4);
            this.repaint();
        }
    }//GEN-LAST:event_btnAf2ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed

        String personajeD1Seleccionado = "" + cmbPersonajes1.getSelectedItem().toString();
        if ("GOKU".equals(personajeD1Seleccionado)) {
            ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/D1.gif"));
            Icon batalla1 = new ImageIcon(image1.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla1);
            this.repaint();

        }
        if ("GOHAN".equals(personajeD1Seleccionado)) {
            ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/D2.gif"));
            Icon batalla2 = new ImageIcon(image2.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla2);
            this.repaint();

        }
        if ("VEGETA".equals(personajeD1Seleccionado)) {
            ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/D3.gif"));
            Icon batalla3 = new ImageIcon(image3.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla3);
            this.repaint();

        }
        if ("PICCOLO".equals(personajeD1Seleccionado)) {
            ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/D4.gif"));
            Icon batalla4 = new ImageIcon(image4.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla4);
            this.repaint();
        }
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2ActionPerformed
        String personajeD2Seleccionado = "" + cmbPersonajes2.getSelectedItem().toString();
        if ("GOKU".equals(personajeD2Seleccionado)) {
            ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/D1.gif"));
            Icon batalla1 = new ImageIcon(image1.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla1);
            this.repaint();

        }
        if ("GOHAN".equals(personajeD2Seleccionado)) {
            ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/D2.gif"));
            Icon batalla2 = new ImageIcon(image2.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla2);
            this.repaint();

        }
        if ("VEGETA".equals(personajeD2Seleccionado)) {
            ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/D3.gif"));
            Icon batalla3 = new ImageIcon(image3.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla3);
            this.repaint();

        }
        if ("PICCOLO".equals(personajeD2Seleccionado)) {
            ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/D4.gif"));
            Icon batalla4 = new ImageIcon(image4.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla4);
            this.repaint();
        }
    }//GEN-LAST:event_btnD2ActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        String personajeC1Seleccionado = "" + cmbPersonajes1.getSelectedItem().toString();
        if ("GOKU".equals(personajeC1Seleccionado)) {
            ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/C1.gif"));
            Icon batalla1 = new ImageIcon(image1.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla1);
            this.repaint();

        }
        if ("GOHAN".equals(personajeC1Seleccionado)) {
            ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/C2.gif"));
            Icon batalla2 = new ImageIcon(image2.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla2);
            this.repaint();

        }
        if ("VEGETA".equals(personajeC1Seleccionado)) {
            ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/C3.gif"));
            Icon batalla3 = new ImageIcon(image3.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla3);
            this.repaint();

        }
        if ("PICCOLO".equals(personajeC1Seleccionado)) {
            ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/C4.gif"));
            Icon batalla4 = new ImageIcon(image4.getImage().getScaledInstance(lblBatalla1.getWidth(), lblBatalla1.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla1.setIcon(batalla4);
            this.repaint();
        }
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        String personajeC2Seleccionado = "" + cmbPersonajes2.getSelectedItem().toString();
        if ("GOKU".equals(personajeC2Seleccionado)) {
            ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/C1.gif"));
            Icon batalla1 = new ImageIcon(image1.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla1);
            this.repaint();

        }
        if ("GOHAN".equals(personajeC2Seleccionado)) {
            ImageIcon image2 = new ImageIcon(getClass().getResource("/Imagenes/C2.gif"));
            Icon batalla2 = new ImageIcon(image2.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla2);
            this.repaint();

        }
        if ("VEGETA".equals(personajeC2Seleccionado)) {
            ImageIcon image3 = new ImageIcon(getClass().getResource("/Imagenes/C3.gif"));
            Icon batalla3 = new ImageIcon(image3.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla3);
            this.repaint();

        }
        if ("PICCOLO".equals(personajeC2Seleccionado)) {
            ImageIcon image4 = new ImageIcon(getClass().getResource("/Imagenes/C4.gif"));
            Icon batalla4 = new ImageIcon(image4.getImage().getScaledInstance(lblBatalla2.getWidth(), lblBatalla2.getHeight(), Image.SCALE_DEFAULT));
            lblBatalla2.setIcon(batalla4);
            this.repaint();
        }
    }//GEN-LAST:event_btnC2ActionPerformed

    public void limpiar() {
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCedula.setText(null);
        txtUsuario.setText(null);
        btnregistrar.setEnabled(true);
    }

    public void llenarComboJugadores() {
        if (jugadores.size() > 0) {
            cmbJugadores.setEnabled(true);
            jugadores = controller.extraerObjetos("player.dat");
            cmbJugadores.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        } else {
            cmbJugadores.setEnabled(false);
        }
    }

    public void llenarTablaJugadores() {
        if (jugadores.size() > 0) {
            ClsJugadores est = new ClsJugadores();
            DefaultTableModel model = (DefaultTableModel) tblJugadores.getModel();
            for (int i = 0; i < jugadores.size(); i++) {
                est = (ClsJugadores) jugadores.get(i);
                Object jugadoresG[] = {est.getId(), est.getNombre(), est.getApellido(), est.getCedula(), est.getUsuario()};
                model.insertRow(i, jugadoresG);
            }
        }
    }

    public void llenarComboJugador1() {
        if (jugadores.size() > 0) {
            cmbJugador1.setEnabled(true);
            jugadores = controller.extraerObjetos("player.dat");
            cmbJugador1.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        } else {
            cmbJugador1.setEnabled(false);
        }
    }

    public void llenarComboJugador2() {
        if (jugadores.size() > 0) {
            cmbJugador2.setEnabled(true);
            jugadores = controller.extraerObjetos("player.dat");
            cmbJugador2.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        } else {
            cmbJugador2.setEnabled(false);
        }
    }

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbanVol;
    private javax.swing.JButton btnAf1;
    private javax.swing.JButton btnAf2;
    private javax.swing.JButton btnAtaque1;
    private javax.swing.JButton btnAtaque2;
    private javax.swing.JButton btnBatalla;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnD2;
    private javax.swing.JButton btnJugador1;
    private javax.swing.JButton btnJugador2;
    private javax.swing.JButton btnRegJ;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JButton btnSelectP;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolverSel;
    private javax.swing.JButton btnVolverVen;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cmbJugador1;
    private javax.swing.JComboBox<String> cmbJugador2;
    private javax.swing.JComboBox<String> cmbJugadores;
    private javax.swing.JComboBox<String> cmbPersonajes1;
    private javax.swing.JComboBox<String> cmbPersonajes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBatalla1;
    private javax.swing.JLabel lblBatalla2;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblFondo3;
    private javax.swing.JLabel lblFondo4;
    private javax.swing.JLabel lblFondo5;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblNombre1Pelea;
    private javax.swing.JLabel lblNombre2Pelea;
    private javax.swing.JLabel lblPersonaje1;
    private javax.swing.JLabel lblPersonaje2;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTabbedPane tpnjuego;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
