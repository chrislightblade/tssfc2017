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
public class Tplez01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //definisco la variabile in cui verrà inserito l'input e la variabile per il risultato
        String num1;
        String num2;  
        int conto = 0;
        //caricare i dati per ottenere il conto -> input
        num1 = JOptionPane.showInputDialog("primo numero intero");
        num2 = JOptionPane.showInputDialog("secondo numero intero");
        try{ 
        //svolgo il conto totale -> elaborazione
        conto = conto + Integer.parseInt(num1) + Integer.parseInt(num2);
        
        //stampo il conto -> output
        JOptionPane.showMessageDialog(null , conto);                  
        } 
        catch (Exception error) {
            JOptionPane.showMessageDialog(null ,"non hai inserito dei valori validi\nhai scritto: " +
                    num1 + " e " + num2 );
        }
    }
    
    
}
