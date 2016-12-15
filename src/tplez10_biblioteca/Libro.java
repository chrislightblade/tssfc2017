/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez10_biblioteca;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Libro {
    
    private String titolo;
    private String autore;
    private int scaffale;//o String
    private String codiceLibro;
    //private ArrayList<Talloncino> prestatoA;

    public Libro(String titolo, String codiceLibro, String autore/*, ArrayList<Talloncino> prestatoA*/) {
        this.titolo = titolo;
        this.autore = autore;
        this.codiceLibro = codiceLibro;        
        //this.prestatoA = prestatoA;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }
    
    public String getCodiceLibro() {
        return codiceLibro;
    }

    @Override
    public String toString(){
        return "Titolo: '" + titolo + "'/ Autore: '" + autore + "'/Scaffale: '" + scaffale + "'"; 
    }
    
    
    /*public String getPrestatoA(int index) {
        return prestatoA.get(index).;
    }*/
   
}
