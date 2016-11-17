/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez03;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author tss
 */
public class Tplez03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choose;
        String CHOOSE = JOptionPane.showInputDialog("inserisci l'esercizio da svolgere");       
        choose = Integer.parseInt(CHOOSE);
        switch (choose) {

            case 1:

                String N1 = JOptionPane.showInputDialog("Inserisci un valore da verificare se pari o dispari");
                double N = Double.parseDouble(N1);
                double r = N % 2;
                boolean raccomandato = true;
                r = Math.floor(r * 10);
                r = r / 10;

                if (r != 0) {
                    JOptionPane.showMessageDialog(null, "il resto della divisione è : " + r + "\n perciò il numero è dispari");
                } else {
                    JOptionPane.showMessageDialog(null, "il resto della divisione è : " + r + "\n perciò il numero è pari");

                }
                break;

            case 2:

                double ris = 0;
                double A = Double.parseDouble(JOptionPane.showInputDialog("inserisci il valore di A"));
                double B = Double.parseDouble(JOptionPane.showInputDialog("inserisci il valore di B"));
                if (A > B) {
                    ris = A - B;
                } else {
                    ris = B - A;
                }
                break;

            case 3:

                A = Double.parseDouble(JOptionPane.showInputDialog("inserisci il valore di A"));
                B = Double.parseDouble(JOptionPane.showInputDialog("inserisci il valore di B"));
                if (A < B) {
                    JOptionPane.showMessageDialog(null, A + " è più piccolo di " + B);
                }
                if (A > B) {
                    JOptionPane.showMessageDialog(null, B + " è più piccolo di " + A);
                }
                if (A == B) {
                    JOptionPane.showMessageDialog(null, B + " e " + A + " sono uguali");

                }
                break;

            case 4: //non funziona, problemi col ciclo di controllo

                int i = 0;
                A = Double.parseDouble(JOptionPane.showInputDialog("inserisci il valore di A"));
                B = Double.parseDouble(JOptionPane.showInputDialog("inserisci il valore di B"));
                double C = Double.parseDouble(JOptionPane.showInputDialog("inserisci il valore di C"));
                System.out.println(A +" "+ B +" "+ C + "\n");
                double A1 = 0, B1 = 0, C1 = 0;
                System.out.println(A +" "+ B +" "+ C + "\n");
                 

                if (A < B) {// a=1 || 2
                    if (A < C) {//a=1
                        A1 = A;
                                        
                        if (B < C) {//b=2
                            B1 = B;
                            C1 = C;
                        } else {//a=2
                            A1 = A;
                            B1 = C;
                            C1 = B;
                        }
                    } else {
                        A1 = C;
                        B1 = A;
                        C1 = B;
                    }
                }
                

                if (A > B) {//a=2 || a=3
                    if (A < C) {//a=2
                        C1 = C;
                        A1 = B;
                        B1 = A;
                        } else {
                        if (B > C) {//b=2
                            A1 = C;
                            B1 = B;
                        } else {//b=1
                            A1 = B;
                            B1 = C;
                        }
                    }
                    }
                
                    if (A > B && A > C) {/*a=3*/
                        C1 = A;
                        if (B < C) {
                            A1 = B;
                            B1 = C;
                        } else {
                            A1 = C;
                            B1 = B;
                        }
                    }
        

                JOptionPane.showMessageDialog(null, A1 + " " + B1 + " " + C1);
                break;
                
        }//switch
        

    }//main

}
