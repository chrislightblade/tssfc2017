/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez04;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class ArrayBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max_nomi = 10;

        String input = JOptionPane.showInputDialog("quanti ne fai oggi?");

        max_nomi = Integer.parseInt(input);

        String nomi[] = new String[max_nomi];
        
        int anni[] = new int[max_nomi];

        for (int i = 0; i < nomi.length; i++) {
            //devo chiedere il nome e caricarlo nella corretta scatola
            //singolo elemento dell'array
            int mancano = nomi.length - i;
            input = JOptionPane.showInputDialog("come ti chiami? [-" + mancano + "]");
            nomi[i] = input;
            //carico anche gli anni dei singoli
            input = JOptionPane.showInputDialog("in che anno sei nato? [-" + mancano + "]");
            anni[i] = Integer.parseInt(input);

        }

        String reportHTML = "";
        reportHTML = "<table border='1'";
        reportHTML += "<tr><th>#</th><th>data nascita</th><th>Nominativo</th></tr>";

        for (int i = 0; i < nomi.length; i++) {
            // li leggo uno per uno e li stampo
            reportHTML += "<tr><td>" + (i+1) + "</td><td>" + anni[i] + "</td><td>" + nomi[i] + "</td></tr>";

        }
        reportHTML += "</table>";
        System.out.println(reportHTML);

        // riga vuota
        System.out.println();

        //output java
        String report = "\n";

        for (int i = 0; i < nomi.length; i++) {
            // li leggo uno per uno e li stampo
            report += (i + 1) + "# "+ anni[i] + " - " + nomi[i] + "\n";

        }
        System.out.println(report);

        
    }

}