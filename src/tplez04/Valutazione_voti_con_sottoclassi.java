/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez04;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Valutazione_voti_con_sottoclassi {

    public static void main(String[] args) {

        String input = "";
        int numero_persone = Integer.parseInt(JOptionPane.showInputDialog("inserisci quanti nomi e voti vuoi scrivere: "));//quanti studenti ci sono nel corso
        String studenti[] = new String[numero_persone];//array con nome studenti
        int voti_studenti[] = new int[numero_persone];//array con i voti degli studenti
        String giudizio[] = new String[numero_persone];//array che riporta se lo studente è promosso o bocciato in base al giudizio inserito        
        String report = "";
        int voto_sufficienza = 0;
        double media = 0;

        for (int i = 0; i < studenti.length; i++) {
            studenti[i] = JOptionPane.showInputDialog("inserisci il nome dello studente: ");//input nome studente
            voti_studenti[i] = Integer.parseInt(JOptionPane.showInputDialog("inserisci il voto dello studente " + studenti[i] + ": "));//input voto studente 
        }// fine for inserimento dati in array

        report += cercovoti(voti_studenti, studenti, studenti.length);
        
        report += "la media dei voti corrisponde a: " + calcolo_media(voti_studenti) + "\n";

        report += promosso_o_bocciato(voti_studenti, studenti);
        
        System.out.println(report);// report finale

    }

    private static String cercovoti(int voti_studenti[], String studenti[], int volte) {
        
        String report = "";

        int max = 0, min = 0;//var contenenti il numero di riferimento 
        for (int i = 0; i < volte; i++) {
            if (i == 0) {//inserimento iniziale per paragoni successivi
                max = i;
                min = i;
            }

            if (voti_studenti[i] > voti_studenti[max]) {//selezione voto migliore
                max = i;
            }

            if (voti_studenti[i] < voti_studenti[min]) {//selezione voto pegiore
                min = i;
            }

        }// fine for inserimento dati in array

        report = "Lo studente che ha preso il voto più alto è " + studenti[max] + " con voto " + voti_studenti[max] + "\n";
        report += "mentre il voto più basso lo ha preso lo studente " + studenti[min] + " con " + voti_studenti[min] + "\n";

        return report;

    }

    private static double calcolo_media(int voti_studenti[]) {

        double media = 0;
        int i = 0;
        for (i = 0; i < voti_studenti.length; i++) {

            media += voti_studenti[i];

        }// fine for inserimento dati in array
        
        media = (media / i);
        
        return media;

    }

    private static String promosso_o_bocciato(int voti_studenti[], String studenti[]) {
        
        String report = "";
        
        double voto_sufficienza = Integer.parseInt(JOptionPane.showInputDialog("inserisci il voto minimo per essere promossi:"));

        for (int i = 0; i < studenti.length; i++) {//ciclo for per definire i promossi e i bocciati
            if (voti_studenti[i] >= voto_sufficienza) {
                report += "'" + studenti[i] + "'" + " valutazione: " + voti_studenti[i] + " --->promosso\n";

            } else {
                report += "'" + studenti[i] + "'" + " valutazione: " + voti_studenti[i] + " --->bocciato\n";
            }
 
        }//fine for promosso/bocciato

        return report;
        
        }
}
