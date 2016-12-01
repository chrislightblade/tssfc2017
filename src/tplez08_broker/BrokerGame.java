/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez08_broker;

/**
 *
 * @author tss
 */
public class BrokerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moneta monetapl1 = new Moneta();
        Moneta monetapl2 = new Moneta();
        //Moneta monetapl3 = new Moneta();
        monetapl1.setValore(7);
        monetapl2.setValore(5);
        Giocatore p1 = new Giocatore("Gino0", monetapl1);
        Giocatore p2 = new Giocatore("Geeno", monetapl2);
        
        System.out.println(p1.showPortafoglio() + "\n" + p2.showPortafoglio());
        monetapl1.setValore(25); //non so perchè ma cambia anche il valore della moneta dentro il portafoglio di p2
        //monetapl3.setValore(25);
        p1.getPortafoglio().aggiungiMoneta(monetapl1);
        
        System.out.println(p1.showPortafoglio() + "\n" + p2.showPortafoglio());
        
        monetapl1.setValore(15); //non so perchè ma cambia anche il valore della moneta dentro il portafoglio di p2, risolto mettendo nel costruttore una moneta fittizia
        //monetapl3.setValore(25);
        p1.getPortafoglio().aggiungiMoneta(monetapl1);
        
        System.out.println(p1.showPortafoglio() + "\n" + p2.showPortafoglio());
        /*p1.toglimonetadaPortafoglio();
        
        System.out.println(p1.showPortafoglio() + "\n" + p2.showPortafoglio());*/
    }

}
