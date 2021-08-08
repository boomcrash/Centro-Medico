/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresarImagen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author alexm
 */
public class PintarImagenBd extends javax.swing.JPanel{
      private Image ruta;
    public PintarImagenBd(int ancho,int alto,Image ruta)
    {
        this.setSize(ancho, alto);
        this.ruta=ruta;
    }
    public void paint(Graphics g)
    {
        Dimension tamaño=getSize();
        Image img=ruta;
        g.drawImage(img,0,0,tamaño.width,tamaño.height,null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
