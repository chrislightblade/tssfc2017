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
public class Indice_biblioteca {
    
    private ArrayList<Libro> Libri;

    public Indice_biblioteca() {
        this.Libri = new ArrayList<>();
    }        

    public ArrayList<Libro> getLibri() {
        return Libri;
    }

    public void addLibro(Libro libro) {
        this.Libri.add(libro);
    }
    
    public void rimuoviLibro(Libro libro){
        this.Libri.remove(libro);
    }
    
    public String elencoLibri(){
        String report = "I libri presenti in biblioteca sono:\n";
        for (int i = 0; i < Libri.size(); i++) {
            report += Libri.get(i).toString();
        }
        return report;
    }
    
    public String trovaLibro(Libro libro){
        for (int i = 0; i < Libri.size(); i++) {
            if(Libri.get(i).getTitolo().equalsIgnoreCase(libro.getTitolo())){
                return "Libro trovato\n";
            }
        }
        return "Libro non trovato\n";
    }
    
}
