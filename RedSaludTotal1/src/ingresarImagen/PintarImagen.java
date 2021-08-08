/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresarImagen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author alexm
 */
public class PintarImagen extends javax.swing.JPanel {
    private String ruta;
    public PintarImagen(int ancho,int alto,String ruta)
    {
        this.setSize(ancho, alto);
        this.ruta=ruta;
    }
    public void paint(Graphics g)
    {
        Dimension tamaño=getSize();
        Image img=new ImageIcon(ruta).getImage();
        g.drawImage(img,0,0,tamaño.width,tamaño.height,null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
