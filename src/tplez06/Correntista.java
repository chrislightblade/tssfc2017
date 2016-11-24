/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez06;

/**
 *
 * @author tss
 */
public class Correntista {

    private String nominativo;
    private int annonascita;
    private double conto=0;
    private int min, max;

    public Correntista(String nominativo, int annonascita) {
        if (annonascita > 1900 && annonascita < 2016) {
            this.annonascita = annonascita;
        } else {
            this.annonascita = 1980;
        }

        if (nominativo.length() > 50) {
            this.nominativo = nominativo.substring(0, 50);
        } else {
            this.nominativo = nominativo;
        }
        min = -5000;
        max = 10000;

    }

    public boolean setConto(double valore) {
        //massimali min max
        if (valore >= min && valore <= max) {
            conto = conto + valore;
            return true;

        } else {
            return false;
        }
    }

    public double getConto() {
        return conto;
    }
    
    public String getInfo(){
    String ris="DATI CORRENTISTA------\n";
    ris+="nominativo:"+ nominativo +"\n";
    ris+="anno nascita:"+ annonascita +"\n";
    ris+="conto:"+ conto +"\n";
    return ris;
    }
}
