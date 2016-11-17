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
public class tplez02a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double D, CHOICE;
        String a, b, choice;
        double A, B;
        a = JOptionPane.showInputDialog("inserire il primo termine");
        A = Double.parseDouble(a);
        b = JOptionPane.showInputDialog("inserire il secondo termine");
        B = Double.parseDouble(b);
        choice = JOptionPane.showInputDialog("digitare 1 se si desidera fare " + A + " - " + B + ", altrimenti digitare 2");
        CHOICE = Integer.parseInt(choice);
        if(CHOICE == 1){
           D = A - B;
           D = Math.round(D);
           JOptionPane.showMessageDialog(null, "il risultato del calcolo " + A + " - " + B + " è: " + D );
        }
        else{
            D = B - A;
            JOptionPane.showMessageDialog(null, "il risultato del calcolo " + B + " - " + A + " è: " + D );
            D = Math.round(D);
            
        }
        
        
        
        
                
                
        
        
    }
    
}
