/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez05;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tabella_voto_studenti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quanti_studenti = 0;
        String studenti[] = new String[quanti_studenti];
        int quanti_voti_max = 0, max_voti = 0;
        int voti[][] = new int[studenti.length][quanti_voti_max];

        quanti_voti_max = Integer.parseInt(JOptionPane.showInputDialog("inserisci il numero massimo di voti che possiede un singolo studente"));
        quanti_studenti = Integer.parseInt(JOptionPane.showInputDialog("inserisci il numero di studenti del corso"));
        for (int i = 0; i < studenti.length; i++) {
            studenti[i] = JOptionPane.showInputDialog("inserisci il nome dello studente");
            max_voti = Integer.parseInt(JOptionPane.showInputDialog("quanti voti ha lo studente " + studenti[i] + " ?"));

            for (int j = 0; j < max_voti; j++) {
                voti[i][j] = Integer.parseInt(JOptionPane.showInputDialog("inserisci il " + j +"° voto"));
            }
        }
    }

}
