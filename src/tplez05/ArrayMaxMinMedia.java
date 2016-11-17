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
public class ArrayMaxMinMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tot = 0;

        String input;
        double media = 0;
        int max = 0;
        int min = 11;
        int sommavoti = 0;
        String alunno_maggiore = "";
        String alunno_minore = "";
        String nomemax = "";
        int posMax = 0;

        input = JOptionPane.showInputDialog("quanti persone hanno fatto il test");

        tot = Integer.parseInt(input);
        // so in tot quanto siono

        //creo due array separati per caricarci i dati nomi e voti corrispondenti
        String nomi[] = new String[tot]; //gli array vengono dichiarati dopo l'assegnazione delle altre variabili

        int voti[] = new int[tot];
        //passo al caricamento degli array 
        for (int i = 0; i < nomi.length; i++) {

            input = JOptionPane.showInputDialog("inserisci il nome dell'alunno");
            nomi[i] = input;

            input = JOptionPane.showInputDialog("qual'è il voto del test");
            voti[i] = Integer.parseInt(input);

        } // fine caricamento dati

        /*//inizio elaborazione dati
        for (int i = 0; i < nomi.length; i++) {

            sommavoti = sommavoti + voti[i];

            if (voti[i] > max) {

                max = voti[i];
                alunno_maggiore = nomi[i];

            }
            if (voti[i] < min) {

                min = voti[i];
                alunno_minore = nomi[i];

            }

        } //fine ciclo elanorazione dati
        //calcolo media in sommavoti !!! risparmio una variabile ma si capisce poco
        media = sommavoti / tot;
        //posso passare a pensare all'output*/
        //creo una nuova versione che utilizzi i metodi
        //creo un metodo per trovare il massimo tra diversi voti
        //a max assegno il numero che mi ritorna il metodo getMax che vuole come parametro l'array in cui cercare
        max = getMax(voti);
        min = getMin(voti);
        media = getMedia(voti);
        //cerco la posizione del voto migliore
        posMax = getIndexmax(voti);
        //poi uso la posizione per cercare il nome
        nomemax = nomi[posMax];
        

        System.out.println("il studente col voto maggiore è: " + nomemax + "  voto: " + max);
        System.out.println("il studente col voto minore è: " + alunno_minore + "  voto: " + min);
        System.out.println("la media dei voti è: " + media);
    }

    //creo metodo: uso STATIC, poi che tipo di dati deve ritornare (es numero intero int, oppure frase String, ...)
    //poi il nome del metodo, cioè dell'azione che svolge (verbo in minuscolo e oggetto con la maiuscola)
    //obbligatorie le parentesi contenenti i parametri ( nel caso di 0 parametri, mettere le parentesi e lasciare vuoto dentro)
    // ad esempio getMax(int valori[]), oppure una frase getMax(String frase[]);
    //oppure più paramentri es. getMax(int a, int b, ...)
    //poi inserire le graffe
    //inserire per comodità subito return seguito dal parametro da ritornare (es. return ciao; [in String])
    //per completezza e comodità, inizializzare come prima cosa la variabile del return;
    
    
    static int getMax(int[] valori) {

        int risultato = 0;
        int max = 0;
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > risultato) {
                risultato = valori[i];
            }
        }//fine ciclo elaborazione dati

        return risultato;
    }

    static int getMin(int[] valori) {

        int risultato = 0;
        //int min = 999999999;sistema non elegante per inizializzare min
        int min = valori[0];//metodo più elegante per inizializzare min, aasumendo che il primo voto sia il più basso (o minore)
        for (int i = 1; i < valori.length; i++) {//posso iniziare con i = 1 siccome valori[0] so che non è strettamente maggiore di min
            if (valori[i] < risultato) {
                risultato = valori[i];
            }
        }//fine ciclo elaborazione dati

        return risultato;
    }

    static double getMedia(int[] valori) {
        
        double risultato = 0;
        int i = 0;
        //
        for (i = 0; i < valori.length; i++) {//posso iniziare con i = 1 siccome valori[0] so che non è strettamente maggiore di min
            risultato += valori[i];
        }//fine ciclo elaborazione dati
        
        risultato = (risultato / (i+1));

        return risultato;
    }

    static int getIndexmax(int valori[]) {//sputerò fuori il valore della posizione dello studente con il voto più alto, che è anche la posizione ddel voto migliore sulla stringa
        int indexmax = 0;
        int risultato = 0;
        int max = 0;
        
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > risultato) {//trovo il voto più alto e mi salvo la posizione (inDex) del voto migliore
                risultato = valori[i];
                indexmax = i;
            }
            
        }//fine ciclo elaborazione dati
        
        return indexmax;
    }

}
