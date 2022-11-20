/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author Mateo
 */
public class Carta {
    private int valorCarta;
    private ImageIcon imagenCarta;
    String path = "src/Imagenes/";

    public Carta(int valorCarta, int i) {
        this.valorCarta = valorCarta;
        this.imagenCarta = new ImageIcon(path+valorCarta+"-"+i+".png");
        
    }    

    public int getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(int valorCarta) {
        this.valorCarta = valorCarta;
    }
    
    public ImageIcon getImagenCarta(){
        return imagenCarta;
    }
    
}
