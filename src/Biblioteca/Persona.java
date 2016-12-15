/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author tss
 */
public class Persona {
    
     
    private String nome;   
    private String cognome;
    private int numtel;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }


    public int getNumtel() {
        return numtel;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

     
    
    
    
}
