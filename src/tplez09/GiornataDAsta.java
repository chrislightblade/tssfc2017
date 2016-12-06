/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez09;

import tplez091.Persona;
import tplez091.Casa_aste;

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

        casa_asta.scegliAsta();

        casa_asta.chiudiAsta();
        
        casa_asta.stampaStorico();

    }
}