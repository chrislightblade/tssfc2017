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
public class Cliente extends Persona{
    
    private int codiceCliente;
    private ArrayList<Libro> libriPresiInPrestito;

    public Cliente(String nome, int codiceCliente) {
        super(nome);
        this.codiceCliente = codiceCliente;
        this.libriPresiInPrestito = new ArrayList<Libro>();
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }        
    
    @Override
    public String toString(){
        return "Cliente: " + nome + "/Codice cliente: " + codiceCliente + "\n";
    }
    
    public String getLibriPresiInPrestito() {
        String report = "I libri presi in prestito da " + getNome() + " sono:\n";
        for (int i = 0; i < libriPresiInPrestito.size(); i++) {
            report += "'" + libriPresiInPrestito.get(i).getTitolo() + "' codice: " + libriPresiInPrestito.get(i).getCodiceLibro() + "\n";
        }
        return report;
    }

    public void addLibroInPrestito(Libro libro, Biblioteca biblioteca) {
        libriPresiInPrestito.add(libro);
        biblioteca.getIndiceBiblioteca().rimuoviLibro(libro);
    }

    public void restituisciLibro(String nomeLibro, Biblioteca biblioteca) {
        for (int i = 0; i < libriPresiInPrestito.size(); i++) {
            if (libriPresiInPrestito.get(i).getTitolo().equalsIgnoreCase(nomeLibro)) {
                biblioteca.getIndiceBiblioteca().addLibro(libriPresiInPrestito.get(i));
                libriPresiInPrestito.remove(i);
            }
        }
    }
    
}
