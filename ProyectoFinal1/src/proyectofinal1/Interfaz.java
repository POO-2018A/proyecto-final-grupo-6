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
         
        ImageIcon image1=new ImageIcon(getClass().getResource("/Imagenes/fondo2.gif"));
        Icon fondo1=new ImageIcon (image1.getImage().getScaledInstance(lblFondo1.getWidth(),lblFondo1.getHeight(), Image.SCALE_DEFAULT));
        lblFondo1.setIcon(fondo1); 
        this.repaint();
        
        ImageIcon image2=new ImageIcon(getClass().getResource("/Imagenes/Seleccion.gif"));
        Icon fondo2=new ImageIcon (image2.getImage().getScaledInstance(lblFondo2.getWidth(),lblFondo2.getHeight(), Image.SCALE_DEFAULT));
        lblFondo2.setIcon(fondo2); 
        this.repaint();
        
         
        ImageIcon image5=new ImageIcon(getClass().getResource("/Imagenes/fondo1.gif"));
        Icon fondo5=new ImageIcon (image5.getImage().getScaledInstance(lblFondo5.getWidth(),lblFondo5.getHeight(), Image.SCALE_DEFAULT));
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

        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
 
        //realizamos una tabla cuando seleccionamos los personajes 
        String titulosColumnasItems[] = new String[]{
            "Personaje", "Usuario"
        };

        tblModelItems = new DefaultTableModel(items, titulosColumnasItems);
    

        tblModelItems2 = new DefaultTableModel(items2, titulosColumnasItems);

        tpnjuego.setSelectedIndex(4);
         
    


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpnjuego = new javax.swing.JTabbedPane();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnSelectP = new javax.swing.JButton();
        btnRegJ = new javax.swing.JButton();
        lblFondo5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        lblFondo1.setBounds(0, 0, 690, 410);

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
        jPanel2.add(btnJugador1);
        btnJugador1.setBounds(60, 250, 140, 23);

        btnJugador2.setText("SELECCIONAR");
        jPanel2.add(btnJugador2);
        btnJugador2.setBounds(380, 250, 150, 23);

        btnVolver1.setText("VOLVER A ELEGIR");
        jPanel2.add(btnVolver1);
        btnVolver1.setBounds(50, 290, 160, 23);

        btnVolver2.setText("VOLVER A ELEGIR");
        jPanel2.add(btnVolver2);
        btnVolver2.setBounds(360, 290, 190, 23);

        btnBatalla.setText("START");
        jPanel2.add(btnBatalla);
        btnBatalla.setBounds(220, 340, 120, 50);

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 110, 170, 110);

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(390, 110, 150, 110);

        lblFondo2.setText("jLabel3");
        jPanel2.add(lblFondo2);
        lblFondo2.setBounds(0, 0, 690, 410);

        tpnjuego.addTab("SELECCION PERSONAJES", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tpnjuego.addTab("BATALLA", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tpnjuego.addTab("ESTADISTICAS", jPanel4);

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
        lblFondo5.setBounds(0, 0, 690, 410);

        tpnjuego.addTab("VENTANA INICIAL", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpnjuego)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tpnjuego)
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
                ClsJugadores c= (ClsJugadores) mObj;
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
                JOptionPane.showMessageDialog(rootPane, "Ya existe Usuario o Cedula");
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
        limpiar() ;
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        if(jugadores.size()>1){
            tpnjuego.setSelectedIndex(1);
        }else{
            JOptionPane.showMessageDialog(rootPane,"Registre 2 jugadores");
        }

    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnSelectPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPActionPerformed
          if(jugadores.size()>1){
          tpnjuego.setSelectedIndex(1);
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Debe registrar 2 jugadores");
        }
    }//GEN-LAST:event_btnSelectPActionPerformed

    private void btnRegJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegJActionPerformed
         tpnjuego.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegJActionPerformed


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
            cmbJugadores.setEnabled(false);
        }
    }

    public void llenarComboJugador2() {
        if (jugadores.size() > 0) {
            cmbJugador2.setEnabled(true);
            jugadores = controller.extraerObjetos("player.dat");
            cmbJugador2.setModel(new javax.swing.DefaultComboBoxModel(jugadores.toArray()));
        } else {
            cmbJugadores.setEnabled(false);
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
    private javax.swing.JButton btnBatalla;
    private javax.swing.JButton btnJugador1;
    private javax.swing.JButton btnJugador2;
    private javax.swing.JButton btnRegJ;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JButton btnSelectP;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cmbJugador1;
    private javax.swing.JComboBox<String> cmbJugador2;
    private javax.swing.JComboBox<String> cmbJugadores;
    private javax.swing.JComboBox<String> cmbPersonajes1;
    private javax.swing.JComboBox<String> cmbPersonajes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblFondo5;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTabbedPane tpnjuego;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
