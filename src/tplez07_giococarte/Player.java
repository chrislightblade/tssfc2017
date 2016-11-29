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
public class Player {

    String nome = "Erik";
    ArrayList<Carta> carte;
    double punti = 0;

    public Player(String nome) {
        this.nome = nome;
        //carta array list vuoto di carte che posso usare per prendere e togliere carte al giocatore
        carte = new ArrayList<Carta>();
    }

    //aggiungi una carta estratta per definire il punteggio
    public void prendoCarta(Carta c) {
        carte.add(c);
    }
    
    public double dammiPunteggio(){
        double ris = 0;
        for(int i = 0; i < carte.size(); i++){
            Carta c = carte.get(i);
            if (c.getValore() < 8)
                ris += ris + c.getValore();
            
            else            
                ris += ris + 0.5;
        }
        return ris;        
    }
}
