/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsaludtotal1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conectar.Conexion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MILTON
 */
public class user_in extends javax.swing.JPanel {

    /**
     * Creates new form user_in
     */
    public user_in() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        c = new javax.swing.JComboBox<>();
        boton = new javax.swing.JButton();
        e = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        cd = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        u = new javax.swing.JTextField();
        ct = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CEDULA = new javax.swing.JLabel();
        cd2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NOMBRE:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 83, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("APELLIDO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, 83, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("EDAD:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 83, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CARGO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 83, 25));
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 124, 22));
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 131, 124, -1));

        c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Enfermero", "Doctor", "Contabilidad" }));
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 113, -1));

        boton.setBackground(new java.awt.Color(0, 0, 0));
        boton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setText("INGRESAR");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 530, -1));

        e.setModel(new javax.swing.SpinnerNumberModel(18, 1, 200, 1));
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 58, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("CEDULA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 83, 25));
        jPanel1.add(cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 124, 22));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("USUARIO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CONTRASEÑA");

        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("INGRESAR");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTRO DE CUENTA");

        CEDULA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CEDULA.setText("CEDULA:");

        cd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cd2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CEDULA, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cd2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEDULA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cd2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 530, 170));

        jLabel9.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REGISTRO DE USUARIO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 254, 53));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
    if(!cd.getText().isEmpty()&&!n.getText().isEmpty()&&c.getSelectedItem()!=null)
     {Conexion conect= new Conexion();
      Connection conexion=(Connection) conect.getconection();
     PreparedStatement ps=null,ps2=null;
         try {
            ps2=(PreparedStatement) conexion.prepareStatement("insert into usuario (cedula,nombre,apellido,edad,cargo) values(?,?,?,?,?)");
            ps2.setString(1 ,cd.getText());
            ps2.setString(2 ,n.getText());
            ps2.setString(3, a.getText());
            ps2.setInt(4, (int) e.getValue());
            ps2.setString(5, String.valueOf(c.getSelectedItem()));
            ps2.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "USUARIO GUARDADO CORRECTAMENTE");
             // TODO add your handling code here:
         }catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nMALA CONEXION");
         }finally {try{ps2.close();} catch (Exception e){}
         {
            try{conexion.close();} catch (Exception e){}
            
         }
    }
     }else {JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");}        // TODO add your handling code here:
    }//GEN-LAST:event_botonActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
    if(!cd2.getText().isEmpty()&&!u.getText().isEmpty()&&!ct.getText().isEmpty())
     {Conexion conect= new Conexion();
      Connection conexion=(Connection) conect.getconection();
     String id = null;
     PreparedStatement ps=null,buscador=null;
     ResultSet dato = null;
         try {
            buscador= (PreparedStatement) conexion.prepareStatement("select * from usuario where cedula=?");
            buscador.setString(1,cd2.getText());
            dato=buscador.executeQuery();
            if(dato.next())
            {
            id=dato.getString("id_usuario");
            }
            ps=(PreparedStatement) conexion.prepareStatement("insert into cuenta (usuario,contraseña,id_usuario) values(?,?,?)");
            ps.setString(1 ,u.getText());
            ps.setString(2 ,ct.getText());
            ps.setString(3, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "CUENTA GUARDADA CORRECTAMENTE");
             // TODO add your handling code here:
         }catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nNO EXISTE USUARIO CON ESTA CEDULA");
         }finally {try{ps.close();} catch (Exception e){}
         {
            try{conexion.close();} catch (Exception e){}
            
         }
    }
     }else {JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");}          // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void cd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cd2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEDULA;
    private javax.swing.JTextField a;
    private javax.swing.JButton boton;
    private javax.swing.JButton boton1;
    private javax.swing.JComboBox<String> c;
    private javax.swing.JTextField cd;
    private javax.swing.JTextField cd2;
    private javax.swing.JTextField ct;
    private javax.swing.JSpinner e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField n;
    private javax.swing.JTextField u;
    // End of variables declaration//GEN-END:variables
}
