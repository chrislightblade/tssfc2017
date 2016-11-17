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
public class PotenzeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String input = JOptionPane.showInputDialog("base");
        int base = getQuanti("dimmi la base", 1, 12);

        String input = JOptionPane.showInputDialog("exp");
        int exp = Integer.parseInt(input);

        int potenze[] = new int[exp];
        //int risultato = 1; //base alla 0 
        //esempio 2 base 3 exp
        //2 4 8 16 etc
        // 1*2=2??? - 2*2=4 - 2*2*2 4*2=8 - 8*2=16 - 16*2=32
        // primo giro base*1  = 2 (1 e' il risutato di partenza
        // secondo giro risultato precedente*base 2* base = 4
        // terzo giro risultato precedente*base 4* base =8
        //quarto giro etc etc

        //primo giro strano perche' ci ficco labase e basta
        potenze[0] = base;

        for (int i = 1; i < exp; i++) {
            //risultato = risultato * base;
            potenze[i] = potenze[i - 1] * base;
        }
        
        for (int i = 1; i <= exp; i++) {
            //risultato = risultato * base;
            potenze[i] = potenza(base,i);
        }

        
        //output tramite ciclo for
        String report = "";
        for (int i = 0; i < exp; i++) {
            report += potenze[i] + "\n";
        }
        System.out.println(report);
        int ris=potenza(base, exp);
        System.out.println("calcolo con potenza: " + ris);

    }

    static int potenza(int b, int e) {
        int ris = 1;
        for (int i = 0; i < e; i++) {
            ris = ris * b;
        }
        return ris;
    }

    static int getQuanti(String titolo, int min, int max) {
        boolean ok = false;
        int quanti = 0;
        while (ok == false) {
            String input = JOptionPane.showInputDialog(titolo);
            try {
                quanti = Integer.parseInt(input);
                if (quanti >= min && quanti <= max) {
                    ok = true;
                }
            } catch (Exception e) {
                ok = false;
            }
            if (!ok) {
                JOptionPane.showMessageDialog(null, "dati errati o fuori range(" + min + ".." + max + ")");
            }
        } //while finito
        return quanti;
    }

}
