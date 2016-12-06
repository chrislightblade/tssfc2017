/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez09;

import tplez091.*;

/**
 *
 * @author tss
 */
public class Persona {

    private String nome;
    private int numero;
    private static int numerototale = 0;

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
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
