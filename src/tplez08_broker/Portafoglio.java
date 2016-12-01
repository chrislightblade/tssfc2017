/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez08_broker;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Portafoglio {

    private ArrayList<Moneta> portafoglio;

    public Portafoglio() {// di prof, esiste e basta
        this.portafoglio = new ArrayList<Moneta>();
    }

    public Portafoglio(int index) {// mio, con packet di partenza a caso 
        portafoglio = new ArrayList<Moneta>();
        Random random = new Random();
        int valore = random.nextInt(index) + 1;
        for (int i = 0; i < valore; i++) {
            index = (int) Math.floor(Math.random() * Moneta.getDimensioneTaglio());
            Moneta moneta = new Moneta(index);
            portafoglio.add(moneta);
        }
    }

    public ArrayList<Moneta> getPortafoglio() {
        return portafoglio;
    }

    public void aggiungiMoneta(Moneta e) {
        Moneta j = new Moneta();
        j.setValore(e.getValore());
        portafoglio.add(j);
    }

    public int getDimensionePortafoglio() {
        int dimensione = portafoglio.size();
        return dimensione;
    }

    public double getMonetaSpecificaNelPortafoglio(int index) {
        double valore = 0;
        valore = portafoglio.get(index).getValore();
        return valore;
    }

    public void togliMoneta(int valore) {
        for (int i = 0; i < portafoglio.size(); i++) {
            if (valore == getMonetaSpecificaNelPortafoglio(i)) {
                portafoglio.remove(i);
                break;
            }
        }

    }

    public int quantipezziDa() {
        return 0;
    }

    public int gettotalePortafoglio() {//valore totale delle monete nel portafoglio
        int totale = 0;
        for (int i = 0; i < getDimensionePortafoglio(); i++) {

            totale += portafoglio.get(i).getValore();
        }
        return totale;
    }
}
