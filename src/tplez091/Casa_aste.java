/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez091;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Casa_aste {

    
    private ArrayList<String> articoli;
    private ArrayList<Persona> persone;
    private TavolateAste oggettiAllAsta;

    public Casa_aste() {

        oggettiAllAsta = new TavolateAste();
        articoli = new ArrayList<String>();
        persone = new ArrayList<Persona>();
        Persona battitore = new Persona("Battitore d'Asta");
        persone.add(battitore);
        articoli.add("Vaso Ming");
        articoli.add("Posacenere Russo");
        articoli.add("Ago d'oro Cinese");
        for (int i = 0; i < articoli.size(); i++) {
            int valore = (int) Math.floor(Math.random() * 30);
            Oggetto oggetto = new Oggetto(articoli.get(i), valore);
            oggettiAllAsta.addOggetto(oggetto);
        }
    }

    public String getPersone() {
        String report = "Le seguenti persone sono iscritte all'asta\n";
        for (int i = 0; i < persone.size(); i++) {
            report += persone.get(i).getNumero() + "° " + persone.get(i).getNome() + "\n";
        }
        return report;
    }

    public void setPersone(Persona personaNuova) {
        this.persone.add(personaNuova);
    }

    public String getOggettiAllAsta() {
        String report = "I seguenti oggetti sono all'asta:\n";
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            report += (i + 1) + "°: " + oggettiAllAsta.getNomeOggetto(i) + " valore d'asta: " + oggettiAllAsta.getOfferta(i) + "\nOfferente migliore: " + oggettiAllAsta.getMaggioreOfferente(i) + "\n";
        }
        return report;
    }

    public String getNomeOggettiAllAsta() {
        String report = "I seguenti oggetti sono all'asta:\n";
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            report += (i + 1) + "°: " + oggettiAllAsta.getNomeOggetto(i) + "\n";
        }
        return report;
    }

    public void setOggettiAllAsta() {
        String report = "I seguenti oggetti sono all'asta:\n";
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            report += oggettiAllAsta.getNomeOggetto(i) + " valore d'asta: " + oggettiAllAsta.getMaggioreOfferente(i) + "\n";
        }
        String input = JOptionPane.showInputDialog(report + "\nQuale articolo desideri inserire?");
        int input2 = 0;
        boolean verifica = false;
        while (verifica == false) {
            input2 = 0;
            String report2 = JOptionPane.showInputDialog(input + ": A quale valore?");

            try {
                if (report2.equalsIgnoreCase("")) {
                    verifica = true;
                } else {
                    input2 = Integer.parseInt(report2);
                    verifica = true;
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "non hai inserito dei valori validi");
            }
        }//fine while controllo inserimento       

        Oggetto oggetto = new Oggetto(input, input2);
        oggettiAllAsta.addOggetto(oggetto);
    }

    public boolean faiOfferta() {
        int input = 0;
        boolean verifica = false;
        while (verifica == false) {
            input = 0;
            String report2 = JOptionPane.showInputDialog(getOggettiAllAsta() + "\n" + getPersone() + "\nQuale persona desidera fare un'offerta?");

            try {
                if (report2.equalsIgnoreCase("")) {
                    verifica = true;
                } else {
                    input = Integer.parseInt(report2);
                    if (input < persone.size()) {
                        verifica = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "non hai inserito dei valori validi");
                    }
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "non hai inserito dei valori validi");
            }
        }//fine while controllo inserimento        

        if (input == 0) {
            if (azioniBattitore() == true) {
                return true;
            }
        } else {

            int input2 = 0;
            verifica = false;
            while (verifica == false) {
                input2 = 0;
                String report2 = JOptionPane.showInputDialog(getOggettiAllAsta() + "\n" + persone.get(input).getNome() + " per quale oggetto desidera fare un'offerta?");

                try {
                    if (!report2.equalsIgnoreCase("")) {
                        input2 = Integer.parseInt(report2);
                        if (input2 <= oggettiAllAsta.getSizeOggettiAllAsta() && input != 0) {
                            verifica = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "non hai inserito dei valori validi");
                        }
                    }
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "non hai inserito dei valori validi");
                }
            }//fine while controllo inserimento 

            int input3 = 0;
            verifica = false;
            while (verifica == false) {
                input3 = 0;
                String report2 = JOptionPane.showInputDialog(persone.get(input).getNome() + " quanto desidera offrire per " + oggettiAllAsta.getNomeOggetto(input2 - 1));

                try {
                    if (!report2.equalsIgnoreCase("")) {
                        input3 = Integer.parseInt(report2);
                        verifica = true;
                    }
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "non hai inserito dei valori validi");
                }
            }//fine while controllo inserimento

            String report = "L'offerta non è valida, più bassa dell'ultimo offerente, cioè " + oggettiAllAsta.getOfferta(input2 - 1);
            if (input3 > oggettiAllAsta.getOfferta(input2 - 1)) {
                report = "Offerta avvenuta con successo";
                oggettiAllAsta.get(input2 - 1).setMaggioreOfferente(persone.get(input).getNome());
                oggettiAllAsta.get(input2 - 1).setOfferta(input3);
                oggettiAllAsta.get(input2 - 1).setOfferte(persone.get(input).getNome(), input3);
                JOptionPane.showConfirmDialog(null, report);
            } else {
                JOptionPane.showConfirmDialog(null, report);
            }
        }
        return false;
    }

    public void offertaChiusa() {
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            oggettiAllAsta.get(i).setOfferta(0);
        }
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            for (int j = 1; j < persone.size(); j++) {
                int input = (int) Math.floor(Math.random() * 30);;
                /*String input2 = JOptionPane.showInputDialog(getNomeOggettiAllAsta() + "\n\n" + oggettiAllAsta.get(i).getNome() + "\n" + persone.get(j).getNome() + "\nQuale offerta desidera fare questa persona?");
                if(!input2.equals("")){
                input = Integer.parseInt(input2); 
                }*/
                if (input > 0) {
                    oggettiAllAsta.get(i).setOfferte(persone.get(j).getNome(), input);
                    if (input > oggettiAllAsta.getOfferta(i)) {
                        oggettiAllAsta.get(i).setOfferta(input);
                        oggettiAllAsta.get(i).setMaggioreOfferente(persone.get(j).getNome());
                    }
                }
            }
        }
    }

    public boolean azioniBattitore() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Cosa desideri fare?\n1.Inserisci un nuovo oggetto all'asta.\n2.Chiudi l'asta.\n3.Inserisci un nuovo giocatore"));
        switch (input) {
            case 1:
                setOggettiAllAsta();
                return false;

            case 2:
                return true;

            case 3:
                String input2 = JOptionPane.showInputDialog(getPersone() + "\nQuale Giocatore desideri inserire?");
                Persona p = new Persona(input2);
                persone.add(p);
        }
        return false;
    }

    public void chiudiAsta() {
        String report = "Aste Chiuse! Resoconto giornata:\n";
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            if (oggettiAllAsta.getMaggioreOfferente(i).equalsIgnoreCase("nessuno") == false) {
                report += oggettiAllAsta.getNomeOggetto(i) + " valore d'asta: " + oggettiAllAsta.getOfferta(i) + "\nOfferente migliore: " + oggettiAllAsta.getMaggioreOfferente(i) + "\n";
                report += "CONGRATULAZIONI!\n";
            }
        }
        JOptionPane.showConfirmDialog(null, report);
    }

    public void scegliAsta() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Quale tipo di asta desideri applicare?\n1.Asta a offerta singola nascosta\n2.Asta libera."));
        switch (input) {
            case 2:
                boolean control = false;
                while (control == false) {
                    control = faiOfferta();
                }
                break;

            case 1:
                offertaChiusa();
                break;
        }
    }

    public void stampaStorico() {

        boolean control = false;
        while (control == false) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(getOggettiAllAsta() + " per quale oggetto desidera stampare lo storico?\n0.Exit"));
            if (input == 0) {
                control = true;
            } else {

                JOptionPane.showConfirmDialog(null, oggettiAllAsta.getReportOfferte(input - 1));
            }
        }

    }
}
