/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez07_giococarte;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Player_old {

    String nome = "Erik";
    ArrayList<Carta_old> carte;
    double punti = 0;

    public Player_old(String nome) {
        this.nome = nome;
        //carta array list vuoto di carte che posso usare per prendere e togliere carte al giocatore
        carte = new ArrayList<Carta_old>();
    }

    //aggiungi una carta estratta per definire il punteggio
    public void prendoCarta(Carta_old c) {
        carte.add(c);
    }
    
    public double dammiPunteggio(){
        double ris = 0;
        for(int i = 0; i < carte.size(); i++){
            Carta_old c = carte.get(i);
            if (c.getValore() < 8)
                ris += ris + c.getValore();
            
            else            
                ris += ris + 0.5;
        }
        return ris;        
    }
}
