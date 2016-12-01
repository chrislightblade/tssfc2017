/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez07_giococarte;

/**
 *
 * @author tss
 */
public class Mazzo {


    Carta mazzo[];
    int numcarte; //numero carte mazzo

    // costruttore del mazzo
    public Mazzo(int numcarte) {
        this.numcarte = numcarte;
        // creo e dimensiono l'array mazzo

        mazzo = new Carta[numcarte];
        //creare tot carte e inserirle nel mazzo
        String semicarta[] = {"", "Picche", "Fiori", "Quadri", "Cuori"};
        int valore = 1;
        int seme = 1;
        for (int i = 1; i <= numcarte; i++) {

            //attenzione al numero che dopo 10 va riportato a 1
            //e poi cambi ail seme
            if(valore == 8){
                String nomecarta ="fante di " + semicarta[seme];
            } else { if (valore == 9){
                String nomecarta = "regina di " + semicarta[seme];                
            }else {
                String nomecarta = "re di " + semicarta[seme];
            }
            }    
            String nomecarta = valore + " di " + semicarta[seme];

            Carta carta = new Carta(valore, seme, nomecarta);
            mazzo[i - 1] = carta;
            //incremento il valore
            valore++;
            // valore e seme correnti 
            // se elemento corente sulla decina resett i valori e i semi
            // se sono sul 10 ad esempio rimetto valore a 1 e incremento di uno il seme
            if (i % (numcarte / 4) == 0) {
                seme++;
                valore = 1;
            }

        }

    }

        public Carta[] getMazzo() {
        return mazzo;
    }

   
    public int getNumcarte() {
        return numcarte;
    }

    public Carta getCartaIndex(int i){
    
    Carta c;
    c=mazzo[i];
    return c;
    }
    
    
    public void mischia() {

        //soluziona alla computer
        // con ciclo for di 1000 giri 
        for (int i = 0; i < 2000; i++) {

            //pesco due numeri a caso da 0 a 39
            //e scambio le due carte corrispondenti
            //scambio carte a caso
            //caso1=22;
            //caso2=34;
            // la 22 con 34
            int caso1 = (int) Math.floor(Math.random() * numcarte);
            int caso2 = (int) Math.floor(Math.random() * numcarte);
            //prendo la 22 in mano e sposto la 34 al posto della 22

            Carta cartainmano;
            //prendo in mano la 22
            cartainmano = mazzo[caso1];
            //metto la 34 nella 22
            mazzo[caso1] = mazzo[caso2];
            //metto a posto la cartainmano
            mazzo[caso2] = cartainmano;
            //ok spostate

        }

    }

}
