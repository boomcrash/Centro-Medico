/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static redsaludtotal1.InterfazIngreso.CONTRASEÑA;
import static redsaludtotal1.InterfazIngreso.URL;
import static redsaludtotal1.InterfazIngreso.USUARIO;

/**
 *
 * @author alexm
 */
public class Conexion {
      Connection conexion=null;
    public static final String URL="jdbc:mysql://204.2.195.213:22084/redsaludtotal?autoReconnet=true&useSSL=false";
    public static final String USUARIO="boom";
        public static final String CONTRASEÑA="carreter1";
    
    public Conexion() {
    }
        
    public Connection getconection()
{
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR, "+ex);
            }       
        catch (SQLException ex) 
        {
            System.err.println("ERROR, "+ex);
        }
        return conexion;
}
}
