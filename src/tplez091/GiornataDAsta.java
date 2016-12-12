/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez091;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GiornataDAsta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Casa_aste casa_asta = new Casa_aste();
        Persona p1 = new Persona("Mario Mario");
        Persona p2 = new Persona("Luigi Mario");
        Persona p3 = new Persona("Wario Wario");
        casa_asta.setPersone(p1);
        casa_asta.setPersone(p2);
        casa_asta.setPersone(p3);       

        scegliAsta(casa_asta);       
        
        casa_asta.stampaStorico();

    }
    
    public static void scegliAsta(Casa_aste casa_asta) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Quale tipo di asta desideri applicare?\n1.Asta a offerta singola nascosta\n2.Asta libera.\n3.Asta un oggetto alla volta."));
        switch (input) {
            case 2:
                boolean control = false;
                while (control == false) {
                    control = casa_asta.faiOfferta();
                }
                casa_asta.chiudiAsta();
                break;

            case 1:
                casa_asta.offertaChiusa();
                break;
                
            case 3: 
                casa_asta.astaUnaAllaVolta();                
                break;
        }
    }
}