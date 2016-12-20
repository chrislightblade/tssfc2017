/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class DemoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Biblioteca bib= new Biblioteca("Biblio Ivrea", "via palestra 2, Ivrea");
        Dipendente d1= new Dipendente("Rossi","Mario", "Bibliotecario");
        bib.aggDipendente(d1);
        d1= new Dipendente( "Matteo", "Bianchi", "Premier");        
        //bib.getElencodipendenti().add(d1);
        bib.aggDipendente(d1);
        
        Cliente c1= new Cliente(1, "Mario", "Rossi");
        bib.aggCliente(c1);
        c1= new Cliente(2, "Matteo", "Verdi");
        bib.aggCliente(c1);
        Libro l1= new Libro(1, "Il signore degli anelli", "Tolkien");
        Libro l2= new Libro(2, "Lo Hobbit", "Tolkien");
        Libro l3= new Libro(3, "Il signore degli agnelli", "Tolkren");
        Libro l4= new Libro(4, "Il signore degli bordelli", "Sasha Grey");
        bib.aggLibro(l1);
        bib.aggLibro(l2);
        bib.aggLibro(l3);
        bib.aggLibro(l4);
        Prestito p1 = new Prestito(1, 1, "ciao");
        
        //JOptionPane.showMessageDialog(null,"Elenco libri\n"+bib.stampaLibri());        
        
        


     /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
             new DemoWinBiblio(bib).setVisible(true);
        }  
    });  
    }        
}
