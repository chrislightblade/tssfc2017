/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez06;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class try_catch_generico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean varie = false;
        while (varie == false) {

            report2 = JOptionPane.showInputDialog(report1 + "\nSono stati estratti questi valori, vanno bene?\nSe si, premi semplicemente 'invio',"
                    + " altrimenti dimmi quanti valori desideri cambiare\ned effettuerò un unico e secondo rialncio dei valori che desideri cambiare.");

            try {
                if (report2.equalsIgnoreCase("")) {
                    input2 = 0;
                    varie = true;
                } else {
                    input2 = Integer.parseInt(report2);
                    varie = true;
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "non hai inserito dei valori validi");
            }
        }//fine while controllo inserimento
    }
    
}
