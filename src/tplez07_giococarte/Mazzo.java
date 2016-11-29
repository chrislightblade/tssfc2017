/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez07_giococarte;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Mazzo {

    int numcarte; // numero carte mazzo
    //array che contiene le carte
    private Carta mazzo[] = new Carta[40];

    public Mazzo(int numcarta) {
        this.numcarte = numcarta;
        //creiamo le carte e usiamole per creare il mazzo
        int valore = 1;
        int seme = 1;
        String semicarta[] = {"Picche", "Fiori", "Quadri", "Cuori"};
        for (int i = 1; i <= numcarta; i++) {
            String nomecarta = valore + " di " + semicarta[seme - 1];
            Carta carta = new Carta(valore, seme, nomecarta);
            mazzo[i - 1] = carta;
            valore++;
            if (i % (numcarte / 4) == 0) {//resetto il valore delle carte quando supero il 10 e cambio il seme incrementandolo di 1
                seme++;
                valore = 1;
            }
        }
    }

    public Carta getCartaIndex (int i){
        Carta c = null;
        c = mazzo[i];        
        return c;    
    }
    
    public void mischiaMazzo() {
        //scrivo un codice che prenda 2 carte e le scambi per un migliaio di volte
        for (int i = 0; i < 1000; i++) {            
            int a = (int) Math.floor (Math.random() * numcarte);
            int b = (int) Math.floor (Math.random() * numcarte);
            
            Carta cartainmano = mazzo[a];
            mazzo[a] = mazzo[b];
            mazzo[b] = cartainmano;
        
        }
    }

}
