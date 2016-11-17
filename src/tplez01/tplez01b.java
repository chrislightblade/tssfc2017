/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class tplez01b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dichiarare le variabili che utilizzeremo per il programma
        double raggio;
        double area;
        double volume_semisfera;
        double max_persone;
        double costi;
        double ricavi;
        double utili;
        final double PGRECO = 3.1415;
        String report = null;
        String costo_biglietto2 = JOptionPane.showInputDialog("inserire costo biglietto");
        double costo_biglietto = Double.parseDouble(costo_biglietto2);
        System.out.println("costo del biglietto:" + costo_biglietto);
        //costo riscaldamento al metro cubo
        String costo_mcubo2 = JOptionPane.showInputDialog("inserire costo riscaldamento");
        double costo_mcubo = Double.parseDouble(costo_mcubo2);
        System.out.println("costo riscaldamento al metro cubo:" + costo_mcubo);
        //asegno una costante, uso final poichè dopo la prima assegnazione non me ne servono altre

        //fine imput dati
        
        //inizio casi
        report = calcolautileperraggio(6, report, costo_mcubo, costo_biglietto);
        report = report + "\n" + calcolautileperraggio(8, report, costo_mcubo, costo_biglietto);
        report = report + "\n" + calcolautileperraggio(10, report, costo_mcubo, costo_biglietto);
        report = report + "\n" + calcolautileperraggio(12, report, costo_mcubo, costo_biglietto);
        report = report + "\n" + calcolautileperraggio(15, report, costo_mcubo, costo_biglietto);
        report = report + "\n" + "----------\n" + new Date() + "\n";
        JOptionPane.showMessageDialog(null, report);
    }

    public static String calcolautileperraggio(double raggio, String s, double cmc, double cbigl) {

        final double PGRECO = 3.1415;
        System.out.println("raggio della sfera:" + raggio);

        //calcolo l'area del cerchio, superficie per le persone e le sedie
        double area = PGRECO * raggio * raggio;
        System.out.println("area:" + area);
        //calcolo il volume della semi-sfera, stanza per le persone
        double volume_semisfera = PGRECO * Math.pow(raggio, 3) * 2 / 3;
        volume_semisfera = Math.floor(volume_semisfera);
        System.out.println("volume:" + volume_semisfera);
        //definisco quante persone posso stare all'interno della semisfera per legge (tronco la virgola nel valore del volumme della semisfera)
        double max_persone = Math.floor(area);
        System.out.println("il numero di persone massimo:" + max_persone);

        //calcolo quanto costa il riscaldamento in funzione del volume
        double costi = volume_semisfera * cmc;
        costi = Math.floor(costi);
        //calcolo0 quanto entra con i biglietti
        double ricavi = max_persone * cbigl;
        ricavi = Math.floor(ricavi);
        //calcolo il guadagno finale
        double utili = ricavi - costi;
        ricavi = Math.floor(ricavi);
        //stampo il valore degli utili
        System.out.println("il guadagno totale è:" + utili + "\n");

        //prepara output
        String report = "Report Finale\n";
        report = report + "raggio della sfera:" + raggio + "\n";
        report = report + "massimo persone:" + max_persone + "\t";
        report = report + " volume:" + volume_semisfera + "\t";
        report = report + " costi:" + costi + "\t";
        report = report + " ricavi:" + ricavi + "\t";
        report = report + " utili:" + utili + "\n";
        
        //mando indietro il report aggiornato con la nuova riga
        
        return report;

    }

}
