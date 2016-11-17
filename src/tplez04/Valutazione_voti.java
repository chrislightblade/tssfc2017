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
public class Valutazione_voti {

    public static void main(String[] args) {

        String input = "";
        int numero_persone = Integer.parseInt(JOptionPane.showInputDialog("inserisci quanti nomi e voti vuoi scrivere: "));//quanti studenti ci sono nel corso
        String studenti[] = new String[numero_persone];//array con nome studenti
        int voti_studenti[] = new int[numero_persone];//array con i voti degli studenti
        String giudizio[] = new String[numero_persone];//array che riporta se lo studente è promosso o bocciato in base al giudizio inserito        
        int max = 0, min = 0;//var contenenti il numero di riferimento 
        String report = "";
        int voto_sufficienza = 0, media = 0;

        for (int i = 0; i < studenti.length; i++) {
            studenti[i] = JOptionPane.showInputDialog("inserisci il nome dello studente: ");//input nome studente
            voti_studenti[i] = Integer.parseInt(JOptionPane.showInputDialog("inserisci il voto dello studente " + studenti[i] + ": "));//input voto studente 

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
            
            media += voti_studenti[i];

        }// fine for inserimento dati in array
        
        media = (media / numero_persone);

        report = "Lo studente che ha preso il voto più alto è " + studenti[max] + " con voto " + voti_studenti[max] + "\n";
        report += "mentre il voto più basso lo ha preso lo studente " + studenti[min] + " con " + voti_studenti[min] + "\n";
        report += "la media dei voti corrisponde a: " + media + "\n";

        
        
        voto_sufficienza = Integer.parseInt(JOptionPane.showInputDialog("inserisci il voto minimo per essere promossi:"));

        for (int i = 0; i < studenti.length; i++) {//ciclo for per definire i promossi e i bocciati
            if (voti_studenti[i] >= voto_sufficienza) {
                giudizio[i] = "---> promosso";
                
            } else {
                giudizio[i] = "---> bocciato";
            }

            report += "'" + studenti[i] + "'" + " valutazione: " + voti_studenti[i] + " " + giudizio[i] + "\n";

        }//fine for promosso/bocciato

        System.out.println(report);// report finale

    }
}
