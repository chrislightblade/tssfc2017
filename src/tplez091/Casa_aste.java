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

    //ottengo una stringa con le persone iscritte all'asta
    public String getPersone() {
        String report = "Le seguenti persone sono iscritte all'asta\n";
        for (int i = 0; i < persone.size(); i++) {
            report += persone.get(i).getNumero() + "° " + persone.get(i).getNome() + "\n";
        }
        return report;
    }

    //funzione per aggiungere una persona alle aste passando un oggetto persona
    public void setPersone(Persona personaNuova) {
        this.persone.add(personaNuova);
    }

    //stampa in string gli oggeti messi all'asta
    public String getOggettiAllAsta() {
        String report = "I seguenti oggetti sono all'asta:\n";
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            report += (i + 1) + "°: " + oggettiAllAsta.getNomeOggetto(i) + " valore d'asta: " + oggettiAllAsta.getOfferta(i) + "\nOfferente migliore: " + oggettiAllAsta.getMaggioreOfferente(i) + "\n";
        }
        return report;
    }

    //in output l'elenco degli oggetti all'asta
    public String getNomeOggettiAllAsta() {
        String report = "I seguenti oggetti sono all'asta:\n";
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            report += (i + 1) + "°: " + oggettiAllAsta.getNomeOggetto(i) + "\n";
        }
        return report;
    }

    //stampa in output gli oggetti all'asta e consente di inserirne di nuovi
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

    //asta in cui tutti gli oggetti sono espostii e la singola persona può effettuare una offerta 
    //il battitore ha diversi poteri, tra cui aggiungere oggetti, aggiungere persone, chiudere l'asta 
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

            String report = "L'offerta non è valida, più bassa dell'ultimo offerente, cioè " + oggettiAllAsta.getOfferta(input2 - 1);//accetta nello storico l'offerta solo nel caso in cui sia superiore al valore attuale dell'oggetto
            if (input3 > oggettiAllAsta.getOfferta(input2 - 1)) {
                report = "Offerta avvenuta con successo";
                oggettiAllAsta.setMaggioreOfferente(input2 - 1, persone.get(input).getNome());
                oggettiAllAsta.setOfferta(input2 - 1, input3);
                oggettiAllAsta.setOfferte(input2 - 1, persone.get(input).getNome(), input3);
                JOptionPane.showConfirmDialog(null, report);
            } else {
                JOptionPane.showConfirmDialog(null, report);
            }
        }
        return false;
    }

    public void offertaChiusa() {//asta in cui l'offerta è nascosta e vince quella più alta
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            oggettiAllAsta.setOfferta(i, 0);
        }
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            for (int j = 1; j < persone.size(); j++) {
                int input = (int) Math.floor(Math.random() * 30);;
                /*String input2 = JOptionPane.showInputDialog(getNomeOggettiAllAsta() + "\n\n" + oggettiAllAsta.get(i).getNome() + "\n" + persone.get(j).getNome() + "\nQuale offerta desidera fare questa persona?");
                if(!input2.equals("")){
                input = Integer.parseInt(input2); 
                }*/
                if (input > 0) {
                    oggettiAllAsta.setOfferte(i, persone.get(j).getNome(), input);
                    if (input > oggettiAllAsta.getOfferta(i)) {
                        oggettiAllAsta.setOfferta(i, input);
                        oggettiAllAsta.setMaggioreOfferente(i, persone.get(j).getNome());
                    }
                }
            }
        }
    }

    public void astaUnaAllaVolta() {//un singolo oggetto all'asta alla volta, in cui chiunque può fare una offerta
        int controllo = 0;
        String report = "", input2 = "";
        int input = 0;
        while (controllo < oggettiAllAsta.getSizeOggettiAllAsta()) {
            if (oggettiAllAsta.getMaggioreOfferente(controllo).equalsIgnoreCase("nessuno")) {
                report = "E' in vendita l'oggetto '" + oggettiAllAsta.getNomeOggetto(controllo) + "' al prezzo di " + oggettiAllAsta.getOfferta(controllo) + "\n";
            } else {
                report = "E' in vendita l'oggetto '" + oggettiAllAsta.getNomeOggetto(controllo) + "' al prezzo di " + oggettiAllAsta.getOfferta(controllo) + "\nIl miglior offerente è di " + oggettiAllAsta.getMaggioreOfferente(controllo) + "\n";
            }

            boolean verifica = false;
            while (verifica == false) {
                input = 0;
                input2 = JOptionPane.showInputDialog(report + getPersone() + "\nQuale persona desidera fare un'offerta?\nAltrimenti digitare zero o premere invio");

                try {
                    if (input2.equalsIgnoreCase("") || input2.equalsIgnoreCase("0")) {//lo zero passa al battitore che passa all'oggetto successivo
                        verifica = true;
                    } else {
                        input = Integer.parseInt(input2);
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
                report = "Siccome a nessuno interessa, passiamo all'oggetto successivo";
                JOptionPane.showMessageDialog(null, report);
                controllo++;
            } else {

                int input3 = 0;
                verifica = false;
                while (verifica == false) {
                    input3 = 0;
                    input2 = JOptionPane.showInputDialog(persone.get(input).getNome() + " quanto desidera offrire per " + oggettiAllAsta.getNomeOggetto(controllo));

                    try {
                        if (!input2.equalsIgnoreCase("")) {
                            input3 = Integer.parseInt(input2);
                            verifica = true;
                        }
                    } catch (Exception error) {
                        JOptionPane.showMessageDialog(null, "non hai inserito dei valori validi");
                    }
                }//fine while controllo inserimento

                report = "L'offerta non è valida, più bassa dell'ultimo offerente, cioè " + oggettiAllAsta.getOfferta(controllo);
                if (input3 > oggettiAllAsta.getOfferta(controllo)) {
                    report = "Offerta avvenuta con successo";
                    oggettiAllAsta.setMaggioreOfferente(controllo, persone.get(input).getNome());
                    oggettiAllAsta.setOfferta(controllo, input3);
                    oggettiAllAsta.setOfferte(controllo, persone.get(input).getNome(), input3);
                    JOptionPane.showConfirmDialog(null, report);
                } else {
                    JOptionPane.showConfirmDialog(null, report);
                }
            }
        }
        chiudiAsta();
    }

    public boolean azioniBattitore() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Cosa desideri fare?\n1.Inserisci un nuovo oggetto all'asta.\n2.Chiudi l'asta.\n3.Inserisci un nuovo giocatore"
                + "3.Aggiungi un tizio nuovo.\n4.VIsualizza storico di un oggetto"));
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
                return false;

            case 4:
                stampaStorico();
        }
        return false;
    }

    public void chiudiAsta() {
        String report = "Aste Chiuse! Resoconto giornata:\n";
        for (int i = 0; i < oggettiAllAsta.getSizeOggettiAllAsta(); i++) {
            for (int j = 0; j < persone.size(); j++) {

                if (oggettiAllAsta.getMaggioreOfferente(i).equalsIgnoreCase(persone.get(j).getNome())) {
                    report += oggettiAllAsta.getNomeOggetto(i) + " valore d'asta: " + oggettiAllAsta.getOfferta(i) + "\nOfferente migliore: " + oggettiAllAsta.getMaggioreOfferente(i) + "\n";
                    report += "CONGRATULAZIONI!\n";
                    Oggetto oggetto = oggettiAllAsta.getOggetto(i);
                    persone.get(j).addOggetto(oggetto);
                }
            }
        }
        JOptionPane.showConfirmDialog(null, report);
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
