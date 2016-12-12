/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez091;

/**
 *
 * questa classe contiene nome di chi fa l'oferta e ammontare, da salvare poi in un ArraayList specifico
 * 
 * @author tss
 */
public class Offerta {
    
    private String nomecognome;
    private int offerta;

    public String getNomecognome() {
        return nomecognome;
    }

    public void setNomecognome(String nomecognome) {
        this.nomecognome = nomecognome;
    }

    public int getOfferta() {
        return offerta;
    }

    public void setOfferta(int offerta) {
        this.offerta = offerta;
    }

    public Offerta(String nomecognome, int offerta) {
        this.nomecognome = nomecognome;
        this.offerta = offerta;
    }   
}
