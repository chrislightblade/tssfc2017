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
    
    

    public String getNome() {
        return nome;
    }

    private String nome;
    private ArrayList<Carta> carteinmano;
    int punti = 0;
    
    
    public Player(String nome) {        
        this.nome = nome;
        //carte array list vuoto di carteinmano da usare per aggiungere o togliere le carteinmano al player
        carteinmano = new ArrayList<Carta>();
    }

    //metodo per aggiungere all'array list una carta che mi viene passata
    public void prendeCarta(Carta c) {
        //metodo add aggiunge in fondo a quelle che ci sono gia'
        carteinmano.add(c);       
    }

    public String showCarte() {
        
        String dimmicarte = "il giocatore ha le seguenti carte in mano\n";
        for( int i = 0; i < carteinmano.size(); i++){        
        dimmicarte += (i+1) + "° carta: " + carteinmano.get(i).getNome() + " dal valore " + carteinmano.get(i).getValore() + "\n" ;        
        }
        return dimmicarte;
    }
    
    

    public void seiFuori(){
    
    carteinmano.clear();
    
    }
    
    
    
    //metodo per il settemezzo per avere il conto dei punti con le carteinmano che ho in arraylist
    public double dammiPunteggio() {
        double ris = 0;
        //ciclpo tutti glie lementi dell'array fino a size()
        for (int i = 0; i < carteinmano.size(); i++) {
            //prendo una carta per volta la i-esima
            //Carta c = carteinmano.get(i);
            if (carteinmano.get(i).getValore() < 8) {
                ris = ris + carteinmano.get(i).getValore();
            }
            else
                ris = ris + 0.5;
        }
        return ris;
    }

}
