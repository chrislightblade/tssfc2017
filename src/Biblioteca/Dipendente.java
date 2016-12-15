/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Date;
import javax.swing.JOptionPane;
import util.DateFunction;

/**
 *
 * @author tss
 */
public class Dipendente extends Persona{
     
    private String ruolo;

    public Dipendente(String nome, String cognome, String ruolo) {
        super(nome, cognome);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }    
    
    public String aggLibro(String titolo, String autore, Biblioteca b) {
        int newcode = 1;
        String msg = "Non posso inserire il libro, mancano dei campi.";
        if(titolo.equals("") || autore.equals("") || (titolo.equals("") && autore.equals(""))){
            return msg;
        }
        if(b.getElencolibri().size() == 0){
            newcode = 1;
        } else {
        newcode= b.getElencolibri().get(b.getElencolibri().size()-1).getCodLibro()+1;
        }
        Libro l1= new Libro(newcode,titolo,autore);
        b.aggLibro(l1);
        msg = newcode + "#: " + titolo + " - " + autore;
        return msg;
    }
    
    public String agglibro(Libro libro, Biblioteca b){
        int newcode = 0;
        if(b.getElencolibri().size() == 0){
            newcode = 1;
        } else {
        newcode= b.getElencolibri().get(b.getElencolibri().size()-1).getCodLibro()+1;  
        }
        b.aggLibro(libro);
        String msg = newcode + "#: " + libro.getTitolo() + " - " + libro.getAutore();
        return msg;
    }
    
    public String removeLibro(int index, Biblioteca b) {        
        String msg = "IMPOSSIBILE CANCELLARE IL LIBRO   ";
        if(index < b.getElencolibri().size() && index >= 0){
        b.getElencolibri().remove(index);
        msg = "Libro Eliminato";
        } 
        
        return msg;
    }
    
    public String aggNewPrestito(int codCliente, int codLibro, Biblioteca b) {
        
        String msg = "Non posso inserire il prestito.";
        if(codCliente < 0 && codLibro < 0){
            return msg;
        }
        //String note = JOptionPane.showInputDialog("inserire nota");
        Prestito p1= new Prestito(codCliente, codLibro, "Prestito del " + DateFunction.converti(new Date()));
        b.aggPrestito(p1);
        msg = "Aggiunto prestito: codCliente " + codCliente + " - codLibro " + codLibro;
        return msg;
    }
    
    public String aggNewPrestito(int codCliente, int codLibro, Biblioteca b, String note) {
        
        String msg = "Non posso inserire il prestito.";
        if(codCliente < 0 && codLibro < 0){
            return msg;
        }
        //String note = JOptionPane.showInputDialog("inserire nota");
        Prestito p1= new Prestito(codCliente, codLibro, note + " Prestito del " + DateFunction.converti(new Date()));
        b.aggPrestito(p1);
        msg = "Aggiunto prestito: codCliente " + codCliente + " - codLibro " + codLibro;
        return msg;
    }
}
