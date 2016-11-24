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

    // prima cosa elenco proprieta dell'oggetto
    String cognome;
    String nome;
    private int voto;

    public Esaminando(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    //metyodi o asbilita' delol'oggetto
    //imposta voto
    void impostaVoto(int voto) {
        if (voto >= 0 && voto <= 100) {
            this.voto = voto;
        } else {
            JOptionPane.showMessageDialog(null, "valore errato");
        }
    }

    ////leggo il voto
    int leggoVoto(){
        return voto;
    }



    String cometichiami() {
        //Dichiaro la variabile di ritorno
        String ris = "test";
        //elaboro con le mie proprieta' la frase di presentazione 
        ris = "Ciao  a tutti, mi chiamo " + nome + " " + cognome;
        //ritorno la frase
        return ris;

    }
    boolean seipiubravodi(Esaminando avversario){
    boolean ris=false;
    if (voto>avversario.leggoVoto())
        ris=true;
    return ris;
    
    }
}
