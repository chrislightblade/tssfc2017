/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez08_broker;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Giocatore {
    
    private Portafoglio portafoglio;
    private String nome;
    
    public Giocatore(){
                
    }

    public Giocatore(String nome) {// mio, parte con portafoglio caricato a caso
        this.nome = nome;
        this.portafoglio = new Portafoglio(5);
        
    }
    
    public Giocatore(String nome, Moneta moneta) {// del prof, parte con un portafoglio con una moneta settata da noi
        this.nome = nome;
        this.portafoglio = new Portafoglio();
        this.portafoglio.aggiungiMoneta(moneta);
        
    }

    public Portafoglio getPortafoglio() {
        return portafoglio;
    }   
    
    public String getNome() {
        return nome;
    }      
        
    public String showPortafoglio(){//mosrta contenuto portafoglio e totale
        String report = "Nel portafoglio " + nome + " ha:\n";
        int totale = 0;
        for(int i = 0; i < portafoglio.getDimensionePortafoglio(); i++){
            report += (i + 1) + "° = " + portafoglio.getMonetaSpecificaNelPortafoglio(i) + "\n";
            totale = portafoglio.gettotalePortafoglio();
        }
        report += "Il totale è di: " + totale + "\n";
        return report;
    }
    
    /*public void toglimonetadaPortafoglio() {        
        String dalevare = JOptionPane.showInputDialog("quale valore cartamoneta desideri togliere?");
        double valore = 0;
        for(int i = 0; i < portafoglio.getDimensionePortafoglio(); i++){
        valore = portafoglio.getMonetaSpecificaNelPortafoglio(i);
        int dalevare2 = Integer.parseInt(dalevare);
        if(dalevare2 == valore){
            portafoglio.togliMoneta(i);
        }
        }*/
    }

    
    
    
}
