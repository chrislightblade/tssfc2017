/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez09;

import tplez091.Offerta;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Oggetto {
    
    private String nome;
    private int offerta;
    private String maggioreOfferente;
    private ArrayList<Offerta> offerte;

    public String getMaggioreOfferente() {
        return maggioreOfferente;
    }

    public void setMaggioreOfferente(String maggioreOfferente) {
        this.maggioreOfferente = maggioreOfferente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOfferta() {
        return offerta;
    }

    public void setOfferta(int offerta) {
        this.offerta = offerta;
    }

    //COSTRUTTORE
    public Oggetto(String nome, int offerta) {
        this.nome = nome;
        this.offerta = offerta;
        this.maggioreOfferente = "Nessuno";
        this.offerte = new ArrayList<Offerta>();
    }

    public String getOfferte() {
        String report = "Ecco lo storico delle offerte valide fatte all'oggetto:\n";
        for(int i = 0; i < offerte.size(); i++){
            report += offerte.get(i).getNomecognome() + " Offerta: " + offerte.get(i).getOfferta() + "\n";
            
        }
        return report;
    }

    public void setOfferte(String nome, int offerta) {
        Offerta off = new Offerta(nome, offerta);
        this.offerte.add(off);
    }
    
    
    
}
