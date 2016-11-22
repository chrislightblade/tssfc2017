/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez06;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class NewMain {
    
    static Correntista arcc[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*String input = "Fabio Chiesa";//JOptionPane.showInputDialog("inserire nome e cognome");
        String Nome_Cognome = input;
        
        input = "1992";//JOptionPane.showInputDialog("inserire anno di nascita");
        int Anno = Integer.parseInt(input);
        
        //input = JOptionPane.showInputDialog("inserire conto iniziale");
        //double Conto = Integer.parseInt(input);
        
        Correntista Corr1 = new Correntista(Nome_Cognome, Anno);
        
        Corr1.versa_nel_contro(100);
        Corr1.preleva_da_conto(20);
        String output = "";
        output += Corr1.getConto();
        System.out.println("Sul conto vi è un residuo di " + output);*/
        int numcc;
        numcc=Integer.parseInt(JOptionPane.showInputDialog("quanti correntisti?"));
        
        //ciclo per caricare i correntisti
        for(int i=0; i<arcc.length; i++ ){
         String nominativo=JOptionPane.showInputDialog("#" + (i+1) + " nome?");
         int anno =Integer.parseInt(JOptionPane.showInputDialog("anno nascita?"));
         Correntista cc = new Correntista(nominativo, anno);
         double conto=Double.parseDouble(JOptionPane.showInputDialog("Quanto versi?"));
         cc.setConto(conto);
         arcc[i] =cc;
        }
        
        presentacc();
        }
    }
    

