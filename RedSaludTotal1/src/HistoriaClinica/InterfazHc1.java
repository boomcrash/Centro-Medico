/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistoriaClinica;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conectar.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import redsaludtotal1.IngresarProductos;
import redsaludtotal1.ModificarProductos;

/**
 *
 * @author alexm
 */
public class InterfazHc1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterfazHc1
     */int i=0;String fecha,horae; 
    public InterfazHc1() {
        initComponents();
          canton.setEnabled(false);
       
    }
  public void llenarCiudades()
    {canton.removeAllItems();
        if(provincias.getSelectedItem().equals("AZUAY"))
        {
            canton.addItem("Cuenca");canton.addItem("Gualaceo");canton.addItem("Paute");canton.addItem("Sigsig");canton.addItem("Girón");
            canton.addItem("San Fernando");canton.addItem("Santa Isabel");canton.addItem("Pucará");canton.addItem("Nabón");
        }else if(provincias.getSelectedItem().equals("GALAPAGOS"))
        {
            canton.addItem("Isabela");canton.addItem("Santa Cruz");canton.addItem("Puerto Baquerizo Moreno");canton.addItem("Puerto Ayora");
        }else if(provincias.getSelectedItem().equals("CAÑAR"))
        {
            canton.addItem("Cañar");canton.addItem("Biblián");canton.addItem("Azogue");canton.addItem("La Troncal");
        }else if(provincias.getSelectedItem().equals("BOLIVAR"))
        {
            canton.addItem("Guaranda");canton.addItem("San Miguel de Bolívar");canton.addItem("Caluma");canton.addItem("Chillanes");canton.addItem("Echeandía");
            canton.addItem("Chimbo");canton.addItem("SLa Asunción");canton.addItem("La Magdalena");
        }else if(provincias.getSelectedItem().equals("CARCHI"))
        {
            canton.addItem("Mira");canton.addItem("BOLIVAR");canton.addItem("Tulcán");canton.addItem("El Angel");canton.addItem("Huaca");
            canton.addItem("Julio Andrade");canton.addItem("La Paz");canton.addItem("San Gabriel");
        }else if(provincias.getSelectedItem().equals("CHIMBORAZO"))
        {
            canton.addItem("Riobamba");canton.addItem("Guano");canton.addItem("Chambo");canton.addItem("Colta");canton.addItem("Penipe");
            canton.addItem("Guamote");canton.addItem("Pallatanga");canton.addItem("Alausí");canton.addItem("Chunchi");
            canton.addItem("Cumandá");canton.addItem("Cajabamba");canton.addItem("Huigra");canton.addItem("San Andrés");canton.addItem("San Juan");
        }else if(provincias.getSelectedItem().equals("COTOPAXI"))
        {
            canton.addItem("Saquisilí");canton.addItem("Latacunga");canton.addItem("Pujilí");canton.addItem("Salcedo");canton.addItem("Sigchos");
            canton.addItem("La Maná");canton.addItem("Chantillin");canton.addItem("El Corazón");canton.addItem("Guaytacama");canton.addItem("Lasso");
            canton.addItem("Pastocalle");canton.addItem("Poalo");canton.addItem("Tanicuchi");canton.addItem("Toacaso");canton.addItem("Mulalo");
        }else if(provincias.getSelectedItem().equals("EL ORO"))
        {
            canton.addItem("El Guabo");canton.addItem("Huaquillas");canton.addItem("Machala");canton.addItem("Pasaje");canton.addItem("Piñas");
            canton.addItem("Puerto Bolivar");canton.addItem("Santa Rosa");canton.addItem("Zaruma");canton.addItem("Portovelo");
                    canton.addItem("Arenillas");canton.addItem("Atahualpa");canton.addItem("Balsas");canton.addItem("Chilla");canton.addItem("Marcabeli");
        }else if(provincias.getSelectedItem().equals("ESMERALDAS"))
        {
            canton.addItem("Esmeraldas");
        }else if(provincias.getSelectedItem().equals("GUAYAS"))
        {
            canton.addItem("Guayaquil");canton.addItem("Daule");canton.addItem("Duran");canton.addItem("El Empalme");
        }else if(provincias.getSelectedItem().equals("SANTA ELENA"))
        {
            canton.addItem("Santa Elena");canton.addItem("La Libertad");canton.addItem("Salinas");
        }else if(provincias.getSelectedItem().equals("LOJA"))
        {
            canton.addItem("Loja");canton.addItem("Macara");canton.addItem("Catamayo");canton.addItem("Cariamanga");canton.addItem("Celica");
        }else if(provincias.getSelectedItem().equals("MORONA SANTIAGO"))
        {
            canton.addItem("Macas");canton.addItem("Gualaquiza");canton.addItem("Limon Indanza");canton.addItem("Santiago");canton.addItem("Sucua");
        }else if(provincias.getSelectedItem().equals("IMBABURA"))
        {
            canton.addItem("Ibarra");canton.addItem("Ambuqui");canton.addItem("Atuntaqui");canton.addItem("Cotacachi");canton.addItem("Otavalo");
        }else if(provincias.getSelectedItem().equals("LOS RIOS"))
        {
            canton.addItem("Babahoyo");canton.addItem("Buena Fe");canton.addItem("Puebloviejo");canton.addItem("Quevedo");canton.addItem("Ventanas");
        }else if(provincias.getSelectedItem().equals("MANABI"))
        {
            canton.addItem("Portoviejo");canton.addItem("Bahia De Caraquez");canton.addItem("Chone");canton.addItem("El Carmen");canton.addItem("Jipijapa");
        }else if(provincias.getSelectedItem().equals("NAPO"))
        {
            canton.addItem("Tena");canton.addItem("Archidona");canton.addItem("Baeza");canton.addItem("El Chaco");canton.addItem("Carlos Julio Arosemena Tola");
        }else if(provincias.getSelectedItem().equals("ORELLANA"))
        {
            canton.addItem("Francisco De Orellana");canton.addItem("La Joya De Los Sachas");canton.addItem("Loreto");canton.addItem("Nueva Rocafuerte");
        }else if(provincias.getSelectedItem().equals("PASTAZA"))
        {
            canton.addItem("Puyo");canton.addItem("Mera");canton.addItem("Palora");canton.addItem("Shell");canton.addItem("Arajuno");
        }else if(provincias.getSelectedItem().equals("SANTO DOMINGO"))
        {
            canton.addItem("Santo Domingo");canton.addItem("Alluriquin");canton.addItem("Luz De América");canton.addItem("Valle Hermoso");
        }else if(provincias.getSelectedItem().equals("PICHINCHA"))
        {
            canton.addItem("Quito");canton.addItem("Cayambe");canton.addItem("Conocoto");canton.addItem("Cumbaya");canton.addItem("Machachi");
        }else if(provincias.getSelectedItem().equals("SUCUMBIOS"))
        {
            canton.addItem("Nueva Loja");canton.addItem("Gonzalo Pizarro");canton.addItem("Putumayo");canton.addItem("Shushufindi");canton.addItem("Sucumbios");
        }else if(provincias.getSelectedItem().equals("TUNGURAHUA"))
        {
            canton.addItem("Ambato");canton.addItem("Baños");canton.addItem("Cevallos");canton.addItem("Izamba");canton.addItem("Mocha");
        }else if(provincias.getSelectedItem().equals("ZAMORA CHINCHIPE"))
        {
            canton.addItem("Zamora");canton.addItem("Chinchipe");canton.addItem("Nangaritza");canton.addItem("Yacuambi");canton.addItem("Yantzaza");
        }
    }
   public void enviarCodigo()
    {
        int y=00000;
        char n='N';
        int numero=y+i+1;
        if(numero<10)
        codigo.setText(n+"-0000"+String.valueOf(numero));
        else if(numero>=10&&numero<100)
        codigo.setText(n+"-000"+String.valueOf(numero));
        else if(numero>=100&&numero<1000)
        codigo.setText(n+"-00"+String.valueOf(numero));
        else if(numero>=1000&&numero<10000)
        codigo.setText(n+"-0"+String.valueOf(numero));
        
    }
   public void obtenerCodigo()
{
    try {
    PreparedStatement ps2=null;
    ResultSet rs=null;
    Conexion conect= new Conexion();
    Connection conexion=(Connection) conect.getconection();
    ps2=(PreparedStatement) conexion.prepareStatement("select * from paciente ");
    rs=ps2.executeQuery();
    while(rs.next())
    {
        i++;
    }
        } catch (SQLException ex) {
            Logger.getLogger(InterfazHc1.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public void obtenerFecha()
    {
        Calendar data=new GregorianCalendar();
        int dia=data.get(Calendar.DAY_OF_MONTH);
                int mes=data.get(Calendar.MONTH)+1;
                        int anio=data.get(Calendar.YEAR);
                                int hora=data.get(Calendar.HOUR_OF_DAY);
                                        int minutos=data.get(Calendar.MINUTE);
        fecha=String.valueOf(dia)+"-"+String.valueOf(mes)+"-"+String.valueOf(anio);
        horae=String.valueOf(hora)+" : "+String.valueOf(minutos);                                  
    }
    public void reactivar()
    {
        uno.setEnabled(true);dos.setEnabled(true);tres.setEnabled(true);cuatro.setEnabled(true);
        cinco.setEnabled(true);seis.setEnabled(true);siete.setEnabled(true);ocho.setEnabled(true);
        nueve.setEnabled(true);diez.setEnabled(true);once.setEnabled(true);doce.setEnabled(true);
        trece.setEnabled(true);catorce.setEnabled(true);quince.setEnabled(true);
    }
      public void limpiar()
    {
        nombres.setText(" ");
        apellidos.setText(" ");
        cedula.setText(" ");
        telefono.setText(" ");
        direccion.setText(" ");
        celular.setText(" ");
        motivo.setText(" ");
        edad.setValue(0);
        altura.setValue(0);
        peso.setValue(0);
        canton.removeAllItems();
        ap.setText(" ");
        af.setText(" ");
        medicacion.setText(" ");
        tratamiento.setText(" ");
        medico.setText(" ");
        ape.setText(" ");
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
        codigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edad = new javax.swing.JSpinner();
        genero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        provincias = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        canton = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        altura = new javax.swing.JSpinner();
        peso = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        celular = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        af = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        ape = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ap = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        motivo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        medicacion = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tratamiento = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        dos = new javax.swing.JCheckBox();
        uno = new javax.swing.JCheckBox();
        cinco = new javax.swing.JCheckBox();
        cuatro = new javax.swing.JCheckBox();
        siete = new javax.swing.JCheckBox();
        nueve = new javax.swing.JCheckBox();
        once = new javax.swing.JCheckBox();
        diez = new javax.swing.JCheckBox();
        tres = new javax.swing.JCheckBox();
        seis = new javax.swing.JCheckBox();
        ocho = new javax.swing.JCheckBox();
        doce = new javax.swing.JCheckBox();
        quince = new javax.swing.JCheckBox();
        catorce = new javax.swing.JCheckBox();
        trece = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        medico = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigo.setText("N-0000");
        codigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 0, -1, 33));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("# Historia Clinica :");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 122, 33));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DATOS DEL PACIENTE");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 961, 20));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(" APELLIDOS :");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(" NOMBRES :");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        apellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidosKeyTyped(evt);
            }
        });

        nombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText(" EDAD :");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        edad.setModel(new javax.swing.SpinnerNumberModel());

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText(" GENERO :");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText(" #CEDULA :");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulaKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText(" #TELEFONO :");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText(" PROVINCIA :");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        provincias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AZUAY", "GALAPAGOS", "CAÑAR", "BOLIVAR", "CARCHI", "CHIMBORAZO", "COTOPAXI", "EL ORO", "ESMERALDAS", "GUAYAS", "SANTA ELENA", "LOJA", "MORONA SANTIAGO", "IMBABURA", "LOS RIOS", "MANABI", "NAPO", "ORELLANA", "PASTAZA", "SANTO DOMINGO", "PICHINCHA", "SUCUMBIOS", "TUNGURAHUA", "ZAMORA CHINCHIPE" }));
        provincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciasActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText(" CANTON :");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText(" ALTURA :");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText(" PESO :");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        altura.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        peso.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText(" DIRECCION :");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        direccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText(" #CELULAR :");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        celular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(provincias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(canton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edad, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(altura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 128));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ANTECEDENTES FAMILIARES");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 294, 20));

        af.setColumns(20);
        af.setRows(5);
        jScrollPane1.setViewportView(af);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 294, 70));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText(" APELLIDOS DEL PACIENTE :");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 4, -1, 25));
        jPanel1.add(ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 7, 137, -1));

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("BUSCAR");
        jToggleButton1.setOpaque(true);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 5, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("GUARDAR PACIENTE");
        jToggleButton2.setOpaque(true);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 951, 50));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ANTECENDENTES PERSONALES");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 319, 20));

        ap.setColumns(20);
        ap.setRows(5);
        jScrollPane2.setViewportView(ap);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 319, 70));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("MOTIVOS DE CONSULTA");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 312, 20));

        motivo.setColumns(20);
        motivo.setRows(5);
        jScrollPane3.setViewportView(motivo);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 312, 70));

        medicacion.setColumns(20);
        medicacion.setRows(5);
        jScrollPane4.setViewportView(medicacion);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 620, 50));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("MEDICACION");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 620, 20));

        tratamiento.setColumns(20);
        tratamiento.setRows(5);
        jScrollPane5.setViewportView(tratamiento);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 294, 50));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("TRATAMIENTO");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 294, 20));

        dos.setText("IMO");
        jPanel1.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        uno.setText("TN");
        jPanel1.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        cinco.setText("EA");
        jPanel1.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        cuatro.setText("DI");
        jPanel1.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        siete.setText("EKG");
        jPanel1.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        nueve.setText("HIDRO-COLON");
        jPanel1.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        once.setText("ECO");
        jPanel1.add(once, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, -1));

        diez.setText("ACUPUNTURA");
        jPanel1.add(diez, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        tres.setText("LASER");
        jPanel1.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        seis.setText("EC");
        jPanel1.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, -1, -1));

        ocho.setText("VACUNA");
        jPanel1.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        doce.setText("LAVADO-OIDOS");
        jPanel1.add(doce, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, -1, -1));

        quince.setText("PLASMA-RICO-PLAQUETA");
        jPanel1.add(quince, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, -1));

        catorce.setText("MEGADOSIS-C");
        jPanel1.add(catorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        trece.setText("OZONO");
        jPanel1.add(trece, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        jButton8.setText("INGRESAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 90, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MEDICO TRATANTE");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        medico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(medico, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, 70));
        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosKeyTyped
        char c =evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosKeyTyped

    private void cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyPressed
        String phone=cedula.getText();
        int x=phone.length();
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9')
        {
            if(x<10)
            {
                cedula.setEditable(true);
            }else   {cedula.setEditable(false);}
        }else
        {if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                cedula.setEditable(true);

            }else  cedula.setEditable(false);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaKeyPressed

    private void provinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciasActionPerformed
        canton.setEnabled(true);
        llenarCiudades();// TODO add your handling code here:
    }//GEN-LAST:event_provinciasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Conexion conect= new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Connection conexion=(Connection) conect.getconection();
            ps=(PreparedStatement) conexion.prepareStatement("select * from pacientes where apellidos=?");
            ps.setString(1,ape.getText());
            rs=ps.executeQuery();
            Blob imagen=null;
            if(rs.next())
            {
                nombres.setText(rs.getString("nombres"));
                apellidos.setText(rs.getString("apellidos"));
                cedula.setText(rs.getString("cedula"));
                telefono.setText(rs.getString("telefono"));
                direccion.setText(rs.getString("direccion"));
                celular.setText(rs.getString("celular"));
                af.setText(rs.getString("motivo"));
                edad.setValue(rs.getInt("edad"));
                altura.setValue(rs.getDouble("altura"));
                peso.setValue(rs.getDouble("peso"));
                provincias.setSelectedItem(rs.getString("provincia"));
                canton.setSelectedItem(rs.getString("canton"));
                genero.setSelectedItem(rs.getString("genero"));
                af.setText(rs.getString("antecedentesf"));
                ap.setText(rs.getString("antecedentesp"));
                medicacion.setText(rs.getString("medicacion"));
                tratamiento.setText(rs.getString("tratamiento"));
            }else {JOptionPane.showMessageDialog(null, "PRODUCTO NO EXISTE");}
            conexion.close();
            rs.close();
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(ModificarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        if(jToggleButton2.isSelected())
        {obtenerFecha();
            Conexion conect= new Conexion();
            PreparedStatement ps2=null;
            try {
                Connection conexion=(Connection) conect.getconection();
                ps2=(PreparedStatement) conexion.prepareStatement("insert into pacientes (nombres,apellidos,edad,genero,cedula,telefono,provincia,canton,direccion,celular,altura,peso,motivo,fecha,antecedentesf,antecedentesp,medicacion,tratamiento,hora,medico) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps2.setString(1, nombres.getText());
                ps2.setString(2, apellidos.getText());
                ps2.setInt(3, (int) edad.getValue());
                ps2.setString(4, (String) genero.getSelectedItem());
                ps2.setString(5, cedula.getText());
                ps2.setString(6, telefono.getText());
                ps2.setString(7, (String) provincias.getSelectedItem());
                ps2.setString(8, (String) canton.getSelectedItem());
                ps2.setString(9, direccion.getText());
                ps2.setString(10, celular.getText());
                ps2.setDouble(11, (double) altura.getValue());
                ps2.setDouble(12, (double) peso.getValue());
                ps2.setString(13, motivo.getText());
                ps2.setString(14, fecha);
                ps2.setString(15, af.getText());
                ps2.setString(16, ap.getText());
                ps2.setString(17, medicacion.getText());
                ps2.setString(18, tratamiento.getText());
                ps2.setString(19, horae);
                ps2.setString(20, medico.getText());

                ps2.executeUpdate();
                JOptionPane.showMessageDialog(null, "PACIENTE GUARDADO CORRECTAMENTE");
                // TODO add your handling code here:
            } catch (SQLException ex) {
                Logger.getLogger(IngresarProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else { limpiar();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(uno.isSelected())
        {
            tratamiento.append("TERAPIA NEURAL,");
            uno.setEnabled(false);
        }
        if(dos.isSelected())
        {
            tratamiento.append("SUERO,");
            dos.setEnabled(false);
        }
        if(tres.isSelected())
        {
            tratamiento.append("LASER INTRAVENOSO,");
            tres.setEnabled(false);
        }
        if(cuatro.isSelected())
        {
            tratamiento.append("DESINTOXICACION IONICA,");
            cuatro.setEnabled(false);
        }
        if(cinco.isSelected())
        {
            tratamiento.append("ELECTRO ACUPUNTURA,");
            cinco.setEnabled(false);
        }
        if(seis.isSelected())
        {
            tratamiento.append("ELECTRO CIRCULACION,");
            seis.setEnabled(false);
        }
        if(siete.isSelected())
        {
            tratamiento.append("ELECTRO CARDIOGRAMA,");
            siete.setEnabled(false);
        }
        if(ocho.isSelected())
        {
            tratamiento.append("VACUNA,");
            ocho.setEnabled(false);
        }
        if(nueve.isSelected())
        {
            tratamiento.append("ECO,");
            nueve.setEnabled(false);
        }
        if(diez.isSelected())
        {
            tratamiento.append("ACUPUNTURA,");
            diez.setEnabled(false);
        }
        if(once.isSelected())
        {
            tratamiento.append("HIDRO COLON TERAPIA,");
            once.setEnabled(false);
        }
        if(doce.isSelected())
        {
            tratamiento.append("LAVADO DE OIDOS,");
            doce.setEnabled(false);
        }
        if(trece.isSelected())
        {
            tratamiento.append("OZONO TERAPIA,");
            trece.setEnabled(false);
        }
        if(catorce.isSelected())
        {
            tratamiento.append("MEGADOSIS DE VITAMINA C,");
            catorce.setEnabled(false);
        }
        if(quince.isSelected())
        {
            tratamiento.append("PLASMA RICO EN PLAQUETAS,");
            quince.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea af;
    private javax.swing.JSpinner altura;
    private javax.swing.JTextArea ap;
    private javax.swing.JTextField ape;
    private javax.swing.JTextField apellidos;
    private javax.swing.JComboBox<String> canton;
    private javax.swing.JCheckBox catorce;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField celular;
    private javax.swing.JCheckBox cinco;
    private javax.swing.JLabel codigo;
    private javax.swing.JCheckBox cuatro;
    private javax.swing.JCheckBox diez;
    private javax.swing.JTextField direccion;
    private javax.swing.JCheckBox doce;
    private javax.swing.JCheckBox dos;
    private javax.swing.JSpinner edad;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextArea medicacion;
    private javax.swing.JTextField medico;
    private javax.swing.JTextArea motivo;
    private javax.swing.JTextField nombres;
    private javax.swing.JCheckBox nueve;
    private javax.swing.JCheckBox ocho;
    private javax.swing.JCheckBox once;
    private javax.swing.JSpinner peso;
    private javax.swing.JComboBox<String> provincias;
    private javax.swing.JCheckBox quince;
    private javax.swing.JCheckBox seis;
    private javax.swing.JCheckBox siete;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextArea tratamiento;
    private javax.swing.JCheckBox trece;
    private javax.swing.JCheckBox tres;
    private javax.swing.JCheckBox uno;
    // End of variables declaration//GEN-END:variables
}
