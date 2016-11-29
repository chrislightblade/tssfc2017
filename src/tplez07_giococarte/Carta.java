/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez07_giococarte;

/**
 *
 * @author tss
 */
public class Carta {

    private int valore;// esempio 7
    private int seme;// esempio cuori
    private String nome;//composto in fase di creazione = esempio 7 di picche

    public Carta(int valore, int seme, String nome) {
        this.valore = valore;
        this.seme = seme;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getSeme() {
        return seme;
    }

    public int getValore() {
        return valore;
    }

    
}
