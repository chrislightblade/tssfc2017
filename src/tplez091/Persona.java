/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez091;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Persona {

    private String nome;
    private int numero;
    private static int numerototale = 0;
    private ArrayList<Oggetto> aggiudicati;
    /**
     * 
     * aggiungere la variabilwe portafoglio inizializzata a un tot compreso tra 100 e 5000, e dopo una puntata verificare se la persona può realmente puntare
     *  
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }*/
    public Persona(String nome) {
        this.nome = nome;
        this.numero = numerototale;
        numerototale++;
        aggiudicati = new ArrayList<Oggetto>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void addOggetto(Oggetto oggetto){
        aggiudicati.add(oggetto);
    }

}
