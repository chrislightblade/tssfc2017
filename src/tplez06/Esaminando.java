/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez06;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Esaminando {
    
    String cognome;
    String nome;
    int voto;
    
    //metyodo o asbilità delol'oggetto
    
    public Esaminando(String nome, String cognome){
        this.cognome = cognome;
        this.nome = nome;
    }

    String cometiChiami() {
        String ris = "";
        ris = "Ciao a tutti, mi chiamo " + nome + " " + cognome;
        return nome; 
    }
    
    void impostaVoto (int voto){
        if(voto >= 0 && voto <= 100)
            this.voto = voto;
        else
            JOptionPane.showMessageDialog(null, "valore errato\n");
    }
    
    int leggiVoto(){
        return voto;
    }
}
