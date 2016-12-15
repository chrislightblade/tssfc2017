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
public class Biblioteca {

    private String ragioneSociale;
    private String indirizzo;
    private ArrayList<Libro> elencolibri = new ArrayList<Libro>();
    private ArrayList<Dipendente> elencodipendenti = new ArrayList<Dipendente>();
    private ArrayList<Cliente> elencoclienti = new ArrayList<Cliente>();
    private ArrayList<Prestito> elencoprestiti = new ArrayList<Prestito>();

    public Biblioteca(String ragioneSociale, String indirizzo) {
        this.ragioneSociale = ragioneSociale;
        this.indirizzo = indirizzo;
    }

    public ArrayList<Prestito> getElencoprestiti() {
        return elencoprestiti;
    }

    
    
    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public ArrayList<Libro> getElencolibri() {
        return elencolibri;
    }

    public ArrayList<Dipendente> getElencodipendenti() {
        return elencodipendenti;
    }

    public ArrayList<Cliente> getElencoclienti() {
        return elencoclienti;
    }

    public void aggLibro(Libro l) {
        elencolibri.add(l);
    }
    
    public void aggPrestito(Prestito prestito) {
        elencoprestiti.add(prestito);
    }

    public void aggDipendente(Dipendente d) {
        elencodipendenti.add(d);
    }

    public void aggCliente(Cliente c) {
        elencoclienti.add(c);
    }

    public String stampaLibri() {
        String report = "";
        for (int i = 0; i < elencolibri.size(); i++) {
            Libro l=elencolibri.get(i);
            report += l.getCodLibro() + "#" + " " + l.getTitolo() + " - " + l.getAutore() + "\n";
        }
        return report;
    }

}
