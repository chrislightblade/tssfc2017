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
public class Biblioteca {
    
    private Indice_biblioteca indiceBiblioteca;
    private ArrayList<Cliente> elencoClienti;
    private ArrayList<Bibliotecaria> elencoBibliotecarie;

    public Biblioteca(Indice_biblioteca indiceBiblioteca, ArrayList<Cliente> elencoClienti, ArrayList<Bibliotecaria> elencoBibliotecarie) {
        this.indiceBiblioteca = new Indice_biblioteca();
        this.elencoClienti = new ArrayList<Cliente>();
        this.elencoBibliotecarie = new ArrayList<Bibliotecaria>();
    }
    
    public Indice_biblioteca getIndiceBiblioteca() {
        return indiceBiblioteca;
    }

    public void setIndiceBiblioteca(Indice_biblioteca indiceBiblioteca) {
        this.indiceBiblioteca = indiceBiblioteca;
    }

    /*public ArrayList<Persona> getRegistrati() {
        return elencoClienti;
    }*/

    public void setRegistrati(ArrayList<Persona> registrati) {
        this.elencoClienti = registrati;
    }
    
    
    
}
