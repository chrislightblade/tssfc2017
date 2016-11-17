/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class CercaMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //chiedo quanti sono
        int nummax = Integer.parseInt(JOptionPane.showInputDialog("quanti?"));
        //creo array per contenere i numeri
        int numeri[] = new int[nummax];
        //ciclo for per chiedere i dati a e metterli in array
        for (int i = 1; i < numeri.length; i++) {
            //chiedo il nuimero stringas
            String input = JOptionPane.showInputDialog("numero?");
            //trasformo string in intero;
            int ris = Integer.parseInt(input);
            //carico l'elemento i-esimo dell'array numeri
            numeri[i] = ris;
        }
        //ciclo for che li scorre per cercare il max
        // mentre ciclo verifico che il numero sia il piu' grande 
        //e me lo metto da parte per il prossimo controllo
        int max = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            //guardo un numero per volta e vedo se e' il max
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        //output del max trovato
        System.out.println(max);
    }

}
