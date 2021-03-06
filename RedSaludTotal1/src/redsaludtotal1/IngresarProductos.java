/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsaludtotal1;

import HistoriaClinica.InterfazHc1;
import ingresarImagen.PintarImagen;
import conectar.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author alexm
 */
public class IngresarProductos extends javax.swing.JPanel {

    /**
     * Creates new form IngresarProductos
     */
     File archivo;
     java.sql.Date date2;
     String c;
    public IngresarProductos() {
        
        initComponents();
        obtenerCodigo();
        enviarCodigo();
    }
    public void limpiar()
{
    nombreP.setText(" ");
    precioP.setText(" ");
    fecha.setDate(null);
    cantidadP.setValue(0);
    descripcionP.setText(" ");
    panel.removeAll();
    panel.repaint();
}
        public void enviarCodigo()
    {
        char n='P';
        int numero=Integer.parseInt(c);
        if(numero<10)
        codigo.setText(n+"-000"+String.valueOf(numero));
        else if(numero>=10&&numero<100)
        codigo.setText(n+"-00"+String.valueOf(numero));
        else if(numero>=100&&numero<1000)
        codigo.setText(n+"-0"+String.valueOf(numero));
        else if(numero>=1000&&numero<10000)
        codigo.setText(n+"-"+String.valueOf(numero));
        
    }
public void obtenerCodigo()
{  PreparedStatement ps2=null;
    ResultSet rs=null;
    Conexion conect= new Conexion();
    Connection conexion=(Connection) conect.getconection();
    try {
    ps2=(PreparedStatement) conexion.prepareStatement("select count(*) from producto ");
    rs=ps2.executeQuery();
    if(rs.next())
    {
        c=rs.getString(1);
    }
        } catch (SQLException ex) {
            Logger.getLogger(InterfazHc1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {try{ps2.close();} catch (Exception e){}
            try{rs.close();} catch (Exception e){}
            try{conexion.close();} catch (Exception e){}
    }
}
public void obtenerDate() 
{
   date2=new java.sql.Date(fecha.getDate().getTime());
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        nombreP = new javax.swing.JTextField();
        precioP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionP = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cantidadP = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        codigo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("NOMBRE :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("PRECIO :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("FECHA CADUCIDAD :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("DESCRIPCION:");

        nombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePActionPerformed(evt);
            }
        });
        nombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrePKeyTyped(evt);
            }
        });

        precioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioPActionPerformed(evt);
            }
        });
        precioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioPKeyTyped(evt);
            }
        });

        descripcionP.setColumns(20);
        descripcionP.setRows(5);
        descripcionP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionPKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(descripcionP);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*maximo 90 caracteres*");

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("CANTIDAD :");

        cantidadP.setModel(new javax.swing.SpinnerNumberModel());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("CARGAR IMAGEN :");

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setText("P-0000");
        codigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreP)
                            .addComponent(precioP)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 81, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(cantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1))
                            .addComponent(nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     JFileChooser buscar =new JFileChooser();
     buscar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
FileNameExtensionFilter filtro =new FileNameExtensionFilter("*.jpg", "jpg");
FileNameExtensionFilter filtro2 =new FileNameExtensionFilter("*.png", "png");
FileNameExtensionFilter filtro3 =new FileNameExtensionFilter("*.jpeg", "jpeg");
buscar.setFileFilter(filtro);
buscar.setFileFilter(filtro2);
buscar.setFileFilter(filtro3);
int seleccion = buscar.showOpenDialog(this);
if(seleccion==JFileChooser.APPROVE_OPTION)
{
    archivo =buscar.getSelectedFile();
    String ruta=archivo.getAbsolutePath();
    int ancho=panel.getWidth();
    int alto=panel.getHeight();
    PintarImagen foto=new PintarImagen(ancho,alto,ruta);
    panel.add(foto);
    panel.repaint();
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   obtenerDate();
     if(!nombreP.getText().isEmpty()&&!precioP.getText().isEmpty()&&!descripcionP.getText().isEmpty()&&(int)cantidadP.getValue()>=0&&archivo!=null&&fecha!=null)
     {Conexion conect= new Conexion();
      Connection conexion=(Connection) conect.getconection();
     String id = null;
         
     PreparedStatement ps=null,ps2=null;
     ResultSet rs=null;
         try {
             System.out.println("BBB");
                FileInputStream archivoimg=new FileInputStream(archivo);
                ps2=(PreparedStatement) conexion.prepareStatement("insert into producto (nombre,precio,caducidad,descripcion,cantidad) values(?,?,?,?,?)");
                ps2.setString(1, nombreP.getText());
                ps2.setDouble(2, Double.parseDouble(precioP.getText()));
                ps2.setDate(3, date2);
                ps2.setString(4, descripcionP.getText());
                ps2.setInt(5, (int) cantidadP.getValue());
                ps2.executeUpdate();
                 System.out.println("AAAAA");
                ps2=(PreparedStatement) conexion.prepareStatement("select  id_producto from producto where nombre=?");
                ps2.setString(1, nombreP.getText());
                rs=ps2.executeQuery();
                if(rs.next()){
                    id=rs.getString("id_producto");
                }
                System.out.println("SIRVE");
                ps=(PreparedStatement) conexion.prepareStatement("insert into imagen_producto (imagen,id_producto) values(?,?)");
                ps.setBinaryStream(1, archivoimg,(int) archivo.length());
                ps.setString(2, id);
                ps.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "PRODUCTO GUARDADO CORRECTAMENTE");
             // TODO add your handling code here:
         } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nIMAGEN NO ENCONTRADA");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nMALA CONEXION");
         }finally {try{ps2.close();} catch (Exception e){}
         {try{ps.close();} catch (Exception e){}
            try{conexion.close();} catch (Exception e){}
            
         }
    }
          panel.removeAll();
        panel.repaint();
        limpiar();
     }else {JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePKeyTyped
     char caracter=evt.getKeyChar();
        if(Character.isLowerCase(caracter))
        {
        evt.setKeyChar(Character.toUpperCase(caracter));
        }
         char c =evt.getKeyChar();
   if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
       evt.consume();
   }
            // TODO add your handling code here:
    }//GEN-LAST:event_nombrePKeyTyped

    private void descripcionPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionPKeyTyped
   char caracter=evt.getKeyChar();
        if(Character.isLowerCase(caracter))
        {
        evt.setKeyChar(Character.toUpperCase(caracter));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionPKeyTyped

    private void precioPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioPKeyTyped
                                   
if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.' ){
            evt.consume();
  }        if(evt.getKeyChar()=='.'&&precioP.getText().contains(".")){
          evt.consume();
 }
        // TODO add your handling code here:
    }//GEN-LAST:event_precioPKeyTyped

    private void nombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePActionPerformed

    private void precioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner cantidadP;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextArea descripcionP;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreP;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField precioP;
    // End of variables declaration//GEN-END:variables
}
