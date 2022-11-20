/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Vector;

/**
 *
 * @author Mateo
 */
public class Baraja {

    Vector<Carta> baraja = new Vector<Carta>();

    public Baraja() {
        creaBaraja();
        organizaBaraja();
    }

    public void creaBaraja() {
        for (int valor = 1; valor <= 13; valor++) {
            for (int tipoDeCarta = 1; tipoDeCarta <= 4; tipoDeCarta++) {
                Carta c = new Carta(valor, tipoDeCarta);
                baraja.addElement(c);
            }
        }
    }

    public void organizaBaraja() {
        for (int i = 0; i < 51; i++) {
            if (baraja.get(i).getValorCarta() > 10) {
                baraja.get(i).setValorCarta(10);
            }
        }
    }

    public Carta getCarta() {
        int random;
        Carta c;
        random = (int) (Math.random() * (baraja.size()));
        c = baraja.get(random);
        baraja.removeElementAt(random);
        return c;
    }
}
