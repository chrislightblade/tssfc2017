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
public class GiocoCarte {

    /**
     * @param args the command line arguments
     */
    static Mazzo miomazzo;
    static int poscarta = 0;
    static Carta cartacorrente;
    static double punteggiocorrente;

    public static void main(String[] args) {
        // TODO code application logic here

        miomazzo = new Mazzo(40);
        miomazzo.mischia();

        String nomecarta = "elenco carte mazzo\n";
        for (int i = 0; i < 40; i++) {
            nomecarta += miomazzo.getCartaIndex(i).getNome() + "\n";
        }
        //mazzo pronto
//creo i due giocatori
        Player p1 = new Player("luca");
        Player p2 = new Player("marco");
        //faccio giocare il primo
        giocata(p1);
        //poi l'altro
        giocata(p2);

        chiVince(p1, p2);
        //System.out.println(msg + "\n" + nomecarta);
    }

    static public void giocata(Player p1ayer) {

        //inizio gioco player
        String carteinmano = "";
        System.out.println("Giocatore " + p1ayer.getNome());
        boolean avanti = true;
        while (avanti == true) {

            // prendo la prima carta e inizio
            cartacorrente = miomazzo.getCartaIndex(poscarta++);
            //cartacorrente = miomazzo.getCartaIndex(poscarta);
            //poscarta++;
            //la passo a p1        
            p1ayer.prendeCarta(cartacorrente);
            //adesso chiedo quanti punti ha
            punteggiocorrente = p1ayer.dammiPunteggio();
            //vediamo anche...
            System.out.println(punteggiocorrente + " - " + cartacorrente.getNome());

            if (punteggiocorrente >= 8) {
                avanti = false;
                p1ayer.seiFuori();
            } else {
                
                boolean control = false;
                while(control == false){
                //gli chiedo se vuole continuare
                String input = JOptionPane.showInputDialog("vuoi continuare?\ninvio continua\nqualsiasi carattere smette\nse digiti 9 ti mostra le carte in mano al giocatore");
                if (input.equals("9")) {
                    carteinmano = p1ayer.showCarte();
                    System.out.println(carteinmano);
                    
                } else {
                    if (input.equals("") == false) {
                        avanti = false;
                        control = true;
                    } else {
                        control = true;
                    }
                }// fine else
                }
            }// fine else grande

        } //fine gioco player

    }

    public static void chiVince(Player p1, Player p2) {
        String msg = "";

        if (p1.dammiPunteggio() == p2.dammiPunteggio()) {
            msg = "E' finita patta";

        } else {
            if (p1.dammiPunteggio() > p2.dammiPunteggio()) {
                msg = "Vince " + p1.getNome();
            } else {
                msg = "Vince" + p2.getNome();
            }
        }

        System.out.println(msg);
        /*double r1, r2;
        //leggo i due punteggi
        r1 = p1.dammiPunteggio();
        r2 = p2.dammiPunteggio();
        //li confronto e decreto il vincitore
        String msg = "";
        if (r1 < r2) {
            msg = "vince " + p2.getNome();
        }
        if (r2 < r1) {
            msg = "vince " + p1.getNome();
        }
        if (r2 == r1) {
            msg = "pari tra " + p1.getNome() + " e " + p2.getNome();
        }

    }*/
    }

}
