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
public class Tplez01a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dichiarare le variabili che utilizzeremo per il programma
        //costo del biglietto
        String costo_biglietto2 = JOptionPane.showInputDialog("inserire costo biglietto");
        double costo_biglietto = Double.parseDouble(costo_biglietto2);
        System.out.println("costo del biglietto:" + costo_biglietto);
        //raggio del pallone 
        String raggio2 = JOptionPane.showInputDialog("insere raggio sfera");
        double raggio = Double.parseDouble(raggio2);
        System.out.println("raggio della sfera:" + raggio);
        //costo riscaldamento al metro cubo
        String costo_mcubo2 = JOptionPane.showInputDialog("inserire costo riscaldamento");
        double costo_mcubo = Double.parseDouble(costo_mcubo2);
        System.out.println("costo riscaldamento al metro cubo:" + costo_mcubo);
        //asegno una costante, uso final poichè dopo la prima assegnazione non me ne servono altre
        final double PGRECO = 3.1415;
        //calcolo l'area del cerchio, superficie per le persone e le sedie
        double area = PGRECO * raggio * raggio;
        System.out.println("area:" + area);
        //calcolo il volume della semi-sfera, stanza per le persone
        double volume_semisfera = PGRECO * Math.pow(raggio, 3) * 2 / 3;
        System.out.println("volume:" + volume_semisfera);
        //definisco quante persone posso stare all'interno della semisfera per legge (tronco la virgola nel valore del volumme della semisfera)
        double max_persone = Math.floor(area);
        System.out.println("il numero di persone massimo:" + max_persone);
        //calcolo quanto costa il riscaldamento in funzione del volume
        double costi = volume_semisfera * costo_mcubo;
        //calcolo0 quanto entra con i biglietti
        double ricavi = max_persone * costo_biglietto;
        //calcolo il guadagno finale
        double utili = ricavi - costi;
        //stampo il valore degli utili
        System.out.println("il guadagno totale è:" + utili);

        //prepara output
        String report;
        report = "Report Finale\n";
        report = report + "raggio della sfera:" + raggio + "\n";
        report = report + "costo del biglietto:" + costo_biglietto + "\n";
        report = report + "costo riscaldamento per metro cubo:" + costo_mcubo + "\n";
        report = report + "massimo persone:" + max_persone + "\n";
        report = report + "volume:" + volume_semisfera + "\n";
        report = report + "costi:" + costi + "\n";
        report = report + "ricavi:" + ricavi + "\n";
        report = report + "utili:" + utili + "\n";
        report = report + "area:" + area + "\n";
        report = report + "----------\n" + new Date() + "\n";
        JOptionPane.showMessageDialog(null, report);

    }

}
