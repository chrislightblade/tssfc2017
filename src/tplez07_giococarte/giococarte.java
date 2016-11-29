/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez07_giococarte;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class giococarte {
    
    static Mazzo miomazzo;
    static int poscarta = 0;
    static Carta cartacorrente;
    static double punteggiocorrente;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        miomazzo = new Mazzo(40);
        miomazzo.mischiaMazzo();
        String nomecarta = miomazzo.getCartaIndex(0).getNome() + "\n";
        for(int i = 0; i < 40; i++){
            nomecarta += miomazzo.getCartaIndex(i).getNome() + "\n";
            
        }
        
        Player p1 = new Player("Luca");
        boolean avanti = true;
        while(avanti == true){
        //prendo la prima carta e inizio
        cartacorrente = miomazzo.getCartaIndex(poscarta++);
        p1.prendoCarta(cartacorrente);
        punteggiocorrente = p1.dammiPunteggio();        
        System.out.println(punteggiocorrente + " . " + cartacorrente.getNome());
        
        if(punteggiocorrente >= 8){
            avanti = false;
                        
        } else {
            //chiedo se vuole continuare
            String input = JOptionPane.showInputDialog("vuoi continuare?\nSe si premi invio\nAltrimenti schiaccia un qualunque pulsante e poi invio");
            if(input.equals("") == false){
                avanti = false;                
            }
        }
        }
        
        Player p2 = new Player("bLuca");
        avanti = true;
        while(avanti == true){
        //prendo la prima carta e inizio
        cartacorrente = miomazzo.getCartaIndex(poscarta++);
        p1.prendoCarta(cartacorrente);
        punteggiocorrente = p1.dammiPunteggio();        
        System.out.println(punteggiocorrente + " . " + cartacorrente.getNome());
        
        if(punteggiocorrente >= 8){
            avanti = false;
            p2.            
        } else {
            //chiedo se vuole continuare
            String input = JOptionPane.showInputDialog("vuoi continuare?\nSe si premi invio\nAltrimenti schiaccia un qualunque pulsante e poi invio");
            if(input.equals("") == false){
                avanti = false;                
            }
        }
        }
        
        double r1, r2;
        //leggi i 2 punteggi
        r1 = p1.dammiPunteggio();
        r2 = p2.dammiPunteggio();
        
    }
    
}
