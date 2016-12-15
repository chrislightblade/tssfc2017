/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Libro {
    
    private int codLibro;
    private String titolo;
    private String autore;    

    public Libro(int codLibro, String titolo, String autore) {
        this.codLibro = codLibro;
        this.titolo = titolo;
        this.autore = autore;        
    }    

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }        

    public int getCodLibro() {
        return codLibro;
    } 

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
    
    public String getInfo(){
        String msg = "";
        msg = getCodLibro() + "#: " + getTitolo() + " - " + getAutore();
        return msg;
    }
    
}
